import java.util.*;
enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        if (operation == Operation.ADD) {
		return num1 + num2;
	} else if (operation == Operation.SUBTRACT) {
		return num1 - num2;
	} else if (operation == Operation.MULTIPLY) {
		return num1 * num2;
	} else if (num2 == 0) {
		return 0.0;
	} else {
		return num1 / num2;
	}
    }

    public static int printValuesandReturnSum(int[] input){
        int sum = 0;
	int idx = 0;

	while (idx < input.length) {
		System.out.println(input[idx]);
		sum += input[idx];
		idx++;
	}

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(Operation.ADD, 1, 2));
    }
}
