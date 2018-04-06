package csk.services.implement;

import csk.dal.jpa.ISettingDAL;
import csk.entity.database.Administrators;
import csk.entity.database.Setting;
import csk.service.interfaces.ISettingService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class SettingService implements ISettingService {
    @Inject
    private ISettingDAL dal;

    @Override
    public Setting get(long id) {
        return dal.get(id);
    }

    @Override
    public void add(Setting setting) {
        dal.add(setting);
    }

    @Override
    public List<Setting> getAll() {
        return  dal.getAll();
    }

    @Override
    public void addSettingAndAdministrator(Setting setting, Administrators administrators, boolean isException) throws Exception {
        dal.addSettingAndAdministrator(setting,administrators,isException);
    }
}
