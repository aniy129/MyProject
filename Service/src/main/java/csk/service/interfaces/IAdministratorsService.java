package csk.service.interfaces;

import csk.entity.database.Administrators;

import java.util.List;

public interface IAdministratorsService {
    List<Administrators> getAdmins();
}
