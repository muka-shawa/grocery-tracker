import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    //Red, Green, Refactor

    @Test
    public void shouldSay1For1(){
        //Arrange
        FizzBuzz underTest = new FizzBuzz();
        //Act
       String result = underTest.playGame("1");
        //Assert
        assertEquals("1", result);

    }
    @Test
    public void shouldSay2For2(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.playGame("2");
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldSayFizzFor3(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.playGame("3");
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldSayBuzzFor5(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.playGame("5");
        assertEquals("Buzz", result);
    }

}
