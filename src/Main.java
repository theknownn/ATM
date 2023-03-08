
import java.util.Scanner;
class ATM {
    public static void main(String[] args) {


        // declare & initializing the balance and withdrawl and credit
        int balance = 100000;
        int withdrawl;
        int credit;

        //Create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Welcome to ATM !");
            System.out.println("Choose 1 for Withdrwal");
            System.out.println("Choose 2 for Credit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 3 for Exit");
            System.out.println("Choose any option you want to perform");

            //get choice from user
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter money you want to withdraw :");

                    //get withdrawl money from user
                    withdrawl = sc.nextInt();


            }
        }

    }
}