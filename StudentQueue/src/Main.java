
public class Main {

	public static void main(String[] args) {
		
	

			int [] arr1 = new int[] {85,90,74,85,80} ;
			int [] arr2 = new int[] {80,85,75,55,82} ;
			int [] arr3 = new int[] {86,85,75,42,89} ;
			int [] arr4 = new int[] {10,85,96,45,19} ;
			int [] arr5 = new int[] {88,69,45,76,79} ;
			int [] arr6 = new int[] {45,19,75,65,85} ;
			
			
			Student pranav = new Student (25, "Pranav", arr1);
			
			Student sham = new Student (30, "Sham", arr2);
			Student ram = new Student (25, "Ram", arr3);
			Student bam = new Student (25, "bam", arr4);
			Student seeta = new Student (25, "seeta", arr5);
			Student geeta = new Student (25, "geeta", arr6);

			StudentQueue q = new StudentQueue();
			StudentQueue q2 = new StudentQueue();
			q.insert(seeta);
			q.insert(pranav);
			q.insert(geeta);
			
			
			//q.remove();
         	System.out.println(q);
			
			q = q.Marks_Above75();
			System.out.println(q);
		

	}

}
