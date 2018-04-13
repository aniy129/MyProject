package csk.dal.jpa;

import csk.entity.database.User;
import org.springframework.data.repository.CrudRepository;

/*
* 继承 SearchableRepository 分页 和 CrudRepository 基本的增删改查 接口定义以Repository
* */
public interface UserRepository  extends CrudRepository<User, Long>
        , SearchableRepository<User>
{
}
