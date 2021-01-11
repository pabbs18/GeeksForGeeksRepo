/**
 * 
 */
package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 */
public class AdjancencyListForUnDirectedGraph {
	/*
	 *  @param u, vertex
	 *  @param v, vertex
	 *  @param arrList, adjacency List
	 *  
	 *  */
	public static void addAnEdge(List<List<Integer>> arrList, int u, int v) {
		arrList.get(u).add(v);
		arrList.get(v).add(u);
	}

	public static void printAdjacencyList(List<List<Integer>> arrList) {
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print("Head->");
			for (int j = 0; j < arrList.get(i).size(); j++) {
				System.out.print(arrList.get(i).get(j) + "-> ");
			}
			System.out.print("null");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add(new ArrayList<Integer>());
		}
		addAnEdge(list, 0, 1);
		addAnEdge(list, 0, 4);
		addAnEdge(list, 1, 4);
		addAnEdge(list, 4, 3);
		addAnEdge(list, 1, 3);
		addAnEdge(list, 1, 2);
		addAnEdge(list, 3, 2);

		printAdjacencyList(list);

	}

}
