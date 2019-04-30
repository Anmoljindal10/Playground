import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
 int n1=in.nextInt();
      int second_digit=n1;
      while(n1>=100)
      {
       n1= n1/10;
      }
      second_digit=n1;
      int second=second_digit%10;
      System.out.println(second);
    }
}
