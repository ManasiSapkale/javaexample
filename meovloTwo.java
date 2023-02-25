class meovloTwo

{

         public static void main(String args[])

         {

              addition(51,42,62,19,20,15,1200,101);


         }

         public static void addition(int ...a)

         {

              int sum=0;
              for(int i:a)

              {

                      sum+=i;

              }

              System.out.println(sum);

         }

}