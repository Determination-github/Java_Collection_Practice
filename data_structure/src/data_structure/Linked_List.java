package data_structure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {
    
    public Linked_List() {
    	linkedList_test();
    }
    
    public static void main(String[] args) {
		new Linked_List();
	}
    
    public void linkedList_test() {
    	LinkedList<Integer> ll = new LinkedList();
    	ll.add(10); // 끝에 값 추가
    	ll.add(20);
    	ll.add(30);
    	
    	ll.add(0, 5); //0번째 인덱스에 값 추가
    	
    
    	
    	ll.addFirst(1); // 첫 인덱스에 값 추가
    	ll.addLast(40); // 마지막 인덱스에 값 추가
    	
    	for(int value : ll) { //향상된 for문으로 순차대로 LinkedList 값 출력
    		System.out.println(value);
    	}
    	
    	//아래 다섯 개의 출력문은 모두 동일한 값 1을 출력(인덱스 0번째 값)
    	System.out.println(ll.element());
    	System.out.println(ll.getFirst());
    	System.out.println(ll.get(0));
    	System.out.println(ll.peek());
    	System.out.println(ll.peekFirst());
     	
    	//아래 두 개의 출력문은 모두 동일한 값 40을 출력(인덱스 마지막 값)
    	System.out.println(ll.getLast());
    	System.out.println(ll.peekLast());
    	
    	System.out.println(ll.poll()); //첫 번째 인덱스 값을 출력 후 삭제
    	System.out.println(ll.pop()); //첫 번째 인덱스 값을 출력 후 삭제
    	for(int value : ll) { //향상된 for문으로 순차대로 LinkedList 값 출력
    		System.out.println(value); // 1, 5가 삭제된 값 출력
    	}
    	
    	System.out.println(ll.pollLast()); //첫 번째 인덱스 값을 출력 후 삭제
    	for(int value : ll) { //향상된 for문으로 순차대로 LinkedList 값 출력
    		System.out.println(value); // 40이 삭제된 값 출력
    	}
    	
    	//removeFirst(), removeLast()는 값을 출력하지 않고 처음과 마지막 값 삭제
    	
    	Iterator<Integer> it = ll.iterator(); //단방향
    	while(it.hasNext()) {
    		int value = it.next();
    		System.out.println(value);
    	}
    	
    	ListIterator<Integer> lit = ll.listIterator(); //양방향
    	while(lit.hasNext()) {
    		int value = lit.next();
    		System.out.println(value);
    	}
    	
    	ListIterator<Integer> lit2 = ll.listIterator(); //양방향
    	while(lit.hasPrevious()) {
    		int value = lit.previous();
    		System.out.println(value);
    	}
    	
    	ListIterator<Integer> lit3 = ll.listIterator();
    	lit3.add(5); //리스트에 값 추가, 0번째 인덱스를 가르킨다
    	lit3.next(); //리스트의 다음 요소를 반환하고, 커서의 위치를 다음 인덱스로 이동
    	lit3.add(15); //리스트에 값 추가, 0에서 1 -> next로 인해 다시 2로 이동했기 때문에 인덱스 2 자리에 값 추가
    	for(int value : ll) { //향상된 for문으로 순차대로 LinkedList 값 출력
    		System.out.println(value); // 5 10 15 20 30 출력
    	}
    	
    	ListIterator<Integer> lit4 = ll.listIterator();
    	//lit3.remove(); //0번째 자리를 선택하고 값을 추가하는 것은 가능하지만 0번째 자리를 선택하고 값을 삭제하는 것은 불가능
    	//IllegalStateException 발생
    	lit4.next();
    	lit4.remove();//0번 인덱스의 값인 5를 삭제
    	for(int value : ll) { //향상된 for문으로 순차대로 LinkedList 값 출력
    		System.out.println(value); // 10 15 20 30 출력
    	}
    	
    	
    }
}