import java.util.Scanner;
class readmultiarr{


                     public static void main(String args[])

{


                     int i,j;
                     Scanner ms=new Scanner(System.in);
                     System.out.println("Enter num of rows");
                     int rows=ms.nextInt();
                     System.out.println("Enter num of columns");
                     int cols=ms.nextInt();


                     int arr[][]=new int[rows][cols];
                     //reading values to matrix
                     System.out.println("Enter array values");
                     for(i=0;i<rows;i++)

                     {


                            for(j=0;j<cols;j++)
              
                            {

                                  arr[i][j]=ms.nextInt();

                       }

                       }

//printing values as matrix

for(i=0;i<rows;i++)

                       {

                              for(j=0;j<cols;j++)

                              {

                                        System.out.print(arr[i][j]+" ");

                       }

                               System.out.println();

                       }


}

}


                     