public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {15,8,12,4,3,7,20};
        bst.populate(nums);
        bst.display();
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        bst.populateSorted(nums);
        bst.postOrder();
    }
}
