package csk.services.implement;

import csk.dal.mybatis.IAdministratorsDAL;
import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdministratorsService implements IAdministratorsService {
    @Inject
    IAdministratorsDAL dal;

    public List<Administrators> getAdmins() {
        return dal.getAdmins();
    }

    @Override
    public Administrators login(String userName) {
        return  dal.login(userName);
    }

    @Scheduled(fixedDelay = 6_0000L, initialDelay = 5_000L)
    public void Schedule() {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("定时调度任务开始执行: " + str);
    }
}
