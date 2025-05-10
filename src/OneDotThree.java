import java.util.Scanner;

public class OneDotThree {

    public static int scanner(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        return input.nextInt();
    }

    public static void main(String[] args) {

        //Task #6
        System.out.println("Task #6");

        String a1 = "Input your age:";
        String b1 = "Input your salary:";

        int age1 = scanner(a1);
        boolean isMoreLimitAge = age1 >= 23;

        int salary1 = scanner(b1);
        boolean isSalaryMoreFiftyK = salary1 >= 50000;
        boolean isSalaryMoreEightyK = salary1 >= 80000;

        double totalLimit1 = 0;

        if (isMoreLimitAge) {
            if (isSalaryMoreFiftyK && isSalaryMoreEightyK) {
                totalLimit1 = salary1 * 3 * 1.5;
            } else if (isSalaryMoreFiftyK) {
                totalLimit1 = salary1 * 3 * 1.2;
            } else
                totalLimit1 = salary1 * 3;
        } else {
            if (isSalaryMoreFiftyK && isSalaryMoreEightyK) {
                totalLimit1 = salary1 * 2 * 1.5;
            } else if (isSalaryMoreFiftyK) {
                totalLimit1 = salary1 * 2 * 1.2;
            } else
                totalLimit1 = salary1 * 2;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + totalLimit1 + " рублей.");
        System.out.println();

        //Task #7
        System.out.println("Task #7");

        double baseRate = 10;
        int loanTerm = 12;
        double totalSum = 0;
        double moneyPerMonth = 0;

        String a2 = "Input your age:";
        String b2 = "Input your salary:";
        String c2 = "Input the limit you want to be:";

        int age2 = scanner(a2);
        boolean isLess23 = age2 < 23;
        boolean isLess30 = age2 >= 23 && age2 <= 30;

        int salary2 = scanner(b2);
        boolean isSalaryMoreEightyK1 = salary2 >= 80000;


        double wantedSum = scanner(c2);

        if (isLess23) {
            baseRate += 1;
        }
        if (isLess30) {
            baseRate += 0.5;
        }
        if (isSalaryMoreEightyK1) {
            baseRate -= 0.7;
        }

        totalSum = wantedSum + wantedSum * (baseRate / 100);
        moneyPerMonth = totalSum / loanTerm;

        boolean enoughMoney = (double) (salary2 / 2) >= moneyPerMonth;

        if (enoughMoney) {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + (salary2 / 2) + " рублей.");
            System.out.println("Платеж по кредиту " + moneyPerMonth + " рублей. Кредит одобрен!");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + (salary2 / 2) + " рублей.");
            System.out.println("Платеж по кредиту " + moneyPerMonth + " рублей. В кредите отказано!");
        }

        //System.out.println("23 " + isLess23);
        //System.out.println("30 " + isLess30);
        //System.out.println("Bs" + baseRate);
        //System.out.println("Ts " + totalSum);

    }
}