package com.greenfox.postman;

import com.greenfox.postman.Controllers.MainRestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.nio.charset.Charset;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
public class ControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

 @Autowired
  private MockMvc mockMvc;

@Test
  public void doubled_successful() throws Exception{
    mockMvc.perform(get("/doubling?input=15")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(30)));
  }

@Test
  public void doubled_returnErrorMessage() throws Exception{
  mockMvc.perform(get("/doubling")
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().contentType(contentType))
          .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void greeting_returnErrorMessageNoTitle() throws Exception{
    mockMvc.perform(get("/greeter?name=Lajos")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }

  @Test
  public void greeting_returnErrorMessageNoName() throws Exception{
    mockMvc.perform(get("/greeter?title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void appendA_successful() throws Exception{
    mockMvc.perform(get("/appenda/kuty")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.appended", is("kutya")));

  }
}