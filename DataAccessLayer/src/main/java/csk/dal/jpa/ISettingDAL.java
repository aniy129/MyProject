package csk.dal.jpa;

import csk.entity.database.Administrators;
import csk.entity.database.Setting;

import java.util.List;

public interface ISettingDAL {
    Setting get(long id);
    void add(Setting setting);
    List<Setting>getAll();
    void addSettingAndAdministrator(Setting setting, Administrators administrators,boolean isException) throws Exception;
}
