package csk.dal.jpa;

import csk.entity.database.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/*
 * 实现user仓库的接口 类定义以RepositoryImpl结尾
 * */
@Transactional(value = "jpaTransactionManager")
public class UserRepositoryImpl implements SearchableRepository<User> {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional(value = "jpaTransactionManager")
    @Override
    public Page<User> search(String sqlCondition, Map<String, Object> sqlParameters, Pageable pageable) {
        Query selectQuery = this.entityManager.createNativeQuery(" select * from User " + sqlCondition, User.class);
        Query countQuery = this.entityManager.createNativeQuery("select count(1) from User " + sqlCondition);
        selectQuery.setFirstResult((pageable.getPageNumber()-1)*pageable.getPageSize())
                .setMaxResults(pageable.getPageSize());
        if (sqlParameters != null && sqlParameters.size() > 0) {
            for (Map.Entry<String, Object> item : sqlParameters.entrySet()) {
                selectQuery.setParameter(item.getKey(), item.getValue());
                countQuery.setParameter(item.getKey(), item.getValue());
            }
        }
        List<User> resultList = selectQuery.getResultList();
        Object singleResult = countQuery.getSingleResult();
        long total = Long.parseLong( singleResult.toString());
        Page pg = new PageImpl(resultList, pageable, total);
        return pg;
    }
}
