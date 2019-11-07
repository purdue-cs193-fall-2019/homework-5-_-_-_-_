import java.util.*;
enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
	try {
        switch (operation) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
		if (num2 == 0) return 0.0;
                return num1 / num2;
        }
        return -1;
	} catch (Exception e) {
		return -1;
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
