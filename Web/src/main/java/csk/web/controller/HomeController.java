package csk.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        int x=5%3;
        return  Integer.toString(x);
    }
}
