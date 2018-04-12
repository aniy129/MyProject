package csk.web.controller;

import csk.entity.database.User;
import csk.service.interfaces.IUserService;
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
        List<User> all = userService.getAll();
        return "用户数量为"+ all.size();
    }
}
