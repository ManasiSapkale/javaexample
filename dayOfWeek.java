import java.util.*;
class dayOfWeek{


              public static void main(String args[])


              {


                       Scanner ms=new Scanner(System.in);
                       System.out.println("Enter a value");
                       int day=ms.nextInt();

                       if(day==1 || day==8)
                               {
                                        System.out.println("it is Sunday");
                               }
                       else if(day==2 || day==9)
                               {
                                        System.out.println("it is Monday");
                               }
                       else if(day==3)
                               {
                                        System.out.println("it is Tuesday");
                               }
                       else if(day==4)
                               {
                                        System.out.println("it is wednesday");
                               }
                       else if(day==5)
                               {
                                        System.out.println("it is Thursday");
                               }
                       else if(day==6)
                               {
                                        System.out.println("it is Friday");
                               }
                       else if(day==7)
                               {
                                        System.out.println("it is saturday");
                               }
                       else{
                                        System.out.println("invalid day");
                               }

                 }

}
