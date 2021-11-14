package data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
	
	public List() {
		testArrayList();
		genericArrayList();
	}
	
	public static void main(String[] args) {
		new List();
	}
	
	public void testArrayList() { //기본 list
		ArrayList numbers = new ArrayList();
		numbers.add(10); // add Value
		numbers.add(20); // add Value
		numbers.add(30); // add Value
		numbers.add("김유신"); //타입을 지정하지 않아서 String 타입도 추가 가능
		
		numbers.remove(3); // remove value
		
		numbers.add(1, 15); // 1번 인덱스에 15값 추가
		
		System.out.println(numbers.get(1)); //첫 번째 인덱스 값 가져오기 = 15
		
		System.out.println(numbers.indexOf(15));//value 값에 해당하는 인덱스 가져오기 = 1
		
		Iterator it = numbers.iterator(); //iterator 객체 생성
		while (it.hasNext()) { //다음값이 있을 때까지 반복
			int value = (int) it.next(); //it.next는 0번째 인덱스부터 조회
										 //조회된 값을 value에 삽입
										 //hasNext()메소드로 다음값이 조회되지 않을 때까지 반복
			System.out.println(value); //인덱스 값 순서대로 출력
		}
		
		
		ListIterator li = numbers.listIterator(); //양방향 iterator
		while (li.hasNext()) { //iterator와 동일
			int value = (int) li.next();
			System.out.println(value);
			
		}
		
		while (li.hasPrevious()) { //iterator의 hasNext의 반대, 값을 반대 순서로 탐색 후 출력
			int value = (int) li.previous();
			System.out.println(value);
		}
	}

	
	public void genericArrayList() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("강감찬");
		name.add("김유신");
		//name.add(1); //오류 발생, String 타입만 가능
		name.add("이순신");
		
		for(String value : name) { //위에서 사용한 iterator를 for문으로 사용하는 법
								   //제네릭 적용이 안되어 있으면 타입 오류가 발생
								   //value는 name에 있는 값이 순차적으로 담기는 변수
			System.out.println(value);
		}
	}
	
}
