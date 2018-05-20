package com.leetcode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree_98 {

    /*
    This approach is wrong as this will return true for below binary tree (and below tree is not a BST because 4 is in
    left subtree of 3)
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean res = true;
        if (root.left != null ) {
            if (root.val < root.left.val) {
                res = false;
            } else {
                isValidBST(root.left);
            }
        }
        if (root.right != null) {
            if (root.val > root.right.val) {
                res = false;
            } else {
                isValidBST(root.right);
            }
        }
        return res;
    }

    public boolean isValidBST2(TreeNode n, int mix, int max) {
        if (n == null) return true;



        if (n.left != null && n.val > n.left.val) {
            return false;
        } else {
            return isValidBST(n.left, )
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
