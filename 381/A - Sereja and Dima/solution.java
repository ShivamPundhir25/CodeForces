import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int s = 0;
        int d = 0;
 
        int l = 0;
        int r = n-1;
        
        boolean sereja = true;
 
        while(l <= r) {
            int pick;
            if(arr[l] > arr[r]) {
                pick = arr[l];
                l++;
            } else {
                pick = arr[r];
                r--;
            }
 
            if(sereja) {
                s += pick;
            } else {
                d += pick;
            }
 
            sereja = !sereja;
        }
 
        System.out.println(s + " " + d);
    }
}