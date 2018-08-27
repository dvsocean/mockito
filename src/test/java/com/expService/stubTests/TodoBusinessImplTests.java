package com.expService.stubTests;

import static org.junit.Assert.assertEquals;

import com.expService.implementations.TodoBusinessImpl;
import com.expService.services.TodoService;
import com.expService.stubs.TodoServiceStub;
import java.util.List;
import org.junit.Test;

public class TodoBusinessImplTests {

  private TodoService todoServiceStub = new TodoServiceStub();
  private TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);


  @Test
  public void testingTheStub() {
    List<String> filtered = todoBusinessImpl.retrieveTodos("Dummy");
    assertEquals(2, filtered.size());
  }
}
