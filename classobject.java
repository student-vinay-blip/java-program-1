
import java.util.*;
class std{
    void stdinfo(){ 
        int id,marks;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id ");
        id=sc.nextInt();
        System.out.println("Enter student name ");
        name=sc.next();
        System.out.println("Enter student marks ");
        marks=sc.nextInt();
        System.out.println("Entered student id "+(id));
        System.out.println("Entered student name "+(name));
        System.out.println("Entered student marks "+(marks));


    }
}
public class classobject {
    public static void main(String[]args){
        std s1=new std();
        s1.stdinfo();
    }
    
}
