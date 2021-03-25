package com.nat.ds.TREE;

public class Tree {
    public TreeNode root;

    public void insert(int data){
        TreeNode t=new TreeNode(data);
        if(root==null){
            root=t;
        } else{
            TreeNode curr=root;
            TreeNode parent=root;
            boolean isLeftChild=false;
            boolean isRightChild=false;
            while(curr!=null){
                parent=curr;
                if(curr.data>data){
                    curr=curr.left;
                    isLeftChild=true;
                } else{
                    curr=curr.right;
                    isRightChild=true;
                }
            }
            if(isLeftChild){
                parent.left=t;
            } else{
                parent.right=t;
            }
        }
    }

    public void insertNode(int val){
        if(root==null){
            root=new TreeNode(val);
        } else{
            TreeNode curr=root, parent=null;
            boolean isleft=false;
            while(curr!=null){
                parent=curr;
                if(curr.data>val){
                    isleft=true;
                    curr=curr.left;
                } else{
                    isleft=false;
                    curr=curr.right;
                }
            }
            if(isleft) parent.left=new TreeNode(val);
            else parent.right=new TreeNode(val);
        }
    }

    public boolean isBalancedBinaryTree(TreeNode head){
        boolean isbal=true;
       if(head==null || (head.left==null &&head.right==null)){
           return true;
       }
       if((head.left==null &&head.right!=null) || (head.left!=null &&head.right==null))
           return false;
       if(head.right!=null)
            return  isBalancedBinaryTree(head.right);
        if(head.left!=null)
            return  isBalancedBinaryTree(head.left);

        return true;
    }

    public boolean isFind(TreeNode curr,int val){
        if(curr==null)
            return false;
        if(curr.data>val)
            return isFind(curr.left,val);
        if(curr.data<val)
            return isFind(curr.right,val);
        return true;
    }
}
