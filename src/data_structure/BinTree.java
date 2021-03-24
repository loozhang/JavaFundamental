package data_structure;

import common.TreeNode;

//https://www.cnblogs.com/karrya/p/11216039.html
public class BinTree {
    public static void main(String[] args) {

        //使用数组初始化二叉树，并打印
        TreeNode root = new TreeNode();
        root.left = null;
        root.right = null;

        Integer[] arr = new Integer[]{1,2,2,null,3,null,3};
        root.left = root.createBinaryTreeByArray(arr,0);
        root.printf(root,0);
        System.out.println(isSymmetric(root.left));

//        TreeNode root = new TreeNode();
//        root.left = null;
//        root.right = null;
//
//        BinTree binTree = new BinTree();
//
//        TreeNode p = null;
//
//        p = binTree.insertLeftChild(root, 'A');
//        p = binTree.insertLeftChild(p, 'B');
//        p = binTree.insertLeftChild(p, 'D');
//        p = binTree.insertRightChild(p, 'G');
//        p = binTree.insertRightChild(root.left, 'C');
//        binTree.insertLeftChild(p, 'E');
//        binTree.insertRightChild(p, 'F');
//
//
//        binTree.printf(root, 0);
//
//        System.out.print("前序遍历 ");
//        binTree.preOrder(root.left);
//        System.out.println();
//
//        System.out.print("中序遍历 ");
//        binTree.inOrder(root.left);
//        System.out.println();
//
//        System.out.print("后序遍历 ");
//        binTree.postOrder(root.left);
//        System.out.println();
//
//        TreeNode findNode = binTree.search(root,'E');
//        if (findNode == null){
//            System.out.println("没有找到E");
//        }else{
//            System.out.println("元素E在二叉树中");
//        }
//
//        System.out.println("删除元素E");
//        binTree.deleteLeftChild(p);
//
//        TreeNode findE = binTree.search(root,'E');
//        if (findE == null){
//            System.out.println("没有找到E");
//        }else{
//            System.out.println("元素E在二叉树中");
//        }

    }


    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isSymmetric(root.left, root.right);
    }
    public static boolean  isSymmetric(TreeNode left, TreeNode right) {
        if (left==null && right==null) return true;
        if (left!=null && right==null || left==null && right!=null || left.val != right.val) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
