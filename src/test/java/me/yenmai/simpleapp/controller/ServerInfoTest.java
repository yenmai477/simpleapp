package me.yenmai.simpleapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(ServerInfo.class)
class ServerInfoTest {

  @Autowired
  private MockMvc mvc;

  @Test
  void healthCheck() throws Exception {
    mvc
      .perform(MockMvcRequestBuilders.get("/server-info/health-check"))
      .andExpect(MockMvcResultMatchers.status().isOk())
      .andExpect(MockMvcResultMatchers.content().string("Response from server!"));
  }
}