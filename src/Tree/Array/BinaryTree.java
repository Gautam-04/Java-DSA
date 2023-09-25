package Tree.Array;

import Tree.LL.BinaryNode;

public class BinaryTree {
    String[] arr;

    int lastUsedIndex;

    public BinaryTree(int size){
        arr = new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Blank Tree of size " + size + " has been created");
    }

    //isFull
    boolean isFull(){
        if(arr.length - 1 == lastUsedIndex){
            return true;
        }else {
            return false;
        }
    }

    //insert Method
    void Insert (String value){
        if(!isFull()){
            arr[lastUsedIndex] = value;
            lastUsedIndex++;
            System.out.println("Value inserted");
        } else{
            System.out.println("Tree is full");
        }
    }

    //Preorder Traversal
    public void Preorder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.println(arr[index] + " ");
        System.out.println(index*2);
        System.out.println(index*2 + 1);
    }
    //Inorder Traversal
    public void InOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        InOrder(index*2);
        System.out.println(arr[index] + " ");
        InOrder(index * 2 + 1);
    }
    //Postorder Traversal
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.print(arr[index] + " ");
    }
    //Level Order traversal
    public void levelOrder(){
        for (int i = 1; i <= lastUsedIndex ; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public int Search(String value){
        for (int i = 1; i <= lastUsedIndex ; i++) {
            if(arr[i] == value){
                System.out.println(value + "exists at the location" + i);
            }
        }
        System.out.println("The value does not exist");
        return -1;
    }

    // Delete Method
    public void delete(String value) {
        int location = Search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node successfully deleted");
        }
    }

    // Delete BT

    public void deleteBT() {
        try {
            arr = null;
            System.out.println("The BT has been successfully deleted");

        } catch (Exception e){
            System.out.println("There was an error deleting the tree");
        }
    }
}
