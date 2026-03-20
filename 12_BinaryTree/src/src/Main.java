public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {15,8,12,4,3,7,20};
        bst.populate(nums);
        bst.display();
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        bst.populateSorted(nums);
        bst.postOrder();
=======
//        BinarySearchTree bst = new BinarySearchTree();
//        int[] nums = {15,8,12,4,3,7,20};
//        bst.populate(nums);
//        bst.display();
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        bst.populateSorted(nums);
//        bst.postOrder();

        AVL tree = new AVL();
        tree.populate(new int[]{10,20,30,40});
        System.out.println(tree.height());
>>>>>>> 60b5176e424f26e15f02a44d089ff1ccec82f191
    }
}
