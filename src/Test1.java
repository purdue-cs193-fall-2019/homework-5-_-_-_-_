import java.util.*;
enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        return result;
    }

    public static int printValuesandReturnSum(int[] input){
        int sum = 0;
        for (int i=0;i<input.length;i++) {
            sum += input[i];
            System.out.println(input[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(Operation.ADD, 1, 2));
    }
}
