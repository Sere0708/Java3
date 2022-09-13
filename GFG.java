import java.util.*;
public class GFG {
public static void main(String args[]) throws Exception
{

List<Integer> list = new ArrayList<Integer>();

list.add( 12 );
list.add( 53 );
list.add( 30 );
list.add( 8 );

System.out.println( "List: " + list);

int minList = Collections.min(list);
int maxList = Collections.max(list);

System.out.println( "Minimum value of list is: "
+ minList);
System.out.println( "Maximum value of list is: "
+ maxList);
}
}