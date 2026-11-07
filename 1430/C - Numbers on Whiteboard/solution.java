import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int current = n;
            System.out.println(2);
            for (int i = n - 1; i >= 1; i--) {
                System.out.println(i + " " + current);
                current = (i + current + 1) / 2;
            }
        }
 
        sc.close();
    }
}