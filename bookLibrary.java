class bookLibrary
{

             public static void main(String args[])

      {

             bookShell ms=new bookShell();
             ms.setBook(1234,"Immortals of meluha","Amish",150);
             bookShell ms2=new bookShell();
             ms2.setBook(1235,"chanakyas chant","Ashwin sanghi",200);
             ms.getBook();
             ms2.getBook();

      }

}

class bookShell

{

             private int bNum,bPrice;
             private String bName,bAuthor;

             //adding one book to bookShell
             public void setBook(int bookId,String bookName,String bookAuthor,int bookPrice){
                   bNum=bookId;
                   bName=bookName;
                   bAuthor=bookAuthor;
                   bPrice=bookPrice;
              }
              //print book details
              public void getBook(){
                    System.out.println(bNum+" is "+bName+" which is written by"+bAuthor+" and it is price "+bPrice+"rs");

              }

}