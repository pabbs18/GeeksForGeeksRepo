package dummy;

import java.util.HashMap;
import java.util.Map;

public class LRuCache {
	private static Map<Integer, Node> map;
	private static Node head;
	private static Node tail;
	private static int capacity;
	private static int count;

	public LRuCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.prev = null;
		tail.next = null;
		head.next = tail;
		tail.prev = head;
		count = 0;
	}

	public void addNodeToHead(Node node) {
		node.next = head.next;
		node.next.prev = node;

		node.prev = head;
		head.next = node;
	}

	public void removeNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			int val = node.value;
			removeNode(node);
			addNodeToHead(node);
			return val;
		}
		return -1;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			node.value = value;
			removeNode(node);
			addNodeToHead(node);
		} else {
			Node node = new Node(key, value);
			map.put(key, node);
			count++;
			if (count <= capacity) {
				addNodeToHead(node);
			} else {
				map.remove(tail.prev.key);
				removeNode(tail.prev);
				addNodeToHead(node);
			}
		}
	}

	public static void main(String[] args) {
		LRuCache lruCache = new LRuCache(5);
		lruCache.set(1, 4);
		lruCache.set(2, 5);
		lruCache.set(3, 6);
		lruCache.set(4, 7);
		lruCache.set(5, 8);
		lruCache.set(6, 9);
		System.out.println(lruCache.get(2));
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