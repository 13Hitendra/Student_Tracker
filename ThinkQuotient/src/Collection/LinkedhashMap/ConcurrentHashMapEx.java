package Collection.LinkedhashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapEx {
	public static void main(String[] args) {

		Map<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

		concurrentHashMap.put("A", "1");
		concurrentHashMap.put("B", "2");
		concurrentHashMap.put("C", "3");

		System.out.println("Iterating over the ConcurrentHashMap:");
		for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
