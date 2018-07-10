package com.greenfox.postman.Controllers;

import com.greenfox.postman.Models.AppendA;
import com.greenfox.postman.Models.Doubled;
import com.greenfox.postman.Models.ErrorMessage;
import com.greenfox.postman.Models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubled doubledNumber = new Doubled(input);
      return doubledNumber;
    }
      ErrorMessage errorMessage = new ErrorMessage("Please provide an input!");
      return errorMessage;
    }

  @GetMapping("/greeter")
  public Object greet(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return (new Greeting(name, title));
    } else if (name == null){
      return (new ErrorMessage("Please provide a name!"));
    } else {
      return (new ErrorMessage("Please provide a title!"));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(value="appendable") String appendable) {
      AppendA appended = new AppendA(appendable);
      return appended;
    }
}