import java.util.Scanner;

public class SetBit {

    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Enter the ith place of bit to set :");
        int i = sc.nextInt();
        sc.close();

        int mask = 1 << i;

        int result = n | mask;

        System.out.println(result);

    }
    
}
