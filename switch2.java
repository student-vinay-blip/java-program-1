import java.util.*;
public class switch2 {
    
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int num1,num2,choice;
        System.out.println("Enter first number");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        System.out.println("1.Addition\n2.substraction\3.Multiplication\n4.Division");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Addition is:"+(num1+num2));
            break;
            case 2:
            System.out.println("Substraction is"+(num1-num2));
            break;
            case 3:
            System.out.println("Multiplication is"+(num1*num2));
            break;
            case 4:
            if(num2!=0){
                System.out.println("Division is"+(num1/num2));

            }
        else{
            System.out.println("Denominator cannot be zero");
        }
            break;
        default:
        System.out.println("Invalid choice");}
        }

    }

