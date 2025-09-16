import java.util.*;
public class reverse {
    public static void main(String[] args){
        int n,rev=0,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n!=0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        System.out.println("Reversed number is="+rev);
        
    }
    
}
