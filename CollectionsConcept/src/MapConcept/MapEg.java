package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class MapEg {

	public static void main(String[] args) {
		
	Map<String,Integer> map= new HashMap<String,Integer>();
	map.put("kash", 100);
	map.put("som", 90);
	map.put("sahil", 80);
	map.put("kash", 60);
	map.put(null, 55);
	map.put(null, 75);
	Map<String,String> map1= new HashMap<String,String>();
	map1.put(null, null);
	
	//System.out.println(map.get(null));
	//System.out.println(map1.get(null));
	System.out.println(map.containsKey("som"));
	System.out.println(map.containsKey("Lee"));
	System.out.println(map.containsValue(20));
	System.out.println(map.containsValue(90));
	System.out.println(map);

	}

}
