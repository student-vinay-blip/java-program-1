import java.util.*;
public class Bankbalance {
    int balance=50000;
    void deposite(){
        int amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("The total balance after deposite is"+balance);

    }
    void withdraw(){
        int amount;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn");
        amount=sc.nextInt();
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("the total balance is"+balance);
            

        }
        else{
            System.out.println("Insufficient balance");

        }

    }
    void checkbalance(){
        System.out.println("The total balance is"+balance);

        

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Bankbalance b1= new Bankbalance();
        int choice=1;
        while(choice!=4){
        System.out.println("1.deposite\n2.Withdraw\n3.checkbalance");
        System.out.println("Enter your choice");
        


         choice=sc.nextInt();

        switch(choice){
            case 1:
            b1.deposite();
            break;
            case 2:
            b1.withdraw();
            break;
            case 3:
            b1.checkbalance();
            break;
            case 4:break;
            default:
            System.out.println("Invalid choice");
        }
    }
    }
}

