package recursion;

import java.math.BigDecimal;
import java.util.Arrays;

public class RecursiveFibonacci {

    private static int counter = 2;

    private BigDecimal [] sequence;

    private int depth;

    public RecursiveFibonacci(int depth){
        this.sequence = new BigDecimal[depth];
        this.depth = depth;
    }

    public BigDecimal[] fibonacciSequence(){
        BigDecimal first = BigDecimal.ZERO;
        BigDecimal second = BigDecimal.ONE;
        sequence[0] = first;
        sequence[1] = second;
        return fib(first, second, this.sequence);
    }

    private BigDecimal[] fib(BigDecimal first, BigDecimal second, BigDecimal[] sequence) {
        BigDecimal sum = first.add(second);
        if (counter < this.depth){
            sequence[counter] = sum;
            counter++;
            fib(second, sum, sequence);
        }
        counter = 2;
        return sequence;
    }

    public static void main(String[] args) {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci(500);
        System.out.println(Arrays.toString(fibonacci.fibonacciSequence()));
    }


}