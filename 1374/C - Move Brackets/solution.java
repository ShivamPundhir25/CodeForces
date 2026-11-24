import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
 
            int p = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    p++;
                }
                else {
                    p--;
                }
                if (p < 0) {
                    ans++;
                   p=0;
                }
            }
 
            System.out.println(ans);
        }
    }
}
 