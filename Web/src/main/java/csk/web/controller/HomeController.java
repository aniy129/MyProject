package csk.web.controller;

import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
import csk.web.common.LocaleUntil;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Inject
    MessageSource messageSource;

    @Inject
    IAdministratorsService administratorsService;

    @RequestMapping(value = {"/home/index", "/home", "/"}, method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if (user!=null){
            return "redirect:/main/index";
        }
        return "home/index";
    }

    @RequestMapping(value = {"/home/index", "/home", "/"}, method = RequestMethod.POST)
    public String login(String userName, String password, Model model, HttpServletRequest request) {
        Administrators administrators = administratorsService.login(userName);
        if (administrators != null && administrators.getPwd().equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("user",administrators);
            return "redirect:/main/index";
        } else {
            model.addAttribute("userName", userName);
            model.addAttribute("password", password);
            String msg = messageSource.getMessage("home.index.login-msg", null, LocaleUntil.getLocale(request));
            model.addAttribute("msg", msg);
            return "home/index";
        }
    }


}
