import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
       int num=in.nextInt();
      int sum=0;
      int temp=num;
      while(num>0)
      {
        int n=num%10;
        int fact=1;
        while(n>0)
        {
          fact=fact*n;
          n=n-1;
        }
        sum=sum+fact;
        num=num/10;
      }
      if(sum==temp)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}