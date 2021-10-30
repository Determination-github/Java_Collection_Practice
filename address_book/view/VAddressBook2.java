package address_book.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


import javax.swing.JSeparator;

public class VAddressBook2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPanel panel_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		VAddressBook2 vab2 = new VAddressBook2();
		vab2.start();
	}
	
	public void start()  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAddressBook2 window = new VAddressBook2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VAddressBook2() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("조회");
		frame.setBounds(0, 0, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 586, 301);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("이름(필수 입력)");
		lblNewLabel.setBounds(85, 10, 100, 30);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("주소");
		lblNewLabel_1.setBounds(85, 40, 100, 30);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("전화번호");
		lblNewLabel_2.setBounds(85, 70, 100, 30);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("관계");
		lblNewLabel_3.setBounds(85, 100, 100, 30);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("성별");
		lblNewLabel_4.setBounds(85, 130, 100, 30);
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("생일(YYYYMMDD)");
		lblNewLabel_5.setBounds(85, 160, 100, 30);
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("비고");
		lblNewLabel_6.setBounds(85, 190, 100, 60);
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("수정일");
		lblNewLabel_7.setBounds(85, 250, 100, 30);
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		panel.add(lblNewLabel_7);

		textField = new JTextField();
		textField.setBounds(197, 15, 150, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(197, 45, 150, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(197, 75, 150, 20);
		textField_2.setColumns(10);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(197, 105, 150, 20);
		textField_3.setColumns(10);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBounds(197, 135, 150, 20);
		textField_4.setColumns(10);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setBounds(197, 165, 150, 20);
		textField_5.setColumns(10);
		panel.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setBounds(197, 205, 230, 40);
		textField_6.setColumns(10);
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setBounds(197, 255, 150, 20);
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 10, 10);
		panel.add(panel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 290, 586, 1);
		panel.add(separator);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 299, 586, 54);
		frame.getContentPane().add(panel_2);
		
		JButton btnNewButton = new JButton("확인");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		panel_2.add(btnNewButton_1);
	}
}
