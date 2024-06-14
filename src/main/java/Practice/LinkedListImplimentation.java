package Practice;

import java.util.LinkedList;

public class LinkedListImplimentation {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<>();
		list.add("Anu");
		list.add("Kavi");
		list.add("Sam");
		list.add("Ram");
		System.out.println(list);
		list.remove("Kavi");
		System.out.println(list);
	}

}
