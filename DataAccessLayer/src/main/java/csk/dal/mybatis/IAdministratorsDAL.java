package csk.dal.mybatis;

import csk.entity.database.Administrators;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAdministratorsDAL {

List<Administrators> getAdmins();
}
