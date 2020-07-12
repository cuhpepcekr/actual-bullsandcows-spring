package com.cuhpepcekr.bullsandcows.controller;

import com.cuhpepcekr.bullsandcows.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class SignControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void signUp() throws Exception {
        User user = User.builder().username("test1").password("1234").name("testname1").build();
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("username", user.getUsername());
        params.add("password", user.getPassword());
        params.add("name", user.getName());

        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders
                .post("/api/signup")
                .params(params))
                .andDo(print())
                .andExpect(status().isCreated());
    }

}