package data_structure;

import java.util.HashMap;
import java.util.Iterator;

public class MapPractice {
	public MapPractice() {
		map();
	}
	
	public static void main(String[] args) {
		new MapPractice();
	}
	
	public void map() {
		HashMap<String, Integer> hashMap = new HashMap<>(); //키 값은 string, value 값은 Integer
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 2);
		hashMap.put("one", 10); //오류는 발생하지 않지만 map은 중복된 키 값을 허용하지 않는다.
		
		Iterator<String> keys = hashMap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key); //one two three 3가지 키값만 리턴됨
			System.out.println(hashMap.get(key));//map은 중복을 허용하지 않기 때문에 마지막에 입력된 {one, 10}이 남고 처음 입력된 {one, 1}은 삭제된다.
			// one 10 two 2 three 2 가 출력됨
		}
		
		for(String key : hashMap.keySet()) {
			System.out.println(key+ " : " + hashMap.get(key));
			//for문으로 map 출력하는 방법
			//one : 10 two : 2 three : 2 출력됨
		}
		
	}
	
}
