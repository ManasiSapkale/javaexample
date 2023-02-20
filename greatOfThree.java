import java.util.Scanner;
class greatOfThree{

public static void main(String args[])

{

            Scanner ms=new Scanner(System.in);
            System.out.println("Enter First number");
            int num1=ms.nextInt();
            System.out.println("Enter Second number");
            int num2=ms.nextInt();
            System.out.println("Enter Third number");
            int num3=ms.nextInt();

     if(num1>num2)
            {


                 if(num1>num3)
                 {
                        System.out.println(num1+"is biggest");
                 }
                 else{
                        System.out.println(num3+" is biggest");
                 }
            }
            else
            {
 
                 if(num2>num3)
                         {
                                System.out.println(num2+" is biggest");
                         }
                         else
                         {
                                System.out.println(num3+" is biggest");
                         }

             }



}

}