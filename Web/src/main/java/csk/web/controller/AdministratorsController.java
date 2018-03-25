package csk.web.controller;

import csk.service.interfaces.IAdministratorsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@RequestMapping("/administrator")
@Controller
public class AdministratorsController {
    @Inject
    private IAdministratorsService bll;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        Integer count= bll.getAdmins().size();
        return count.toString()+" hello";
    }
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(){
        return "/administrator/create";
    }
}
