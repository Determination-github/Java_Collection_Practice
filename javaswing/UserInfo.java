package javaswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class UserInfo {
	
	public UserInfo() {
		JFrame jFrame = new JFrame("유저정보");
		jFrame.setLocationRelativeTo(null);
		jFrame.setSize(600, 400);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		String header[] = {"학생이름", "국어", "영어", "수학"};
		String contents[][] = {
				{"홍길동", "78", "82", "90"},
				{"신짱구", "79", "70", "68"},
				{"김철수", "100", "95", "90"}
		};
		
		DefaultTableModel model = new DefaultTableModel(contents, header);
		JTable table = new JTable(model);
		
		JScrollPane scroll = new JScrollPane(table);
		JTextField name = new JTextField(10);
		JTextField kor = new JTextField(3);
		JTextField eng = new JTextField(3);
		JTextField math = new JTextField(3);
		
		panel.add(name);
		panel.add(kor);
		panel.add(eng);
		panel.add(math);
		
		JButton button = new JButton("추가");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputStr[] = new String[4];
				
				inputStr[0] = name.getText();
				inputStr[1] = kor.getText();
				inputStr[2] = eng.getText();
				inputStr[3] = math.getText();
				model.addRow(inputStr);
				
				name.setText("");
				kor.setText("");
				eng.setText("");
				math.setText("");
				
			}
		});
		
		JButton cancelBtn = new JButton("삭제");
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1) { 
					return;
				}
				else {
					model.removeRow(table.getSelectedRow());
				}
				
			}
		});
		
		panel.add(button);
		panel.add(cancelBtn);
		
		jFrame.add(scroll, BorderLayout.CENTER);
		jFrame.add(panel, BorderLayout.SOUTH);
		jFrame.pack();
		jFrame.setVisible(true);

	}
	
	
	
}
