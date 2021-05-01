import java.lang.*;


interface math1
{
       int add(int a,int b);
      int sub(int a,int b);

}
interface math2
{
       int mul(int a,int b);

}


 class  Arithematic  implements math1,math2
{
 public int c, d;

public  int add(int a,int b)
   {
         c=a;
         d=b;
        
        return c+d;

   }

   public int  sub(int a,int b)
   {
               return  a-b;
   }
  
   public int  mul(int a,int b)
   {
               return  a*b;
   }
  



}

class DemoInterface
{ 
   public static void main(String arg[])
   {
           Arithematic aobj=new Arithematic();
           System.out.println("Addition is"+aobj.add(3,5));
           System.out.println("Substraction is"+aobj.sub(3,5));
           System.out.println("Multiplication is"+aobj.mul(3,5));




   }






}
