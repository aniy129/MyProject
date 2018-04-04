package csk.dal.jpa;

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
        entityManager.flush();
    }

    public List<Setting> getAll() {
        return null;
    }
}
