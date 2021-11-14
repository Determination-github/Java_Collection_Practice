package data_structure;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
	public static void main(String[] args) {
		new SetPractice();
	}
	
	public SetPractice() {
		hashSet();
		iterateHashSet();
	}
	
	public void hashSet() {
		HashSet<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(1); // 오류가 나지 않으나 set은 데이터의 중복을 허용하지 않는다.
		
		for(int i : number) {
			System.out.println(i); // 데이터의 중복이 허용되지 않아 1, 2, 3만 출력된다.
		}
	}
	
	public void iterateHashSet() {
		HashSet<Integer> number = new HashSet<>();
		number.add(1);
		number.add(2);
		number.add(2);
		number.add(2);
		number.add(2);
		number.add(3);
		
		//중복된 값을 추가
		
		Iterator<Integer> it = number.iterator(); // iterator를 사용시
		while (it.hasNext()) {
			int value = it.next();
			System.out.println(value); //중복된 값을 제거한 출력 값이 나온다.
			//만약 HashSet이 아닌 ArrayList 였다면 중복값이 그대로 출력되어
			// 1 2 2 2 2 3을 출력함
			
		}
	}
}
