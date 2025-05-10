import java.util.Scanner;

public class OneDotTwo {

    public static int scanner1() {
        Scanner inputNumber = new Scanner(System.in);
        //System.out.println("Input your number:");
        return inputNumber.nextInt();
    }

    public static void main(String[] args) {

        //Task 6
        System.out.println("Task #6");
        //Initializing variables
        int k = 5;
        int[] arrayNumbers = new int[k];
        String[] nameVariables = new String[]{"a", "b", "c", "d", "e"};
        for (int i = 0; i < k; i++) {
            System.out.println("Input " + nameVariables[i] + ":");
            arrayNumbers[i] = scanner1();
        }

        int a = arrayNumbers[0];
        int b = arrayNumbers[1];
        int c = arrayNumbers[2];
        int d = arrayNumbers[3];
        int e = arrayNumbers[4];

        int result = a * (b + (c - d * e));
        boolean res = result > 0;

        if (res) {
            System.out.println("Result was positive! I revert it.");
            result = result * (-1);
            System.out.println(result);
        } else {
            System.out.println("Result was negative! I revert it.");
            result = Math.abs(result);
            System.out.println(result);
        }
        System.out.println();

        //Task 7
        System.out.println("Task #7");

        System.out.println("Input a:");
        int a1 = scanner1();
        System.out.println("Input b:");
        int b1 = scanner1();
        System.out.println("a = " + a1);
        System.out.println("b = " + b1);

        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;

        System.out.println("new a = " + a1);
        System.out.println("new b = " + b1);

        System.out.println();

        //Task 8
        System.out.println("Task #8");

        System.out.println("Input a:");
        float a2 = scanner1();
        int b2 = (int)(((float)(a2 / 100) - (int) (a2 / 100))*10);
        System.out.println("a = " + (int)(a2));
        System.out.println("b = " + b2);

    }
}
