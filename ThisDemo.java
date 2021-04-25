import java.lang.*;
class Demo
{
   public int x,y;
 
  public Demo()
  {
     
      this.x=30;//here obj1 b'ze this refere to current obj
      this.y=70;
     System.out.println(x);
     System.out.println(y);


  }
  Demo(int x,int y)
  {
      this.x=x;//this referce to current class object//here obj2
      this.y=y;
      System.out.println(x);
      System.out.println(y);

  }



}   
public class ThisDemo 
   {
       
       public static void main(String arg[])
       {
          Demo obj=new Demo(); 
          Demo obj2=new Demo(30,20); 
    
       }
   }     

