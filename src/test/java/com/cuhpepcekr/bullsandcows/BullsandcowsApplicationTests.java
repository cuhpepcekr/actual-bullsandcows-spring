package com.cuhpepcekr.bullsandcows;

import com.cuhpepcekr.bullsandcows.entity.User;
import com.cuhpepcekr.bullsandcows.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BullsandcowsApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void initialData() {
        List<User> users = new ArrayList<User>();
        users.add(User.builder().username("testusername1").password("testpassword1").name("testname1").build());
        users.add(User.builder().username("testusername2").password("testpassword2").name("testname2").build());
        userRepository.saveAll(users);
    }
}
