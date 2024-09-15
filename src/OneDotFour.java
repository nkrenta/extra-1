public class OneDotFour {
    public static void main(String[] args) {

        //Task 4
        System.out.println("Task 4");

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                System.out.println("ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i);
                System.out.println("ping");
            } else if (i % 5 == 0) {
                System.out.println(i);
                System.out.println("pong");
            }
        }

        System.out.println();

        //Task 5
        System.out.println("Task 5");

        int sum1 = 0;
        int sum2 = 1;
        int sum3 = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(sum1);
            } else if (i == 1) {
                System.out.print(sum2);
            } else if (i < 10) {
                sum3 = sum1 + sum2;
                sum1 = sum2;
                sum2 = sum3;
                System.out.print(sum3);
            } else {
                System.out.println("ERROR");
            }
        }

    }
}
