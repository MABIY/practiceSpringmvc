package com.lh.spring.test.domain.repository;

public interface CRUDRepository<T, F> {
    // 查询
    T Find(F f);

    // 删除
    void delete(F f);

    //修改或插入
    int save(T t);
}
