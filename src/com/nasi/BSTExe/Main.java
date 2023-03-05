package com.nasi.BSTExe;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-10,-3,0,3,7,11,18,25,32,50,125,175,200,500));
		ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(190,-3,0,141,18,-55,-90,92,200,-150,11,80,-65,90));
		SearchTree tree = fillTree(numbers);
		SearchTree tree1 = fillTree(numbers1);
		SearchTree.printInOrder(tree.root);
		System.out.println();
		SearchTree.printInOrder(tree1.root);
		System.out.println();

		SearchTree.minAndMax(tree);
		SearchTree.minAndMax(tree1);


		ArrayList<TreeNode> nodes = SearchTree.sorted(tree);
		ArrayList<TreeNode> nodes1 = SearchTree.sorted(tree1);

		for(TreeNode node : nodes){
			System.out.print(node.value + " --> " );
		}
		System.out.println();

		for(TreeNode node : nodes1){
			System.out.print(node.value + " --> " );
		}
	}

	public static SearchTree fillTree(ArrayList<Integer> numbers) throws Exception {
		if (numbers.size() != 14){
			throw new Exception("Puo inserire 14 valore");
		}
		SearchTree tree = new SearchTree(new TreeNode(numbers.get(0)));
		numbers = new ArrayList<>(numbers.subList(1, numbers.size()));

		for (Integer number : numbers){
			SearchTree.add(tree, number);
		}


		return tree;
	}
}
