package com.kyx.app.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by XuHe on 17/1/4.
 * SqlSessionDaoSupport 1.2 之后删除了Autowired，所以需要重写setSqlSessionTemplate 或 setSqlSessionFactory并注入
 */
public class BaseDao extends SqlSessionDaoSupport {
//    @Autowired
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        super.setSqlSessionTemplate(sqlSessionTemplate);
//    }

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
