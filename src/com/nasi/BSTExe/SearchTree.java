package com.nasi.BSTExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTree {

	public TreeNode root;

	public SearchTree(TreeNode root){
		this.root = root;
	}

	public static void add(SearchTree tree, Integer value){
		addRec(tree.root, value);
	}
	public static TreeNode addRec(TreeNode node, Integer value){
		if (node == null){
			node = new TreeNode(value);
		} else {
			if (value <= node.value){
				node.left = addRec(node.left, value);
			} else {
				node.right = addRec(node.right,value);
			}
		}
		return node;
	}

	public static void minAndMax(SearchTree tree){
		findMin(tree.root);
		findMax(tree.root);
	}

	public static void findMin(TreeNode node){
		if (node.left == null){
			System.out.println("Min is " + node.value);
		}else{
			findMin(node.left);
		}
	}

	public static void findMax(TreeNode node){
		if (node.right == null){
			System.out.println("Max is " + node.value);
		}else{
			findMax(node.right);
		}
	}

	public static ArrayList<TreeNode> sorted(SearchTree tree){
		ArrayList<TreeNode> nodes = new ArrayList<>();
		sortedRec(nodes, tree.root);
		return nodes;
	}

	public static void sortedRec(List<TreeNode> nodes, TreeNode node){
		if(node == null){
			return ;
		}
		sortedRec(nodes, node.left);
		nodes.add(node);
		sortedRec(nodes, node.right);

	}

	public static void printInOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.value + " -> ");
		printInOrder(node.right);
	}
}
