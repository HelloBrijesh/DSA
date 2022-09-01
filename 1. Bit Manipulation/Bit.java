import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        // find odd or even 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        sc.close();

        int result = n & 1;

        if (result == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

        // divide by 2 

        int divideByTwo = n >> 1;

        System.out.println(n + " divided by Two : " + divideByTwo);

        // multiply by 2

        int mulltilyByTwo = n << 1;

        System.out.println( n + " multiply by Two : " + mulltilyByTwo);

    }
}
