
public class Main {
	
	public static void main(String[] args) {
		
		DLinkList dll = new DLinkList();
		
		//dll.deleteByPos(1);
		
		dll.insert(10);
		dll.insert(20);
		/*dll.append(30);
		dll.insert(40);

		System.out.println(dll);
		dll.deleteByPos(2);
		System.out.println(dll);*/
		
		System.out.println(dll);
		dll.reverse();
		System.out.println(dll);
		
		dll.append(30);
		System.out.println(dll);
		
		dll.insert(40);
		System.out.println(dll);
		
		dll.empty();
		System.out.println(dll);
		dll.insert(100);
		System.out.println(dll);
	}
}

