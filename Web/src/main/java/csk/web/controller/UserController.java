package csk.web.controller;

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
    public String getAll(){
        Pageable pageable=new PageRequest(1,1,Sort.Direction.DESC,"Id");

        List<User> all = userService.getAll();
        return "用户数量为"+ all.size();
    }
}
