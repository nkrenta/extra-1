import java.util.Arrays;
import java.util.Scanner;

public class OneDotFive {

    public static int scanner() {
        Scanner input = new Scanner(System.in);
        //System.out.println(text);
        return input.nextInt();
    }

    public static void main(String[] args) {

        //Task 5
        System.out.println("Task 5");
        System.out.println("Input a number of matrix's diagonals:  ");
        int a = scanner();

        int[][] twoDimArray = new int[3][3];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                if ((i + j) % 2 == 0) {
                    twoDimArray[i][j] = a;
                } else {
                    twoDimArray[i][j] = 0;
                }
            }
        }

        for (int[] row : twoDimArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Task 6
        System.out.println("Task 6");

        int[] firstArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[firstArray.length - 1 - i] = firstArray[i];
        }
        System.out.println(Arrays.toString(secondArray));
        System.out.println();

        //Task 7
        System.out.println("Task 7");

        for (int i = 0; i < firstArray.length / 2; i++) {
            int temp = firstArray[i];
            firstArray[i] = firstArray[firstArray.length - 1 - i];
            firstArray[firstArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println();

        //Task 8
        System.out.println("Task 8");

        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == -2) {
                    System.out.println("(First number: " + array[i] + ", with index [" + i + "]) (Second number: " + array[j] + ", with index [" + j + "]) gave summary " + (array[i] + array[j]));
                }
            }
        }
        System.out.println();

        //Task 9
        System.out.println("Task 9");

        int[] array2 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length / 2; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[i] + array2[j] == -2) {
                    System.out.println("(First number: " + array2[i] + ", with index [" + i + "]) (Second number: " + array2[j] + ", with index [" + j + "]) gave summary " + (array2[i] + array2[j]));


                }
            }
        }

    }
}