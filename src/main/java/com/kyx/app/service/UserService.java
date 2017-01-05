package com.kyx.app.service;

import com.kyx.app.bean.User;
import com.kyx.app.dao.UserDao;
import com.kyx.app.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by XuHe on 17/1/4.
 */
@Service
@Transactional // default rollback-for RuntimeException
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    public void save(User user){

        Long id = user.getId() + 1;
        user.setId(id);
        userMapper.insert(user);

       //  throw new RuntimeException("throw a exception!!");
       // throw new Exception("throw a exception!!");


        try{
            throw new RuntimeException("throw a exception!!");
        }catch (Exception e){
            System.out.println("service: catch a exception");
            throw e;//must throw ,otherwise the transaction can't rollback.
        }

//        User u = user;
//        u.setId(1l);
//        userDao.save(u);

    }

    public void add(User user){
        userDao.save(user);
    }
}
