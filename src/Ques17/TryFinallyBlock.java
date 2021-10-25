package Ques17;

public class TryFinallyBlock {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
        }

        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
