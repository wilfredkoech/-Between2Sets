package hackerrank;
import java.util.*;
public class Between2Sets {
    private static boolean dividesAll(long arrs[], long n){
        for(int i=0;i<arrs.length;i++){
            if(arrs[i]%n != 0){
                return false;
            }
        }
        return true;
    }
   private static boolean isDividedByAll(long arrs[], long n){
        for(int i=0;i<arrs.length;i++){
            if(n%arrs[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        int m = sc.nextInt();
        for(int i=0;i<n;i++) a[i]=sc.nextLong();
        long[] b = new long[m];
        for(int j=0;j<m;j++) b[j] = sc.nextLong();
        
        Arrays.sort(a);
        Arrays.sort(b);
        long minim = 0;
        long maximu = 0;
        if(a.length != 0 && b.length !=0){
            minim = Math.min(a[0], b[0]);
            maximu = Math.max(a[a.length-1], b[b.length-1]);
        }
        int count = 0;
        for(long i=minim;i<=maximu;i++){
            if(dividesAll(b, i) && isDividedByAll(a, i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
