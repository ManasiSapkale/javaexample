import java.util.Scanner;
class evenNum{

public static void main(String args[])

{

             //creating object for scanner
             Scanner ms=new Scanner(System.in);
             System.out.println("enter a num");
             int num=ms.nextInt();//reading input
         
             if(num%2==0)

             {

                  //if condition is true
                  System.out.println(num+"is even number");

              }

              else
              {

                  //if condition is false
                  System.out.println(num+"is odd number");

               }

}


}
