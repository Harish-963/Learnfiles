package Collections;

import java.util.*;        

class ArrayDequeDemo
{
    public static void main(String arg[])
    {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
        //Use an ArrayDeque like a queue
        adq.add(1);
        adq.add(2);
        adq.add(3);
        adq.add(4);
        //adq.add(null); LINE A
        System.out.print("Elements of queue: ");
        while(adq.peek()!=null)
        System.out.print(adq.pop()+"\t");
        System.out.println();
        System.out.print(" Elements of stack: ");
        //Use an ArrayDeque like a stack
        adq.push(1);
        adq.push(2);
        adq.push(3);
        adq.push(4);
        while(adq.peek()!=null)
        System.out.print(adq.pop()+"\t");
    
    }
}