import java.util.*;
public class foreach2
{
    public static void main(String args[])
    {
        int arr[]={1,5,6,7,9,7,5,6,3};
    HashMap<Integer,Integer> a=new HashMap<>();
    for(int a1:arr)
    {
if(a.containsKey(a1))
     {
    a.put(a1,a.get(a1)+1);
     }
        else
        {
            a.put(a1,1);
        }
    }
    System.out.println(a);
     }
   }
    
