package com.expService.implementations;

import com.expService.services.TodoService;
import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl implements TodoService {

  private TodoService todoService;

  public TodoBusinessImpl(TodoService todoService) {
    this.todoService = todoService;
  }

  @Override
  public List<String> retrieveTodos(String find) {
    List<String> filteredTodos = new ArrayList<>();

    List<String> allTodos = todoService.retrieveTodos(find);

    for(String todo: allTodos) {
      if(todo.contains("Spring")){
        filteredTodos.add(todo);
      }
    }
    return filteredTodos;
  }

  @Override
  public String findString() {
    return "ZombieLand";
  }


}//End of class




