import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,flag=0;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        if(num==0 || num==1)
        {
            System.out.println("number is not prime");
        }
        else{
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    System.out.println("number is not prime");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("number is prime");
        }
    }
}