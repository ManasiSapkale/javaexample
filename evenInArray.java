import java.util.Scanner;
class evenInArray{


               public static void main(String args[])


{


               int sum=0,i;
               //Scanner object
               Scanner ms=new Scanner(System.in);
               System.out.println("enter num of elements in array");
               int ns=ms.nextInt();//reading lenght of array


               int arr[]=new int[ns];//creating array of specific size

               System.out.println("hey plz enter array values");
               for(i=0;i<ns;i++)
               {
                          arr[i]=ms.nextInt();//reading array values

               }

               System.out.println("Even nums in array ");
               for(int dummy:arr)

               {

                           if(dummy%2==0)//checking for even
                                   System.out.println(dummy);

               }


}


}