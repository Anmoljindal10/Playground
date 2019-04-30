import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    for(int idx=0; idx<size; idx++)
    {
      arr[idx]=in.nextInt();
    }
    int largest=0; 
    int result=0;
    for( int i=0; i<size; i++)
    {
      if(arr[i]> largest)
      {
        largest=arr[i];
        result=i;
      }
    }
    System.out.print(result);
  }
}