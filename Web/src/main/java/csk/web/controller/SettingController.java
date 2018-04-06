package csk.web.controller;

import csk.entity.database.Administrators;
import csk.entity.database.Setting;
import csk.service.interfaces.ISettingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@RequestMapping("/setting")
@Controller
public class SettingController {
    private Logger logger = LogManager.getLogger();
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

    @RequestMapping("/tran")
    @ResponseBody
    public String transaction(boolean isException) {
        Setting setting = new Setting();
        setting.setDescription("我的事务测试");
        setting.setValue("1000");
        setting.setName("transaction");

        Administrators administrators=new Administrators();
        administrators.setCode(UUID.randomUUID().toString());
        administrators.setEmail("test@163.com");
        administrators.setName("事务测试admin");
        administrators.setPhone("13800138000");
        administrators.setPwd("123456");
        administrators.setState(1);
        administrators.setUserName("admin");
        administrators.setRegTime(Timestamp.from(Instant.now()));
        try {
            bll.addSettingAndAdministrator(setting,administrators,isException);
        } catch (Exception e) {
          //  e.printStackTrace();
            logger.error(e.getMessage(),e);
            return  "已回滚";
        }
        return  "事务提交成功";
    }
}
