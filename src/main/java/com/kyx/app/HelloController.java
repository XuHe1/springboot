package com.kyx.app;

import com.kyx.app.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaiitsugyou on 16/12/27.
 */
@RestController
@RequestMapping(path = "/app")
public class HelloController {
    @RequestMapping("/home")
    public String home(){
       return "Hello World～V～";
    }

    @RequestMapping("/user")
    public User getUserById(){
        User user = new User();
        user.setId("u001");
        user.setName("xuhe");
        user.setAge(26);
        return user;
    }
}
