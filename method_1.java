import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < 3 ; i++)
        {
            q.add(i);
        }
        
        System.out.println(q.size());
        printQueue(q1(q));
    }

    public static Queue<Integer> q1(Queue<Integer> q)
    {
        Queue<Integer> toReturn = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i <size; i++)
        {
          int a = q.poll();
            toReturn.add(a);
            toReturn.add(a);
        }
        
        return toReturn;
    }

    public static void printQueue(Queue<Integer> q)
    {
        int size = q.size();
        for (int i = 0; i <size; i++)
        {
            System.out.print(q.poll() + ",");
        }
    }
}
