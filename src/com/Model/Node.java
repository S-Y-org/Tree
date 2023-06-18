package com.Model;

public class Node {
    public int iData;//data item(Used as Key value)
    public double dData;//other data
    public Node leftChild;// this node's left child
    public Node rightChild;// this node's right child

    /*In Lecture slides also Constructor is not implemented
    * So that means the above variables are not yet initialized or assigned
    * That will happen in the relevant places; either MainApp or method bodies*/
    public Node() {
    }

    public void displayNode(){
        System.out.println(iData + "," + dData);
    }
}//end of Node Class
