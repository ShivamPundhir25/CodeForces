import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
 
            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
 
            Arrays.sort(a);
            Arrays.sort(b);
 
            int i = 0, j = 0;
            int countA = 0, countB = 0;
 
            StringBuilder ans = new StringBuilder();
 
            while (i < n && j < m) {
 
                if (countA == k) {
                    ans.append(b[j++]);
                    countB++;
                    countA = 0;
                }
                else if (countB == k) {
                    ans.append(a[i++]);
                    countA++;
                    countB = 0;
                }
                else if (a[i] < b[j]) {
                    ans.append(a[i++]);
                    countA++;
                    countB = 0;
                }
                else {
                    ans.append(b[j++]);
                    countB++;
                    countA = 0;
                }
            }
 
            System.out.println(ans);
        }
 
       
    }
}