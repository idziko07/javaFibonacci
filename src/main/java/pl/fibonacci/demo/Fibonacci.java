package pl.fibonacci.demo;

public class Fibonacci {

    public Long calculator(int number){
        long fib1 = 1, fib2 = 1;
        long sum = 0;

        for (int i = 0; i <number ; i++) {

            if (fib2 % 2 == 0){
                sum += fib2;
            }
            fib2 += fib1;
            fib1 = fib2-fib1;
            if(sum > 4000000L){
                return Long.valueOf(0);
            }
        }

        return sum;
    }
}
