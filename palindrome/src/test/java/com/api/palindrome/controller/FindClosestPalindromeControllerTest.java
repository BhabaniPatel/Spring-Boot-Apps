package com.api.palindrome.controller;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.api.palindrome.service.FindClosestPalindromeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = FindClosestPalindromeController.class, useDefaultFilters = false)
class FindClosestPalindromeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FindClosestPalindromeService service;

    @BeforeEach()
    void setMockMvc() {
        FindClosestPalindromeController findClosestPalindromeController = new FindClosestPalindromeController();
        ReflectionTestUtils.setField(findClosestPalindromeController, "service", service);
        this.mockMvc = standaloneSetup(findClosestPalindromeController).build();
    }

    @Test
    void testRandomUrl() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/random")).andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void testGetClosestPalindromeNumber() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/palindrom/closest-palindrom?number=121")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
