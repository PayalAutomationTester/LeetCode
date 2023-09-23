package EasyPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyDict {

	public static void main(String[] args) {
		
		Map<String,Integer> myDict = new MyDict().createDict("today is my interview and today is Tuesday and today I’m not well");
		
		for (Entry<String, Integer> key : myDict.entrySet()) {
			
			if(key.getValue()==1)
			{
				myDict.remove(key);
			}
			
		}
		
		System.out.println(myDict);

	}
	
	public Map<String,Integer> createDict(String input)
	{
		Map<String,Integer> myMap = new HashMap<String, Integer>();
		
		String[] words = input.split(" ");
		for (String word : words) {
			
			if(myMap.containsKey(word))
			{
				myMap.put(word, myMap.get(word)+1);
			}
			else {
				myMap.put(word, 1);
			}
			
		}
		
		return myMap;
	}

}
