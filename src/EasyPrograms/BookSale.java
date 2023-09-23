package EasyPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BookSale {
    public static int nthLowestSelling(int[] sales, int n) {
        
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0;i<sales.length;i++)
    	{
    		if(map.containsKey(sales[i]))
    		{
    			map.put(sales[i], map.get(sales[i])+1);
    			
    		}else {
    			map.put(sales[i],1);
    		}
    	}
    	for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==n)
				return entry.getKey();
		}
    	return -1;
    }

    public static void main(String[] args) {
        int x = nthLowestSelling(new int[] { 5, 4, 3, 2, 1, 5, 4, 2, 2, 5, 4, 3, 5, 4, 5 }, 3);
        System.out.println("nthLowestSelling= "+x);
    }
}