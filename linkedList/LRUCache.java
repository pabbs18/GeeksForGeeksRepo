/**
 * 
 */
package linkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neha Gaur
 * @author Prabhanjan
 * 
 *         Here we use a HashMap for O(1) access. Linked List because we have to
 *         implement using LinkedList according to the question.
 * 
 *         map entry looks like: [key, (key,value)]. We are doing it this way
 *         instead of [key,value], because while doing map.remove(key) of tail
 *         node's previous node from HashMap, we need to access the key of
 *         tail's previous' key. Since remove method takes only a key as an
 *         argument, and a node's(VALUE in our code) key is same as map's key in
 *         our code.
 * 
 */
public class LRUCache {

	private static int capacity, count;
	private static Map<Integer, Node> map;
	private static Node head, tail;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		count = 0;
		map = new HashMap<>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
		tail.next = null;
		head.prev = null;
	}

	public static void addToHead(Node node) {
		node.next = head.next;
		node.prev = head;
		head.next = node;
		node.next.prev = node;

	}

	public static void deleteNode(Node node) {
		node.next.prev = node.prev;
		node.prev.next = node.next;
	}

	public void set(int key, int value) {
		if (map.get(key) != null) {
			Node node = map.get(key);
			deleteNode(node);
			node.value = value;
			addToHead(node);
		} else {
			Node node = new Node(key, value);
			if (count < capacity) {
				count++;
			} else {
				map.remove(tail.prev.key);
				deleteNode(tail.prev);
			}
			map.put(key, node);
			addToHead(node);
		}
		return;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			deleteNode(node);
			addToHead(node);
			return node.value;
		}
		return Integer.MIN_VALUE;
	}

	public int getTopOfCache() {
		return head.next.value;
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(5);
		cache.set(1, 10);
		cache.set(2, 20);
		cache.set(3, 30);
		cache.set(4, 40);
		cache.set(5, 50);
		/*cache.set(6, 60);
		cache.set(7, 70);*/

		/*System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));
		System.out.println(cache.get(5));
		System.out.println(cache.get(6));
		System.out.println(cache.get(7));*/

		System.out.println("Top of Cache: " + cache.getTopOfCache());
		System.out.println("Accessed: " + cache.get(4));
		System.out.println("Top of Cache: " + cache.getTopOfCache());
	}

}

class Node {
	Node next;
	Node prev;
	int key;
	int value;

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}