import java.util.*;
public class Array {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size that you want");
     int size = sc.nextInt();
     System.out.println("enter the elements of Array");
     int numbers[] = new int[size];
     //input
     for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
     }
     //output
       for(int i=0; i<=size;i++){
        System.out.println("numbers: "+(i));
       }
       System.out.println("Enter the number to be find");
       int find =sc.nextInt();
       for(int i=0; i<size;i++){
        if(numbers[i]==find){
            System.out.println("Index ="+i);
        }
       }

    }
    
}
