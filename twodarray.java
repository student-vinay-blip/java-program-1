import java.util.*;
public class twodarray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] a;
        a=new int[3][3];
        System.out.println("enter the array elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(  " "+a[i][j]);
            }
            System.out.println("");
        }
    }

}

