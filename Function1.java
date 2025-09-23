import java.util.*;
public class Function1 {
    public static int calculateProduct(int a, int b){
        return a * b;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
         System.out.println("Enter a second number");
        int b = sc.nextInt();
        System.out.println("product of 2 numbers is:"+calculateProduct(a, b));
        if(calculateProduct(a, b)<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive number");
        }
    }
    
}
