package classroom;

public class MethodPractice {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        System.out.println(a * b);

        int c = 6;
        int d = 4;
        System.out.println(c * d);

        int calculationResult = methodOfSum(30, 40);
        System.out.println(methodOfSum(30, 40));
        System.out.println(calculationResult);

        voidSum(30, 40);

    }

    public static int methodOfSum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
        // inline return firstNumber + secondNumber;
    }

    public static void voidSum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
    }
}
