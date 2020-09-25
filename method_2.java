/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playgroundlik;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class PlayGroundLik
{

    /**
     * @param args the command line arguments
     */
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
            toReturn.add(q.peek());
            toReturn.add(q.poll());
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
