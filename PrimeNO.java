import java.lang.*;
import java.util.Scanner;

class DemoNumber
{
    public static void main(String arg[])
       {
            Scanner sobj=new Scanner(System.in);
            
             System.out.println(" numbers you want to enter\n");
             int iNo=sobj.nextInt();
             int i=0;
            
             //   System.out.println(" Dispaly Elements\n");
             for( i=2;i<iNo;i++)
             {
                
                  if((iNo%i)==0)
                     {
                             System.out.println("It is not a prime number\n");     
                            
                              break;    
                     }
        
                }

            if(i==iNo)
             {
                System.out.println(" prime number\n");               
            }     

       }   
}
