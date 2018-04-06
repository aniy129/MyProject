package csk.dal.jpa;

import csk.entity.database.Administrators;
import csk.entity.database.Setting;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional(value = "jpaTransactionManager")
@Repository
public class SettingDAL implements ISettingDAL {

    @PersistenceContext
    EntityManager entityManager;

    public Setting get(long id) {
        return entityManager.find(Setting.class, id);
    }

    public void add(Setting setting) {
        entityManager.persist(setting);
        //entityManager.flush();
    }

    public List<Setting> getAll() {
        return null;
    }

    /*
    * 配置rollbackFor={Exception.class}事务才会回滚
    * */
    @Transactional(value = "jpaTransactionManager",rollbackFor={Exception.class})
    public void addSettingAndAdministrator(Setting setting, Administrators administrators, boolean isException) throws Exception {
        entityManager.persist(setting);
        if (isException)
        {
            throw  new Exception("yes");
        }
        entityManager.persist(administrators);
        entityManager.flush();
    }
}
