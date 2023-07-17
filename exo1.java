// The Story:

// Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.

// Task Overview:

// You have to write a function that accepts three parameters:

// cap is the amount of people the bus can hold excluding the driver.
// on is the number of people on the bus excluding the driver.
// wait is the number of people waiting to get on to the bus excluding the driver.
// If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.


public class Bob {
  public static int enough(int cap, int on, int wait){
  // your code here
    int placelibre = on - wait;
    
    if(placelibre <= 0){
      return 0;
    }else{
      return placelibre;
    }
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, Bob.enough(100, 60, 80));
        assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5));
    }
}