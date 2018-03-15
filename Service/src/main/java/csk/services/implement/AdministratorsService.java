package csk.services.implement;

import csk.dal.mybatis.IAdministratorsDAL;
import csk.entity.database.Administrators;
import csk.service.interfaces.IAdministratorsService;
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
}
