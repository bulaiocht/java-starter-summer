package recursion;

import java.math.BigDecimal;

public class RecursiveFactorial {

    private int number;

    public RecursiveFactorial() {
        this.number = 1;
    }

    public RecursiveFactorial(int number){
        this.number = number;
    }

    public BigDecimal factorial(){
        return factorial(number);
    }

    public BigDecimal factorial(int num){
        BigDecimal value = BigDecimal.valueOf(num);
        return fac(value);
    }

    private BigDecimal fac(BigDecimal num) {
        if (num.equals(BigDecimal.ONE)) {
            return BigDecimal.ONE;
        }
        return num.multiply(fac(num.subtract(BigDecimal.ONE)));
    }

    public static void main(String[] args) {

        RecursiveFactorial factorial = new RecursiveFactorial();

        System.out.println(factorial.factorial());

        System.out.println(factorial.factorial(11));

    }


}
