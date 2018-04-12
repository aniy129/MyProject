package csk.dal.jpa;

import csk.entity.database.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
* 实现user仓库的接口 类定义已RepositoryImpl结尾
* */
public class UserRepositoryImpl implements SearchableRepository<User> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Page<SearchResult<User>> search(String query, boolean useBooleanMode, Pageable pageable) {
        return null;
    }
}
