package week4;

public class Main {
	public static void main(String args[]) {
		Storage storage = new Storage(5);
		storage.add(8);
		storage.add(6);
		storage.add(10);
		System.out.println(storage.binarySearch(0));
		storage.write();
		storage.bubbleSort();
		storage.write();	
	}
}
