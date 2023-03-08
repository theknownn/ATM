
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
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose any option you want to perform");

            //get choice from user
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter amount you want to withdraw :");

                    //get withdrawl money from user
                    withdrawl = sc.nextInt();

                    //check whether balance is greter than or equal to withdrawl amount
                    if (balance>= withdrawl){

                        //remove the withdrawl amount from total balance
                        balance = balance - withdrawl;
                        System.out.println("Please Wait and Collect your cash and Remaining balance :" +balance);

                    }
                    else {

                        //show custom error
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter amount you want to credit :");

                    //get ammount from user want to credit
                    credit = sc.nextInt();

                    //credited amount to the total balance
                    balance = balance + credit;
                    System.out.println("Amount has been successfully credited to your account. Total Balance :"+balance);
                    System.out.println("");
                    break;

                case 3:
                    //display total Balance of the user
                    System.out.println("Total Balance :"+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Thank You For Using ATM ");
                    System.exit(0);

            }
        }

    }
}