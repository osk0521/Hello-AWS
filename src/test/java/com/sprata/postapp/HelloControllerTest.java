package com.sprata.postapp;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("hello world API")
    void hello() throws Exception {
        //Given

        //When
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/hello"));

        //Then
        resultActions.andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}