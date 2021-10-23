package managegrade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CManageGrade {
	private MManageGrade model;
	private VManageGrade view;
	
	public CManageGrade(MManageGrade model, VManageGrade view) { //controller 클래스 생성자
		this.model = model;
		this.view  = view;
		ActionListener1();
		ActionListener2();
		ActionListener3();
	}
	
	public void ActionListener1() { //jbt1 눌렀을 때 이벤트 정의
		this.view.Action1(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setNumber(); //테이블 값설정
				view.setTable(); //값에 따른 테이블 생성
				view.refresh(); //프레임 새로고침
			}
		});	
	}
	
	public void ActionListener2() { //jbt2 눌렀을 때 이벤트 정의
		this.view.Action2(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.setArray(new int[view.getNumber()][2]); //array 크기 설정
				for(int i = 0; i<view.getNumber(); i++) {
					int num1 = Integer.parseInt((String)view.getModel().getValueAt(i, 1)); //view클래스의 테이블 i행 1열 값 가져오기
					int num2 = Integer.parseInt((String)view.getModel().getValueAt(i, 2)); //view클래스의 테이블 i행 2열 값 가져오기
					int num3 = Integer.parseInt((String)view.getModel().getValueAt(i, 3)); //view클래스의 테이블 i행 3열 값 가져오기
					model.CalTotal(num1, num2, num3); //i행 1,2,3열 더하기 -> model클래스 메소드 이용
					model.CalAvg(model.getTotal()); //더한 값 평균값 구하기 -> model클래스 메소드 이용
					
					view.getModel().setValueAt(String.valueOf(model.getTotal()), i, 4); //view클래스 테이블의 i행 4열 값을 설정
					view.getModel().setValueAt(String.valueOf(model.getAvg()), i, 5); //view클래스 테이블의 i행 5열 값을 설정
					
					model.getArray()[i][0] = model.getTotal(); //array 값 설정
					model.getArray()[i][1] = 1;	//array 값 설정
				}
				
				for(int i=0; i<view.getNumber(); i++) { //석차 구하기
					for(int j=0; j<view.getNumber(); j++) {
						if(model.getArray()[i][0] < model.getArray()[j][0]) {
							model.getArray()[i][1]++;
						}
					}
				}
				
				for(int i=0; i<view.getNumber(); i++) { //구한 석차 입력
					view.getModel().setValueAt(String.valueOf(model.getArray()[i][1]), i, 6);
				}				
			}
		});	
	}
	
	public void ActionListener3() {
		this.view.Action3(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});	
	}
	
}