import java.util.Scanner;
public class MainDlink {
	public static void main(String[] args) {
		
		DLinkList dll = new DLinkList();
		
		dll.insert(5);
		dll.append(6);
		dll.append(7);
		dll.insert(4);
		dll.insert(3);
		dll.append(8);
		dll.append(9);
		dll.insert(2);
		dll.insert(1);
		System.out.println(dll);
		
		dll.reverse();
		System.out.println(dll);
		dll.deleteAll();
		System.out.println(dll);
	}
}
