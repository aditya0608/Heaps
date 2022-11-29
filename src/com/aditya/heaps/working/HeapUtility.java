package com.aditya.heaps.working;

import java.util.ArrayList;
import java.util.List;

public class HeapUtility {

    ArrayList<Node> nodeList=new ArrayList<>();
    Node rootNode;
    /**
     * add a Node into the heap structure
     */

    public Node addNode(Node node)
    {
        if(nodeList.size()==0)
        {
            rootNode=node;
            nodeList.add(node);
        }
        else {
            Node parent=nodeList.get((nodeList.size()-1)/2);
            node.setParent(parent);
            nodeList.add(node);

            if(nodeList.size()%2==0) parent.setLeft(node);
            else
                parent.setRight(node);
        }
        return node;
    }

    /**
     * delete/poll
     * deletes a node from the heap structure and returns it
     * @return
     */

    public Node deleteNode()
    {
        return new Node(3);
    }

    /**
     * Builds a heap from the given dataset
     * @param nodes
     * @return
     */
    public Node buildHeap(List<Node> nodes)
    {

        return nodes.get(0);
    }

    /**
     * Return the node at the top without deleting
     * @return
     */
    public Node peek()
    {
        return new Node(5);
    }

    public Node getRootNode()
    {
        return rootNode;
    }
}
