package csk.dal.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/*
* 使用spring data 实现统一分页
* 所有实体仓库继承自此接口并扩展自己特有的查询即可实现底层复用
* */
public interface SearchableRepository<T>
{
    Page<SearchResult<T>> search(String query, boolean useBooleanMode,
                                 Pageable pageable);
}
