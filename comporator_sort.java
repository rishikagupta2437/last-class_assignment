import java.util.Comparator;

public class comporator_sort<R> implements Comparator<R> {
   public int compare( R first , R second)
   {
	   if((int)first > (int)second)
	   {
		   return 1;
	   }
	   else
		   if((int)first < (int)second)
			   return -1;
		   else
	   return 0;
   }

}
