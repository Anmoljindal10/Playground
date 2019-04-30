import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
int num=in.nextInt();
      int fact=1;
      while(num>0)
      {
        fact=fact*num;
        num=num-1;
      }
      System.out.println(fact);

	}
}