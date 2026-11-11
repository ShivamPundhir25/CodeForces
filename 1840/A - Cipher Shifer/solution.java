import java.util.*;
public class Main{
   
    public static void main(String[] args) {
        //StringBuilder sb =  new  StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            String s = sc.next();
            StringBuilder sb =  new  StringBuilder();
            int ind=0;
            while(ind<n){
                char ch = s.charAt(ind);
                for(int i=ind+1;i<n;i++){
                    if(s.charAt(i)==ch){
                        sb.append(ch);
                        ind=i+1;
                        break;
                    }
                }
               
            }
             System.out.println(sb.toString());
    }
    
}
}