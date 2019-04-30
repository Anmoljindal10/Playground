import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      
  Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int temp=n1;
      int count=0;
       if(n1 == 0)
       {
	        System.out.print(n1);
	    }
	    else
        {
      while(n1>0)
      {
        n1=n1/10;
        count=count+1;
      }
        }
      n1=temp;
      int sum=0;
     
      while(n1>0)
 {
      int last=n1%10;
     int pow=1;    
      for(int ccount=1; ccount<=count;ccount++)
      {
        pow=pow*last;
      }
      sum=sum+pow;
      n1=n1/10;
      }
      if(sum==temp)
      {
        System.out.println("Armstrong Number");
      }
 else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}