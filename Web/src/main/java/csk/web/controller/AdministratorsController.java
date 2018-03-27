package csk.web.controller;

import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/administrator")
@Controller
public class AdministratorsController {
    @Inject
    private IAdministratorsService bll;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        Integer count = bll.getAdmins().size();
        return count.toString() + "创建成功";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create() {
        return "/administrator/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createAccount(@Valid Administrators administrators, Errors errors, Model model) {
        boolean isError = errors.hasErrors();
        if (isError) {
            Map<String,String> map=new HashMap<>();
            for (ObjectError error : errors.getAllErrors()) {
                map.put(((FieldError) error).getField(), error.getDefaultMessage());
                //model.addAttribute(((FieldError) error).getField(), error.getDefaultMessage());
                System.out.println(((FieldError) error).getField()+" : "+ error.getDefaultMessage());
            }
            model.addAllAttributes(map);
            model.addAttribute("admin",administrators);
            return "/administrator/create";
        }
        return "redirect:/administrator/index";
    }
}
