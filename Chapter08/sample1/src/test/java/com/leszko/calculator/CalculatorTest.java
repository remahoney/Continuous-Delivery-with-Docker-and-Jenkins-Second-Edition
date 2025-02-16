/**
* This is the calculator JavaScript file for Exercise 4, Problem 2
*/
package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
* This is the  public class
*/
public class CalculatorTest {
     private Calculator calculator = new Calculator();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}
