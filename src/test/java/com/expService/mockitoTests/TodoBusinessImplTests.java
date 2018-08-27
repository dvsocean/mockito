package com.expService.mockitoTests;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import com.expService.expService.garage.Garage;
import com.expService.services.TodoService;
import org.junit.Test;

public class TodoBusinessImplTests {

  //Given
  private Garage mockGarage = mock(Garage.class);
  private TodoService mockTds = mock(TodoService.class);

  @Test
  public void shouldConfirmListSize() {
    //Given
    mockGarage.createCarAndAddToList("Toyota", "Tundra", 2018);
    mockGarage.showList();

    //Then
    verify(mockGarage, atLeastOnce()).showList();
  }

  @Test
  public void shouldAddToList() {
    //Given
    mockGarage.createCarAndAddToList("Toyota", "Tundra", 2018);

    //Then
    verify(mockGarage).createCarAndAddToList("Toyota", "Tundra", 2018);
  }

  @Test
  public void shouldReturnCarByMake() {
    //When
    mockGarage.getMyCar("Honda");

    //Then
    verify(mockGarage, atLeastOnce()).getMyCar("Honda");
  }

  @Test
  public void createCar() {
    //When
    mockGarage.createCarAndAddToList("Lambo", "F450", 2018);

    //Then
    verify(mockGarage).createCarAndAddToList("Lambo", "F450", 2018);
  }

  //  @Test
//  public void testingTheArrayListList() {
//    //Given - setup
//    TodoService todoServiceMock = mock(TodoService.class);
//    List<String> myList = new ArrayList<>();
//    myList.add("Hello");
//    List<String> mockList = Arrays.asList("Go skydiving", "Learn Mvc Spring", "Learn to code Spring");
//    given(todoServiceMock.retrieveTodos("GG")).willReturn(myList);
//
//    //When - actual test
//    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
//    List<String> filtered = todoBusinessImpl.retrieveTodos("GG");
//
//    //Then - results
//    assertEquals(0, filtered.size());
//  }
//
  @Test
  public void verifyMethodHasBeenCalled() {
    //When
    mockGarage.getMyCar("Ferarri");

    //Then
    /*
     * To verify that a method was never called we use never()
     * verify(mockGarage, never()).getMyCar();
     *
     * To verify that a method was called x times use times(int)
     * verify(mockGarage, times(2)).getMyCar();
     *
     * other mockito methods are present too like atLeast(int) or atLeastOnce()
     * */
    verify(mockGarage).getMyCar("Ferarri");
  }

  @Test
  public void testingTheStringMethod() {
    String test = "I am legend";
    //When
    given(mockTds.findString()).willReturn(test);

    //Then
    assertEquals(test, mockTds.findString());
  }
//
//  @Test
//  public void testTrueClassFullyMocked() {
//    //Given
//    Garage garage = mock(Garage.class);
//
//    //When
//    given(garage.getMyCar()).willReturn("Honda");
//
//    //Then
//    assertEquals("Honda", garage.getMyCar());
//  }
//
//  @Test(expected = RuntimeException.class)
//  public void testingTheList() {
//    //Given
//    List mockList = mock(List.class);
//
//    //When
//    when(mockList.get(4)).thenThrow(new RuntimeException());
//
//    //Then
//    mockList.get(4);
//  }


}//End of class
