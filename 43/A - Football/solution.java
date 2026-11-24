import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        HashMap<String, Integer> map = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
 
            String team = sc.next();
 
            map.put(team, map.getOrDefault(team, 0) + 1);
        }
 
        String ans = "";
        int max = 0;
 
        for (String team : map.keySet()) {
 
            if (map.get(team) > max) {
                max = map.get(team);
                ans = team;
            }
        }
 
        System.out.println(ans);
    }
}