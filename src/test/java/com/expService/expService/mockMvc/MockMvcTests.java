package com.expService.expService.mockMvc;


import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class MockMvcTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldReturnByMake() throws Exception {
    mockMvc.perform(post("/car/add").param("make", "Honda").param("model", "Accord")
    .param("year", "2018")).andExpect(status().isOk());

    mockMvc.perform(post("/car/add").param("make", "Toyota").param("model", "Tundra")
        .param("year", "2012")).andExpect(status().isOk());

    mockMvc.perform(get("/car/Honda")).andExpect(status().isOk())
        .andExpect(jsonPath("model").value("Accord"));
  }

  @Test
  public void shouldReturnList() throws Exception {
    mockMvc.perform(get("/garage")).andExpect(status().isOk())
        .andExpect(jsonPath("$", hasSize(2)));
  }
}
