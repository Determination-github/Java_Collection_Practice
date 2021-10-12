package javaswing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("some text");
		JButton btn1 = new JButton("click me!");
		JButton btn2 = new JButton("EXIT");
		JTextArea txtArea = new JTextArea(); //여러줄의 글을 입력할 때
//		JTextField txtField = new JTextField(200); //글자수를 200자로 제한할 때는 JTextArea보다 JTextField사용
		JPanel btnPanel = new JPanel();
		
		btnPanel.add(btn1); //버튼 패널에 버튼 추가
		btnPanel.add(btn2);
		panel.setLayout(new BorderLayout());//패널의 위치를 정할 수 있다
		panel.add(label, BorderLayout.NORTH);//라벨을 위쪽에
		panel.add(btnPanel, BorderLayout.WEST);//버튼을 왼쪽에
		panel.add(txtArea, BorderLayout.CENTER);//글을 입력할 수 있는 공간을 가운데에
		
		btn1.addActionListener(new ActionListener() {  //버튼을 클릭한다면 ?
			
			@Override
			public void actionPerformed(ActionEvent e) { //버튼을 클릭했을 때 무엇을 할지 기능을 정하는 메소드
//				txtArea.append("You are amazing!\n"); // txtArea에 글을 추가함
				label.setText(txtArea.getText());
			}
		});

		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		frame.add(panel);//프레임 안에 패널 집어넣기(반드시 집어 넣어야 한다.)
//		panel.add(new JLabel("Welcome"));//패널안에 글자 넣기
		
		
		frame.setResizable(false); //true면 사이즈조절 가능 false면 사이즈 조절 불가
		frame.setVisible(true); //자바프레임 보이게 설정
		frame.setPreferredSize(new Dimension(840, 840/12*9)); //자바프레임 선호 사이즈
		frame.setSize(840, 840/12*9); //자바프레임 사이즈 설정
		frame.setLocationRelativeTo(null); //자바프레임 화면 가운데 생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램을 끄면 모든게 꺼짐
		
		
	}

}
