import java.util.Scanner;

public class FindBit{
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Enter the ith place of bit to find is it set or not :");
        int i = sc.nextInt();
        sc.close();

        // create the mask

        int mask = 1 << i;

        // AND the number with mask

        int result = n & mask;

        if (result == 0){
            System.out.println("The " + i +" th bit is 0");
        }else{
            System.out.println("The " + i +" th bit is 1");
        }

    }
}