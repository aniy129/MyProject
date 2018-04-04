package csk.service.interfaces;

import csk.entity.database.Setting;

import java.util.List;

public interface ISettingService {
    Setting get(long id);
    void add(Setting setting);
    List<Setting> getAll();
}
