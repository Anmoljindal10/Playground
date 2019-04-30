import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
     int n1=in.nextInt();
    int fir=n1/100;
    int sec=((n1/10)%10);
    int thi=n1%10;
    int reverse=(thi*100)+(sec*10)+(fir);
    System.out.println(reverse);
    




  }
}