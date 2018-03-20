package csk.services.implement;

import csk.dal.mybatis.IAdministratorsDAL;
import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class AdministratorsService implements IAdministratorsService {
    @Inject
    IAdministratorsDAL dal;
    public List<Administrators> getAdmins() {
        return dal.getAdmins();
    }
    @Scheduled(fixedDelay = 1_000L, initialDelay = 5_000L)
    public void Schedule(){
        System.out.println("定时调度任务开始执行");
    }
}
