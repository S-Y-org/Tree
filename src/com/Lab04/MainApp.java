package com.Lab04;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Tree t1 = new Tree();

        t1.insert(149,"Anusha");
        t1.insert(167,"Kosala");
        t1.insert(047,"Dinusha");
        t1.insert(066,"Mihiri");
        t1.insert(159,"Jayani");
        t1.insert(118,"Nimal");
        t1.insert(195,"Nishantha");
        t1.insert(034,"Avodya");
        t1.insert(105,"Bimali");
        t1.insert(133,"Sampath");

        System.out.println("Inorder(left,root,right)\n");
        t1.traverseInOrder();

        System.out.println("\nPreorder(root,left,right)\n");
        t1.traversePreOrder();

        System.out.println("\nPostorder(left,right,root)\n");
        t1.traversePostOrder();

        int value;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Employee Number : ");
        value = scanner.nextInt();
        t1.find(value);

        System.out.println();
        t1.deleteAll();

        System.out.println("\nAfter Delete Method Calling");
        t1.callRecursive(150);

        System.out.println("Inorder(left,root,right)\n");
        t1.traverseInOrder();

        System.out.println("Preorder(root,left,right)\n");
        t1.traversePreOrder();

        System.out.println("Postorder(left,right,root)\n");
        t1.traversePostOrder();

        Node n1 = new Node();
        System.out.println();
        n1.displayNode();
    }//end of Main
}
