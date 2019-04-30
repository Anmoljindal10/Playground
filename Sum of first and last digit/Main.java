import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
 int n1=in.nextInt();
int last_digit=n1%10;
      int first_digit=n1;
      while(n1>=10)
      {
       n1= n1/10;
      }
      first_digit=n1;
      int sum=first_digit+last_digit;
      System.out.println(sum);
      
	}
}