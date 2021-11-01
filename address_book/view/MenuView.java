package address_book.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class MenuView extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JSeparator separator;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		VAddressBook2 vab2 = new VAddressBook2();
//		vab2.start();
//	}
//	
//	public void start()  {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MenuView menuView = new MenuView();
//					menuView.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public MenuView() {
		initialize();
		setFrame();
		setLayout();
	}
	
	public void setVisible() {
		this.setVisible(false);
	}
	
	public void setFrame() {
		this.setTitle("조회");
		this.setBounds(0, 0, 600, 400);
//		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
//		this.setVisible(true);
	}
	
	public void setLayout() {
		panel = new JPanel();
		panel.setBounds(0, 0, 586, 301);
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_1);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_3);
		panel.add(lblNewLabel_4);
		panel.add(lblNewLabel_5);
		panel.add(lblNewLabel_6);
		panel.add(lblNewLabel_7);
		
		panel.add(textField);
		panel.add(textField_1);
		panel.add(textField_2);
		panel.add(textField_3);
		panel.add(textField_4);
		panel.add(textField_5);
		panel.add(textField_6);
		panel.add(textField_7);
		
		panel.add(panel_1);
		panel.add(separator);
		
		this.getContentPane().add(panel_2);
		
		panel_2.add(btnNewButton);
		panel_2.add(btnNewButton_1);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		lblNewLabel = new JLabel("이름(필수 입력)");
		lblNewLabel.setBounds(85, 10, 100, 30);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_1 = new JLabel("주소");
		lblNewLabel_1.setBounds(85, 40, 100, 30);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_2 = new JLabel("전화번호");
		lblNewLabel_2.setBounds(85, 70, 100, 30);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_3 = new JLabel("관계");
		lblNewLabel_3.setBounds(85, 100, 100, 30);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_4 = new JLabel("성별");
		lblNewLabel_4.setBounds(85, 130, 100, 30);
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_5 = new JLabel("생일(YYYYMMDD)");
		lblNewLabel_5.setBounds(85, 160, 100, 30);
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_6 = new JLabel("비고");
		lblNewLabel_6.setBounds(85, 190, 100, 60);
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

		lblNewLabel_7 = new JLabel("수정일");
		lblNewLabel_7.setBounds(85, 250, 100, 30);
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		

//		textField = new JTextField();
//		setTextField(textField);
//		textField = getTextField();
		textField = new JTextField();
		textField.setBounds(197, 15, 150, 20);
		textField.setColumns(100);

		textField_1 = new JTextField();
		textField_1.setBounds(197, 45, 150, 20);
		textField_1.setColumns(100);
		

		textField_2 = new JTextField();
		textField_2.setBounds(197, 75, 150, 20);
		textField_2.setColumns(100);
		

		textField_3 = new JTextField();
		textField_3.setBounds(197, 105, 150, 20);
		textField_3.setColumns(100);


		textField_4 = new JTextField();
		textField_4.setBounds(197, 135, 150, 20);
		textField_4.setColumns(100);
		

		textField_5 = new JTextField();
		textField_5.setBounds(197, 165, 150, 20);
		textField_5.setColumns(100);
		

		textField_6 = new JTextField();
		textField_6.setBounds(197, 205, 230, 40);
		textField_6.setColumns(100);
		

		textField_7 = new JTextField();
		textField_7.setBounds(197, 255, 150, 20);
		textField_7.setColumns(100);
		
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 10, 10);
		
		
		separator = new JSeparator();
		separator.setBounds(0, 290, 586, 1);
		
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 299, 586, 54);
		
		
		btnNewButton = new JButton("확인");
		btnNewButton_1 = new JButton("취소");
	}
	
    public void refresh() { //프레임 새로고침
		this.revalidate();
		this.repaint();
    }

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}
	
//	public static void main(String[] args) {
//		MenuView menuView = new MenuView();
//		menuView.start();
//	}

	

}