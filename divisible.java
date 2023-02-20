import java.util.Scanner;
 class divisibleBy5
{
    public static void main(String args[])
    {
        int n;
        Scanner bc=new Scanner(System.in);
        System.out.println("Enter any number");
        n =bc.nextInt();
        if(n%5==0)
        {
           System.out.println(n+"is divisible by 5");
        }
        else
        {
           System.out.println(n+" is not divisible by 5");
        }
    }
}