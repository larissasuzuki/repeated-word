package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class mostUsedWord {
	
	public static void main (String args[]){
		String myWord = "Quero muito chocolate por que muito eh muito e bom demais chocolate";
		mostUsedWord findMost = new mostUsedWord();
		String test = findMost.findTheMost(myWord);
		System.out.println(test);
	}

	public String findTheMost(String str){
		
		List<String> strArray = Arrays.asList(str.split("\\s"));
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(int i=0; i<strArray.size(); i++){
			String aux = strArray.get(i);
			if(wordCount.containsKey(aux)){
				int count = wordCount.get(aux);
				wordCount.put(aux, count+1);
			}else{
				wordCount.put(aux, 1);
			}
		}
		
		return topKey(wordCount);
		
	}
	
	public String topKey(HashMap<String, Integer> wordCount){
		int maxValue = 0;
		String topKey = ""; 
		
		Iterator<String> keyIterator = wordCount.keySet().iterator();
		
		while(keyIterator.hasNext()){
			String key = keyIterator.next();
			if(wordCount.get(key)>maxValue){
				maxValue = wordCount.get(key);
				topKey = key;
			}
		}
	
	return topKey;
	}
	

}
