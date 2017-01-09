package com.kyx.app.dao;


import com.kyx.app.bean.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by XuHe on 17/1/4.
 */
@Repository
public class UserDao {


    @Autowired
    private SqlSessionTemplate sqlSession;
    public void save(User user){
        sqlSession.insert("com.kyx.app.mybatis.mapper.UserMapper.insert"  ,user);
        //this.getSqlSession().insert("com.kyx.app.mybatis.mapper.UserMapper.insert",user);
    }
}
