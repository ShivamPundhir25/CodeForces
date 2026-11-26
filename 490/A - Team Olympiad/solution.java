import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                a.add(i);
            } 
            else if (x == 2) {
                b.add(i);
            } 
            else {
                c.add(i);
            }
        }
 
        int teams = Math.min(a.size(),
                     Math.min(b.size(), c.size()));
 
        System.out.println(teams);
 
        for (int i = 0; i < teams; i++) {
            System.out.println(
                a.get(i) + " " +
                b.get(i) + " " +
                c.get(i)
            );
        }
 
        sc.close();
    }
}