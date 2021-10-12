package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame { //jframe 상속
	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pwdLbL = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPWD = new JPasswordField(10);
		JButton logBtn = new JButton("Log in");
		
		panel.add(label); //패널에 레이블 추가
		panel.add(txtID); //레이블에 txtID필드 출가
		panel.add(pwdLbL); //패널에 패스워드 레이블 추가
		panel.add(txtPWD); //패널에 패스워드 텍스트 필드 추가
		panel.add(logBtn); //패널에 로그인 버튼 추가
		add(panel); //패널을 프레임에 추가
		
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "user";
				String password = "1234";
				
				if(id.equals(txtID.getText()) && password.equals(txtPWD.getText())) {
					JOptionPane.showMessageDialog(null, "로그인 성공!!"); //팝업 다이얼로그
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패!!");
				}
				
			}
		});
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]) {
		new Login();
	}
}
