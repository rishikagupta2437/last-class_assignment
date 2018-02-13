
public class generic_print {
	
	public static<R> void print(R arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String args[]) {
		
		Integer a[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("Integer:-");
		print(a);
		
		   System.out.println();
		
	    String b[] = {"good","morning","have","a","nice","day"} ;
	    System.out.print("String:-");
		print(b);
		
           System.out.println();
		
		Character c[] = {'a','b','c','d','e','f','g','h','i','j','k'} ;
		System.out.print("Character:-");
		print(c);
		
            System.out.println();
		
	    Double d[] = {1.23 ,1.4, 22.4} ;
	    System.out.print("Float:-");
		print(d);
	} 
}
