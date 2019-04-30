import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
       int n1=in.nextInt();
int sum=0;
     
      for( int count=1; count<=n1; count=count+1)
      {
            sum=sum+count;
      
      }
      System.out.println(sum);
	}
}