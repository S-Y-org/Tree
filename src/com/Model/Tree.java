package com.Model;

public class Tree {

    /*Tree is a collection of nodes
    *
    * Node has been already implemented
    *
    * Wht is the special thing that we have to indicate as a Tree here
    *
    * We have Nodes, thats right , But wht is the special Node that we have to have inside the tree ?
    *
    * It is the root Node*/

    private Node root;//first node af a  tree

    //Constructor
    /*In link list also although we had the first, we were about to implement it
    *
    * So their we made first=null;
    *
    * Same thing here. Tree is there. We are abt to implement it so root still doesnt have  anything*/
    public Tree() {
        root = null; //This is the condition to be statisfied to show that TREE IS EMPTY
    }

    //NOW LETS IMPLEMENT THE METHODS

    //FIND METHOD//

    //First we will implement the find()//


    /*Now the BEST WAY to get the logic is to use an example
    *
    * Example drawn in lec slide no - 26 ; CHECK*/

    /*Lets say we want to find(45)*/

    /*Just connect this scenario with a Link List and see how we found a value there
    *
    * Link list we had only the first
    *
    * In a Tree we have only the root
    *
    * Just like the link list starts from first , here also every operation start from the root
    *
    *
    * 1)Since we cant move the root, we need  another Node type object called current and move it through a loop
    *
    *
    * //Now in the diagram we can see that 45 is in the left-side
    *
    * This is a New thing, we didn't have it in the link list
    *
    * So how do we do it ? How do we say that we want to go to left
    *
    * Inside the loop , u have to check the current value(50) and ur finding value(45)
    *
    * If ur finding value is lesser --> GO TO LEFTHAND SIDE
    *
    * If ur finding value is greater or equal ----> GO TO THE RIGHTHAND SIDE
    *
    *
    * Our finding value is 45 , which is lesser than the current value(50)
    *
    * So we have to move to LEFT, then current will be at the left child which is 40
    *
    * Now my current is pointing to 40 , so again check
    *
    * Current value is 40 , finding value is 45
    *
    * finding value > current value means ; GO TO THE RIGHT CHILD
    *
    * Now the current is at 45
    *
    * Now current value and finding value EQUALS MEANS ; I FOUND IT !
    *
    * Then just return the current Node
    *
    * IMPORTANT
    *
    * The condition to be satisfied to move the current to left or right is happening when current value IS NOT EQUAL TO THE key value
    * And based on the lesser or greater value
    * */

    public Node find(int key){ //data type can be boolean as well
        Node current = root;

        while (current.iData != key){
            /*Now we have to check whether to go to left or right*/
            if(key < current.iData) //checking whether 45 is less than 50
                current = current.leftChild; //moving the current to the left child ; this is just like current = current.next in link list
            else
                current = current.rightChild;

            /*Let say we have to find(100) , that value is not in the Tree
             *
             * If the value is not found wht to do AND where r u going to put this code segment in ?
             *
             * Let understand the logic first
             *
             * current is at 50 , 100 is greater than 50 , so go to Right child
             *
             * current is at 60, 100 is greater than 60 , so go to Right child
             *
             * Now here we don't have a right child , there nothing / null
             *
             * So current is moved to a place  u dont have anything
             *
             * That means current is null
             *
             * So remember current null means the value is not there
             *
             * We came till the end of the tree but 100 is not there
             *
             * Since we go here and there using current we HAVE TO PLACE THE CODE SEGEMENT INSIDE THE WHILE-LOOP
             *
             * U CANT GO OUT FROM THE WHILE
             *
             * GOING OUT FROM THE WHILE MEANS U FOUND THE VALUE*/
            if (current == null)
                return null;
        }//end of while-loop
        /*We go here and there using the while loop if key != to current.iData know
        * If it is equal just return it
        *
        * So going outside the while-loop means u found the value*/
        return current;
    }//end of find()




        //INSERT METHOD//

    /*Let take an example to understand the logic
    *
    * Check example in lec slide 27*/

    /*I want to insert 70 and whtever the other double value(dd)*/

    /*In Link List class, in the method signature we pass only a value
    * A value cannot be inserted to the link list
    * So from that value we create a new link first*/

    /*Here the same, 70 u cant just insert to the Tree
    *
    * Tree is a collection of Nodes
    *
    * 1)So from that 70 we have to create a Node first
    *
    * For creation of a Node, we have to call the constructor
    *
    * But in constructor we didn't do anything
    *
    * continued inside the insert()...................*/



    public void insert(int id, double dd){ //id is the key and dd is the other data item , our main concern is on the key value(id)

        Node newNode = new Node();

        /*Since we didnt pass any parameter inside the constructor , we have to assign them as below*/
        newNode.iData = id;
        newNode.dData = dd;

        /*Now we have the new node(70), wht to do now ?
        *
        * First of all u have to find a proper place to insert the 70
        *
        * So this is like a find operation
        *
        * We compare the current and the id value
        *
        * id(70) is greater than current(50)
        *
        * current moves to right child
        *
        * Again check ; 70 >60
        *
        * So current moves to right child
        *
        * But now NO right child or left child. Tree is at the end
        *
        * Right child nothing means that is the perfect place where i can insert 70
        *
        * So I want to insert my 70 as the right child of 60
        *
        *
        * NOW HOW ARE WE GOING TO IDENTIFY 60 ? WHTS THE GENERAL NOTATION TO DO THAT
        *
        * Here we can do simply by using root.rightchild , but its not always like that.
        *
        * We have to think of a general way
        *
        * Its not current , cuz current is pointing to null
        *
        * And there is nothing called previous also in Trees
        *
        * BUT ACTUALLY U CAN SEE THAT ; its like the previous of current
        *
        * Remember wht we did in Link list delete() with current and previous with a 1 gap difference
        *
        * Here also same thing
        *
        * Then only i can say that previous's(60) right child is my new node*/

        /* //IMPORTANT
        *
        * Like in a link list , Here we dont say insert after this.
        *
        * To find the correct place , we have to move here and there.
        *
        * When current BECOMES null, that is the perfect place to insert the 70
        *
        * After inserting the entire insert() mehod is over
        *
        * We dont have to true , false condition for the while-loop
        *
        * Since anyway the iteration has to be done when finding current == null place
        *
        * So until this place is found while-loop has to iterate
        *
        * In the lecture slide we have taken the condition for while as true
        *
        * A perfect condition is not there
        *
        * while(true) means its always iterating
        *
        * */

        //Lets start to code now

        /*First of all lets say we are going to insert 70 and there is no Tree, NO root(start position)
        *
        * So if nothing is there wht happens to the 70 ?
        *
        * U HAVE TO INSERT THE 70 AS THE ROOT*/

        /*So lets check whether our root is null or not*/

        if (root == null){//no node in the root
            root = newNode; //insert the newNode as the root
        }
        else{//root occupied

            Node current = root; //start at the root
            Node previous = root; //we need to have a previous becuz after we find the current == null place , we have to make a connection with the previous node
            /*In lecture slides they've defined previous as parent*/


            while (true){

                /*We have to maintain that 1 gap difference between the previous and the current*/
                previous = current; //previous should come to the place where current is

                //Aftet the if condition current is moving to either left or right

                //Lets check on the left , right situation

                if (id < current.iData){//go left
                    current = current.leftChild;

                    /*Now we have to check whether we have a place to insert the 70*/
                    if (current == null){
                        previous.leftChild = newNode;
                        /*previous means 60
                         * previous.leftchild means the place where we found to be current == null and we r going to insert 70
                         * 70 means newNode*/
                        return; // since while condition is always true, we just have to type return;
                    }
                }
                else{
                    current = current.rightChild;

                    /*Now we have to check whether we have a place to insert the 70*/
                    if (current == null){
                        previous.rightChild = newNode;
                        /*previous means 60
                         * previous.rightChild means the place where we found to be current == null and we r going to insert 70
                         * 70 means newNode*/
                        return; // since while condition is always true, we just have to type return;
                    }
                }
            }//end of while-loop
        }//end of else
    }//end of insert()

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   // Inorder Traversing Method

    ///////////////////////////////////////////////////////////////////////////////////////////
    //NOTE - common for all 3 methods
    /*For a Tree we can have only one Root (Main Root)
    *
    * When coming to Subtrees , we have sub roots
    *
    * So ALL THE ROOTS(Main ,sub) coming to null means that is the end of the tree
    *
    * That we have denoted using the  if(localRoot != null) condition
    *
    * And we call the same method up until we dont get a root or the end of the tree*/
    ///////////////////////////////////////////////////////////////////////////////////////////

    private void inOrder(Node localRoot)
    {
        /*Until the root comes to null THAT MEANS until u r coming to the end of the tree  ;
        *
        * If it is Inorder -  LEFT ,ROOT ,RIGHT  */
        if (localRoot != null)
        {
            inOrder(localRoot.leftChild); //We call the same method. This is called Recursion. First LEFT
            localRoot.displayNode();//then go for the ROOT and display
            inOrder(localRoot.rightChild); //finally RIGHT
        }
    }

    //Preorder Traversing Method

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
}//end of Tree  Class
