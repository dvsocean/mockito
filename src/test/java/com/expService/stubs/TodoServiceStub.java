package com.expService.stubs;

import com.expService.services.TodoService;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

  @Override
  public List<String> retrieveTodos(String find) {
    return Arrays.asList("Go skydiving", "Learn Spring Mvc", "Learn to code Spring");
  }

  @Override
  public String findString() {
    return null;
  }
}
