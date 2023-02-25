class employee{
       
               int empid;
               String empName;
               address adr;


               employee(int eid,String ename,address ad)

               {

                     empid=eid;
                     empName=ename;
                     adr=ad;

               }

               public static void main(String args[])

               {

                      address a1=new address("Hyd","Telangana","India");
                      address a2=new address("Mumbai","Maharastra","India");


                      employee e1=new employee(066,"Manasi",a1);
                      employee e2=new employee(315,"Siddhesh",a2);
                      e1.display();
                      e2.display();

                }


                public void display()

                {


                       System.out.println(empid+" is "+empName+" from "+adr.city);

                 }


}

class address

{

String city,state,country;

address(String c,String st,String co)

{  


       city=c;
       state=st;
       country=co;

}

}