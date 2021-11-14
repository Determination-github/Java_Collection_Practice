package data_structure;


public class Array {
	
	public void assign() {
		String[] student;
		String students[];
		
		//배열 생성과 동시에 인덱스 할당하기
		int[] score = new int[5];
		
		//배열 생성과 동시에 초기화 하기
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		String[] weekDay = new String[]{"금", "토", "일"};
		
		//배열에 인덱스 크기를 할당한 후 value 넣는 법
		String[] member = new String[4];	
		member[0] = "강감찬";
		member[1] = "김유신";
		member[2] = "이순신";
		member[3] = "김수로";
		member[4] = "김무열";
	}
	//배열 선언 방법 2가지
	
	public void getArrayValue() { //인덱스 값 가져오는 방법
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(week[0]); //월
	}
	
	public void getArraySize() { //인덱스 크기 알아내는 방법
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(week.length); //7
	}
	
	public void iterateArray_while() { //배열 반복문(while)으로 처리하기
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		int i=0;
		while(week.length > i) {
			System.out.println(week[i]); //월 부터 일까지 출력
			i++;
		}
	}
	
	public void iterateArray_for() { //배열 반복문(for)으로 처리하기
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		for(int i=0; i<week.length; i++) {
			System.out.println(week[i]);
		}
	}
	
	public static void main(String[] args) {
		Array a = new Array();
		a.getArrayValue();
		a.getArraySize();
	;
	}

}