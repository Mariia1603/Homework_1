package task_three;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double summaDeposita;
        int depositTimeMonth;
        double depositpersantage = 0.12;
        double desositMargin;


        System.out.println("Введите сумму вклада:");
        Scanner sc = new Scanner(System.in);
        summaDeposita = sc.nextInt();

        System.out.println("Введите срок депозита:");
        Scanner sc2 = new Scanner(System.in);
        depositTimeMonth = sc2.nextInt();

        desositMargin=(double)(summaDeposita * depositpersantage) / depositTimeMonth;
        System.out.println("Ваш доход за  "+ depositTimeMonth + " месяцев: " + desositMargin);


    }

}
