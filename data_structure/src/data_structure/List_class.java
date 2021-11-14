package data_structure;

import java.util.ArrayList;

public class List_class {
	private int number;
	private String name;
	
	public List_class(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void list_class_test() {
		ArrayList<List_class> arrayList = new ArrayList<>();
		List_class lc1 = new List_class(1, "김유신"); // 인스턴스 생성
		arrayList.add(lc1); //인스턴스 리스트에 주입
		arrayList.add(new List_class(2, "강감찬")); //인스턴스 생성과 동시에 값 주입
	}
		
}


