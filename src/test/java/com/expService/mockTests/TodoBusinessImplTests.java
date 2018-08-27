package com.expService.mockTests;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.expService.implementations.TodoBusinessImpl;
import com.expService.services.TodoService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class TodoBusinessImplTests {

  @Test
  public void testingTheArrayListList() {
    //Given - setup
    TodoService todoServiceMock = mock(TodoService.class);
    List<String> myList = new ArrayList<>();
    myList.add("Hello");
    List<String> mockList = Arrays.asList("Go skydiving", "Learn Mvc Spring", "Learn to code Spring");
    given(todoServiceMock.retrieveTodos("GG")).willReturn(myList);

    //When - actual test
    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
    List<String> filtered = todoBusinessImpl.retrieveTodos("GG");

    //Then - results
    assertEquals(0, filtered.size());
  }


  @Test
  public void testingTheStringMethod() {
    //Given
    TodoService tds = mock(TodoService.class);
    String testString = "Never never land";

    //When
    given(tds.findString()).willReturn(testString);

    //Then
    assertEquals(testString, tds.findString());
  }


  @Test(expected = RuntimeException.class)
  public void testingTheList() {
    //Given
    List mockList = mock(List.class);

    //When
    when(mockList.get(4)).thenThrow(new RuntimeException());

    //Then
    mockList.get(4);
  }





}//End of class
