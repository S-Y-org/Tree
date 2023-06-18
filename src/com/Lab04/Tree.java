package com.Lab04;

public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int emp){
        Node current = root;

        while (current.empNo != emp){
            if (emp < current.empNo)
                current = current.leftChild;
            else
                current = current.rightChild;

            if (current == null)
                return null;
        }

        return current;
    }//end of find()

    public void insert(int emp, String name){

        Node newNode = new Node();

        newNode.empNo = emp;
        newNode.name = name;

        if (root == null){
            root = newNode;
        }
        else {
            Node current = root;
            Node previous = root;

            while (true){
                previous = current;

                if (emp < current.empNo){
                    current = current.leftChild;

                    if (current == null){
                        previous.leftChild = newNode;

                        return;
                    }
                }
                else{
                    current = current.rightChild;

                    if (current == null){
                        previous.rightChild = newNode;

                        return;
                    }
                }
            }//end of while-loop
        }//end of else

    }//end of insert()

    private void inOrder(Node localRoot){
        if (localRoot != null){
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    public void traverseInOrder(){
        inOrder(root);
    }

    private void preOrder(Node localRoot)
    {
        /*Until the root comes to null THAT MEANS until u r coming to the end of the tree  ;
         *
         * If it is preorder -  ROOT ,LEFT ,RIGHT  */
        if (localRoot != null)
        {
            localRoot.displayNode(); //FIRST go for the ROOT and display
            preOrder(localRoot.leftChild);//then LEFT
            preOrder(localRoot.rightChild);//then RIGHT
        }
    }

    public void traversePreOrder(){
        preOrder(root);
    }

    //Postorder Traversing Method

    private void postOrder(Node localRoot)
    {
        /*Until the root comes to null THAT MEANS until u r coming to the end of the tree  ;
         *
         * If it is postorder -  LEFT ,RIGHT, ROOT   */
        if (localRoot != null)
        {
            postOrder(localRoot.leftChild); //First LEFT
            postOrder(localRoot.rightChild);//then RIGHT
            localRoot.displayNode(); //finally ROOT
        }
    }

    public void traversePostOrder(){
        postOrder(root);
    }

    ////////////////////////////////////////////
    //NOT TAUGHT IN LECTURES. UNDERSTAND CLEARLY
    ///////////////////////////////////////////

    private Node findRecursive(Node localRoot, int empno){
        if (localRoot == null){
            return null;
        } else if (localRoot.empNo == empno) {
            System.out.println(localRoot.name);
            return localRoot;
        } else if (empno < localRoot.empNo) {
            return findRecursive(localRoot.leftChild,empno);
        }
        else{
            return findRecursive(localRoot.rightChild,empno);
        }
    }//end of findRecursive()


    public Node callRecursive(int empno){
        return findRecursive(root,empno);
    }

    public void deleteAll(){
        root = null;
    }

}//end of Tree Class
