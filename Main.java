import java.util.Scanner;
public class Main {
   public static void main(String[] args){
    int a[]=new int[20];
     Scanner s=new Scanner(System.in);
     System.out.println("enter the limit of the array");
     int n=s.nextInt();
     int countereven=0;
     int counterodd=0;
System.out.println("enter the elements in an array");
     for(int i=0;i<n;i++)
       {
         a[i]=s.nextInt();
         
       }
     for(int i=0;i<n;i++)
       {
         if(a[i]%2==0)
         {
           countereven++;
         }
         else if(a[i]%2!=0)
         {
           counterodd++;
         }
       }

     if(countereven>counterodd)
     {  //System.out.println(countereven);
       System.out.println("array is mostly even so displaying odd numbers");
       for(int i=0;i<n;i++)
         {
           if(a[i]%2!=0)
           {
             System.out.println(a[i]);
           }
         }
         
     }
         else if(counterodd>countereven)
         { //System.out.println(counterodd);
           System.out.println("array is mostly odd so displaying even numbers");
         
     for(int i=0;i<n;i++)
         {
           if(a[i]%2==0)
           {
             System.out.println(a[i]);
           }
         }
         }
   }
  
  
    }
