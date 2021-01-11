
package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *  A beautiful solution:
 *  https://practice.geeksforgeeks.org/viewSol.php?subId=70644411444607&pid=1529&user=Mirna%20Shamieh%201
 */
public class RotateAndDelete {

	public static int rotateAndDelete(int[] a) {
		if (a == null || a.length == 0) {
			return -1;
		}

		List<Integer> list = new ArrayList<>();

		for (Integer i : a) {
			list.add(i);
		}

		//counter to count the number of times the list needs to be rotated
		int counter = 0;

		while (list.size() > 1) {// Till only 1 element is left
			//first rotate(each time you rotate just once)
			int temp = list.get(list.size() - 1);// get the last element
			list.remove(list.size() - 1);// remove the last element
			list.add(0, temp);// add the last element to first place

			//remove the n-k+1 th element
			if (list.size() - counter > 0) {// if n-k is not out of bounds
				list.remove(list.size() - 1 - counter);
				counter++;// increment for after next rotation removal
			} else {//if n-k out of bounds
				list.remove(0);// just remove 1st element
			}
		}

		//once, only one element is left
		return list.get(0);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };//{ 1, 2, 3, 4, 5, 6 };
		System.out.println(rotateAndDelete(a));

	}

}
