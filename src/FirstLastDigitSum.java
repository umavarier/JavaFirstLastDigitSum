//program to find the sum of first and last digit of the given number.


import java.util.Scanner;

public class FirstLastDigitSum {

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= s.nextInt();
        s.nextLine();

        System.out.println("The sum of First and last digit of given number is "+sumFirstAndLastDigit(num));
    }

    public static int sumFirstAndLastDigit(int number)
    {
        int fd=0;int ld=0;int i=0;int r=0;int sum=0;
        if(number<0)
        {
            return -1;
        }
        else
        {
            ld=number%10;
            while(number!=0)
            {
                i=number%10;
                r=(r*10)+i;
                number=number/10;
            }
            fd=r%10;
            sum=fd+ld;
        }
        return sum;
    }
}
