package com.aditya.heaps.working;

import java.util.LinkedList;
import java.util.Queue;

public class HeapRunner {

    public static void main(String[] args) {
        HeapUtility heapUtility=new HeapUtility();
        Node node=new Node(5);
        heapUtility.addNode(node);
        heapUtility.addNode(new Node(6));
        heapUtility.addNode(new Node(7));
        heapUtility.addNode(new Node(8));
        heapUtility.addNode(new Node(9));
        heapUtility.addNode(new Node(10));



        Node rootNode=heapUtility.getRootNode();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(rootNode);

        while(!queue.isEmpty())
        {
            Node pulledOut=queue.poll();
            System.out.println("Root  "+pulledOut.getData());
            if(pulledOut.getLeft()!=null) {
                System.out.print(pulledOut.getLeft().getData() + " ");
                queue.offer(pulledOut.getLeft());
            }

            if(pulledOut.getRight()!=null)
            {
                System.out.print(pulledOut.getRight().getData());
                queue.offer(pulledOut.getRight());
            }
            System.out.println();
        }
    }
}
