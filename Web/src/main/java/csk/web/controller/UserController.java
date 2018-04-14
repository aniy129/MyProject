package csk.web.controller;

import com.google.gson.Gson;
import csk.entity.database.User;
import csk.service.interfaces.IUserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Inject
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/all")
    public String getAll() {
        List<User> all = userService.getAll();
        return "用户数量为" + all.size();
    }

    /*
     * 分页搜索 使用参数 /user/search?paging.page=2&paging.size=2&paging.sort=id
     * 前缀paging在 ServletContextConfiguration addArgumentResolvers 参数配置中
     * */
    @ResponseBody
    @RequestMapping("/search")
    public String search(Pageable pageable) {
        //Pageable pageable = new PageRequest(1, 1, Sort.Direction.DESC, "Id");
        //手动创建Pageable
        List<User> userList = userService.search(pageable);
        Gson gson = new Gson();
        String json = gson.toJson(userList);
        return json;
    }
}
