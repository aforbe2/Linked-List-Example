package LinkPackage;

public class LinkedListClass {

	static Node head;

	public static void main(String[] args) {

	}

	public static void insert(int val) {
		Node temp = new Node(val);
		Node ptr = head;
		Node prev = ptr;

		if (head == null) {
			head = temp;
			return;
		}
		if (val < head.data) {
			temp.next = head;
			head = temp;
			return;
		}
		while (ptr != null) {
			if (val > ptr.data) {
				prev = ptr;
				ptr = ptr.next;
			} else {
				temp.next = prev.next;
				prev.next = temp;
				return;
			}
		}
		prev.next = temp;
	}

	public static int length() {
		int length = 0;
		Node ptr = head;
		while (ptr != null) {
			length++;
			ptr = ptr.next;
		}
		return length;
	}

	public static void remove(int value) {
		Node ptr = head;
		Node prev = ptr;
		if (head.data == value) {
			head = head.next;
		}
		while (ptr != null) {
			if (ptr.data == value) {
				prev.next = ptr.next;
				return;
			}
			prev = ptr;
			ptr = ptr.next;
		}
	}

	public static void print() {
		Node ptr = head;
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}

}

class Node {
	int data;
	Node next;

	Node() {
		data = 0;
		next = null;
	}

	Node(int val) {
		data = val;
		next = null;
	}
}