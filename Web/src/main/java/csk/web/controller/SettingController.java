package csk.web.controller;

import com.fasterxml.jackson.databind.JsonSerializable;
import csk.entity.database.Setting;
import csk.service.interfaces.ISettingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@RequestMapping("/setting")
@Controller
public class SettingController {
    @Inject
    ISettingService bll;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        Setting setting = bll.get(1);
       return setting.getDescription();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        Setting setting = new Setting();
        setting.setDescription("我的测试");
        setting.setValue("100");
        setting.setName("testAdd");
        bll.add(setting);
        return  "ok";
    }
}
