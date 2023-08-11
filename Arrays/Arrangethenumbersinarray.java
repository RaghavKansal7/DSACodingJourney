package Array;
import java.util.Scanner;

public class Arrangethenumbersinarray {
    public static void main(String[]args){
       
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
         int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=n;
        }
        for(int j=0;j<n/2;j++){
            arr[j]=(2*j)+1;
            arr[n-j-1]=(2*j)+2;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
