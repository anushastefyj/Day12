import java.util.*;
class remove{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
         int m=s.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();
        }
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int s1:arr1)
            a.add(s1);
        for(int s2:arr2)
            b.add(s2);
        System.out.println(a);
        System.out.println(b);
        Set<Integer> c=new HashSet<>(a);
        c.removeAll(b);
        System.out.println(c);
    }
}