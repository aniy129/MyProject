package csk.dal.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

/*
* 使用spring data 实现统一分页
* 所有实体仓库继承自此接口并扩展自己特有的查询即可实现底层复用
* */
public interface SearchableRepository<T>
{
    Page<T> search(String sqlCondition,Map<String,Object>sqlParameters,Pageable pageable);
}
