package solipath;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void given3ThenReturnFizz(){
        assertEquals(new FizzBuzz().execute(3), "Fizz");
    }

    @Test
    void given5ThenReturnBuzz(){
        assertEquals(new FizzBuzz().execute(5), "Buzz");
    }

    @Test
    void given6ThenReturnFizz(){
        assertEquals(new FizzBuzz().execute(6), "Fizz");
    }

    @Test
    void given1Return1(){
        assertEquals(new FizzBuzz().execute(1), "1");
    }

    @Test
    void given10ThenReturnBuzz(){
        assertEquals(new FizzBuzz().execute(10), "Buzz");
    }

    @Test
    void given15ThenReturnFizzBuzz(){
        assertEquals(new FizzBuzz().execute(15), "FizzBuzz");
    }

    @Test
    void given30ThenReturnFizzBuzz(){
        assertEquals(new FizzBuzz().execute(30), "FizzBuzz");
    }
}