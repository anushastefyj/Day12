import java.util.*;
public class removing_key
{
    public static void main(String args[])
    {
    HashMap<String,String> a=new HashMap<>();
    a.put("SNO","01");
    a.put("Sname","anu");
    System.out.println(a);
    a.remove("Sname");
    System.out.println(a);
    a.clear();
    System.out.println(a);
}
}