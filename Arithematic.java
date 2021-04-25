import java.lang.*;
class Operation
{
    public int no1,no2;
    public Operation()
    {   
        System.out.println("Inside Default Constuctor\n");

        no1=0;
        no2=0;
    }
       public Operation(int x,int y)
       {
        System.out.println("Inside Parameterized Constructor\n");

           no1=x;
           no2=y;
       }
       public int Add()
       {
           int sum;
    
           sum=no1+no2;
           return sum;
       }
       public int Sub()
       {
            
             int sub=no1-no2;
            return sub;


       }


    

}

class Arithematic
{
     public static void main(String arg[])
   {        
           Operation obj1=new  Operation();
           Operation obj2=new  Operation(23,55);
           int ret=obj2.Add();
           System.out.println("Addition of two numbers\n");
           System.out.println(ret);
           int ret2=obj2.Sub();
           System.out.println("Substarction of two numbers\n");
           System.out.println(ret2);


     }


}
