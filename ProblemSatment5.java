import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemSatment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A []= new  int[10];
        for (int i = 0; i < A.length; i++) {
            System.out.println("Enter the number which u want ot insert in array");
            A[i]=sc.nextInt();
            
        }
      
        for (int i : A) {
            System.out.println(i);
        }

    }
}
