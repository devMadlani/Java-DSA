import java.util.*;

public class Main {
    private static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
        private  Node root;

        //insert element
        public void populate(Scanner scanner){
            System.out.println("Enter the root Node: ");
            int val = scanner.nextInt();
            root = new Node(val);
            populate(scanner, root);
        }

        private void populate(Scanner scanner, Node node){
            System.out.println("Do you want to enter left of " + node.val );
            boolean left = scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value of left of " + node.val);
                int val = scanner.nextInt();
                node.left = new Node(val);
                populate(scanner, node.left);
            }

            System.out.println("Do you want to enter right of " + node.val );
            boolean right = scanner.nextBoolean();
            if(right){
                System.out.println("Enter the value of right of " + node.val);
                int val = scanner.nextInt();
                node.right = new Node(val);
                populate(scanner, node.left);
            }
        }
    }
}
