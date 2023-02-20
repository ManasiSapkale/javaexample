import java.util.Scanner;
class matrixadd{

                public static void main(String args[])

{

                int i,j;
                Scanner bs=new Scanner(System.in);
                System.out.println("Enter num of row");
                int rows=bs.nextInt();
                System.out.println("Enter num of columns");
                int cols=bs.nextInt();

                int arr[][]=new int[rows][cols];
                int brr[][]=new int[rows][cols];
                int res[][]=new int[rows][cols];
                System.out.println("Enter first array values");


                for(i=0;i<rows;i++)
                {

                        for(j=0;j<cols;j++)

                                {
                                arr[i][j]=bs.nextInt();
                        
                         }
                  }

System.out.println("Enter second array values");


                  for(i=0;i<rows;i++)

                  {

                         for(j=0;j<cols;j++)

                                 {

                                  brr[i][j]=bs.nextInt();

                         }

                   }

                   for(i=0;i<rows;j++)

          {



                   for(j=0;j<cols;j++)

                   {


                           res[i][j]=arr[i][j]+brr[i][j];

                   }

                   }

                   System.out.println("Addition is : ");

for(i=0;i<rows;i++)

       {


                    for(j=0;j<cols;j++)

                    {

                               System.out.println(res[i][j]+"  ");

                     }

                               System.out.println();

                     }


}

}
       