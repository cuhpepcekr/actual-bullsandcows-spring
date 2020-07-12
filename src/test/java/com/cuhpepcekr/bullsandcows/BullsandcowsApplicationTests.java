package com.cuhpepcekr.bullsandcows;

import com.cuhpepcekr.bullsandcows.entity.User;
import com.cuhpepcekr.bullsandcows.service.SignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BullsandcowsApplicationTests {

    @Autowired
    SignService signService;

    @Test
    void contextLoads() {
    }

    @Test
    void initialData() {
        List<User> users = new ArrayList<User>();
        users.add(User.builder().username("test1").password("1234").name("testname1").build());
        users.add(User.builder().username("test2").password("1234").name("testname2").build());

        for (User user : users) {
            signService.signUp(user);
        }
    }
}
