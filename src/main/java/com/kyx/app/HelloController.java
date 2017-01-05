package com.kyx.app;

import com.kyx.app.bean.User;
import com.kyx.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaiitsugyou on 16/12/27.
 */
@RestController
@RequestMapping(path = "/app")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    public String home(){
       return "Hello World～V～";
    }

    @RequestMapping("/user")
    public User getUserById(){
        User user = new User();

        return user;
    }

    @RequestMapping("/save")
    public String save() {
        User user = new User();
        user.setId(1l);
        user.setUsername("root");
        user.setPassword("123456");
        user.setSalt("343fd8934a");
        try{
            userService.save(user);
        }catch (Exception e){
            System.out.println("controller: catch a exception");
            e.printStackTrace();
            return "wrong";
        }

        return "ok";
    }

    @RequestMapping("/add")
    public String add(){
        User user = new User();
        user.setId(1l);
        user.setUsername("root");
        user.setPassword("123456");
        user.setSalt("343fd8934a");
        userService.add(user);
        return "success";
    }
}
