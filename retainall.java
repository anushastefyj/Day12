import java.util.*;
public class retainall{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
         int m=s.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=s.nextInt();
        }
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s2:arr1)
        a.add(s2);
        for(int s1:arr2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<Integer> u=new HashSet<>(a);
        u.retainAll(b);
        System.out.println(u);
    }
}