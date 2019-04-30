import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]= new int[size];
      int largest=0;
 
      for(int idx=0; idx<size; idx++)
      {
        arr[idx]=in.nextInt();
      }
      for(int i=0; i<size; i++)
      {
        if(arr[i]>largest)
        {
          largest=arr[i];
        }
      }
      System.out.println(largest);
    }
}


