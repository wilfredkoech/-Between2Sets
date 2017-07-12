package hackerrank;
import java.util.*;
public class BirthDayCake {
    private static int sum(int array[],int start, int stop){
        int total = 0;
        for(int i=start;i<stop;i++){
            if(stop>array.length) break;
            total+=array[i];
        }
        return total;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int d = sc.nextInt();
        int m  =sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(sum(arr,i,i+m)==d){
                count++;
            }
        }
        System.out.println(count);
    }
}
