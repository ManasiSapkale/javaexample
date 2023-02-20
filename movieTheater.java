class movieTheater
{

             public static void main(String args[])
   
             {

             theaterHall ms=new theaterHall();
             ms.setMovie(100,"Theri","Atlee Kumar",6000);
             theaterHall ms2=new theaterHall();
             ms2.setMovie(150,"Hera Feri","Neeraj Vora",700);
             ms.getMovie();
             ms2.getMovie();

             }

}

class theaterHall

{

             private int bNum,bPrice;
             private String bName,bDirector;

            
                   public void setMovie(int movieTicket,String movieName,String movieDirector,int moviePrice){
                   bNum=movieTicket;
                   bName=movieName;
                   bDirector=movieDirector;
                   bPrice=moviePrice;
              }
              
                    public void getMovie(){
                    System.out.println(bNum+" is "+bName+" which is written by"+bDirector+" and it is price"+bPrice+"rupees");

              }

}