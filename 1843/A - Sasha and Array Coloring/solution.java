import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }       
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        int sum=0;
        while(l<r){
            sum+=(arr[r]-arr[l]);
            l++;
            r--;
        }
        System.out.println(sum);
     }
    }
}