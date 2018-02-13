import java.util.*;

public class generics_sort  {

	public static void main(String[] args) 
	{
		ArrayList<Integer> listI = new ArrayList<Integer>();
        listI.add(77);                             
        listI.add(33);
        listI.add(88);
        listI.add(04);
        
        Collections.sort(listI);
        System.out.println("sort Integer array:-");
        System.out.println(listI);
        
        ArrayList<String> listS = new ArrayList<String>();
        listS.add("romit");
        listS.add("amar");
        listS.add("parth");
        listS.add("diya");
        
        Collections.sort(listS); 
        System.out.println("sort String array:-");
        System.out.println(listS);
        
        ArrayList<Float> listF = new ArrayList<Float>();
        listF.add(33.9f);
        listF.add(27.4f);
        listF.add(12.65f);
        listF.add(4.20f);
        
        Collections.sort(listF); 
        System.out.println("sort Float array:-");
        System.out.println(listF);
        
       
	}

}
