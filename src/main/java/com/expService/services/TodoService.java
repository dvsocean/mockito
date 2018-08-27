package com.expService.services;

import java.util.List;

public interface TodoService {

  List<String> retrieveTodos(String find);

  String findString();

}
