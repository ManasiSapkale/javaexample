import java.util.Scanner;
class calc{

         
         public static void main(String args[])

         {

                 Scanner ms=new Scanner(System.in);
                 System.out.println("Enter first num");
                 int num1=ms.nextInt();
                 System.out.println("Enter second num");
                 int num2=ms.nextInt();
                 System.out.println("Select operation : \n press 1 for addition\n press 2 for subtract\n press 3 for multiply");
                 int op=ms.nextInt();
         System.out.println(
                 switch(op){
                 case 1->num1+num2;
                 case 2->num1-num2;
                 case 3->num1*num2;
                 default->"Invalid";
                 }
                 );

}

}