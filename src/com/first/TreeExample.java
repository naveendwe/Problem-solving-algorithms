package com.first;

import java.util.LinkedList;
import java.util.Queue;

public class TreeExample {
     static class Node{
         int data;
         Node left, right;
         Node(int item){
             data = item;
             left = right = null;
         }
     }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx ++;
            Node root = null;
            if (nodes[idx] == -1) {
                return null;
            }
            root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);

            return root;
        }

    }
    // preorder traversal for DFS algorithm
    public static  void preOrder(Node node){
         if(node == null){
             return;
         }
         System.out.print(node.data + " ");
         preOrder(node.left);
         preOrder(node.right);
    }
    // inorder traversal for DFS algorithm
    public static void inOrder(Node node){
         if(node == null){
             return;
         }
         inOrder(node.left);
         System.out.print(node.data + " ");
         inOrder(node.right);
    }
    // postorder traversal for DFS algorithm
    public static  void postOrder(Node node){
         if(node == null){
             return;
         }
         postOrder(node.left); // these are important tree order traversal in this algorithms with java algorithms
         postOrder(node.right);
         System.out.print(node.data + " -> ");
    }
    // level order traversal for BFS algorithm
    public static void levelOrder(Node node){
         if(node == null){
             return;
         }
         Queue<Node> queue = new LinkedList<Node>();
         queue.add(node);
         queue.add(null);
         while(!queue.isEmpty()){
             Node temp = queue.remove();
              if(temp == null){
                  System.out.println();
                  if(queue.isEmpty()){
                      break;
                  }else{
                      queue.add(null);
                  }
              }else {
                  System.out.print(temp.data + " ");
                  if (temp.left != null)
                      queue.add(temp.left);
                  if (temp.right != null)
                      queue.add(temp.right);
              }
         }

    }
    // count of each nodes
    public static int countNodes(Node node){
         if(node == null)
             return 0;
         return 1 + countNodes(node.left) + countNodes(node.right);
    }
    // height of a binary tree
     public static int height(Node node){
         if(node == null)
             return 0;
         int leftHeight = height(node.left);
         int rightHeight = height(node.right);
         return (leftHeight > rightHeight)? leftHeight+1 : rightHeight+1;
     }
     // is binary tree balanced
     public static boolean isBalanced(Node node){
         if(node == null)
             return true;
         int leftHeight = height(node.left);
         int rightHeight = height(node.right);
         if(Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right))
             return true;
         return false;
     }
     // mirroring a binary tree
     public static Node mirror(Node node){
         if(node == null)
             return null;
         Node temp = node.left;
         node.left = mirror(node.right);
         node.right = mirror(temp);
         return node;
     }
     // sum of all nodes
     public static int sumOfNodes(Node node){
         if(node == null)
             return 0;
         return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
     }
     //finding subtrees
     public static boolean findSubtree(Node root, Node subRoot){
         if(root == null && subRoot == null)
             return true;
         if(root == null || subRoot == null)
             return false;
         if(root.data!= subRoot.data)
             return false;
         return findSubtree(root.left, subRoot.left) && findSubtree(root.right, subRoot.right);
     }
    // sum of nodes at kth level
     public static int sumOfNodesAtKthLevel(Node node, int k){
         if(node == null || k < 1)
             return 0;
         if(k == 1)
             return node.data;
         return sumOfNodesAtKthLevel(node.left, k-1) + sumOfNodesAtKthLevel(node.right, k-1);
     }
     public static boolean findNode(Node node, int k){
         if(node == null)
             return false;
         if(node.data == k)
             return true;
         return findNode(node.left, k) || findNode(node.right, k);
     }
     public static Node deleteNode(Node node, int k){
         if(node.data > k){
             node.left = deleteNode(node.left, k);
         }else if(node.data < k){
             node.right = deleteNode(node.right, k);
         }
         else{
               // case 1
             if(node.left == null && node.right == null){
                 return null;
             }
             // case 2
             if(node.left == null) {
                 return node.right;
             }else if(node.right == null){
                 return node.left;
             }
             // case 3
             Node ls = inorderSuccessor(node.right);
             node.data = ls.data;
             node.right =  deleteNode(node.right, ls.data);
         }
         return node;
     }
     public static Node inorderSuccessor(Node node){
         while(node.left!= null){
             node = node.left;
         }
         return node;
     }

     //diameter of nodes
     public static void main(String[] args){
         int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       //  int[] node = {1,2,3,4,5,6,7,8};
         Node root = BinaryTree.buildTree(nodes);
         //System.out.println(root.data);
         int sum = sumOfNodesAtKthLevel(root,7);
         System.out.println(sum);
         boolean found = findNode(root, 8);
         System.out.println("found : "+found);
//         Node no  = deleteNode(root, 5);
//         System.out.println(no.data+" -> ");

     }
}
