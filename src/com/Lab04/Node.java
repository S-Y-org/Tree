package com.Lab04;

public class Node {
    public int empNo; //employee no
    public String name; //employee name
    public Node leftChild; // this node's left child
    public Node rightChild; // this node's right child

    public void displayNode(){
        System.out.println(empNo + "," + name);
    }
}//end of Node Class
