package pl.fibonacci.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci;
    @Before
   public void init(){
       this.fibonacci = new Fibonacci();
   }

    @Test
    public void fibonacciTestForTen(){
        //when
       Long results = fibonacci.calculator(10);

        //then;
       Assert.assertThat(results, CoreMatchers.is(44L));
    }

    @Test
    public void fibonacciTestForFifteen(){
        //when
        Long results = fibonacci.calculator(15);

        //then;
        Assert.assertThat(results, CoreMatchers.is(798L));
    }

    @Test
    public void fibonacciTestForError(){
        //when
        Long results = fibonacci.calculator(100);

        //then;
        Assert.assertThat(results, CoreMatchers.is(0L));
    }

}