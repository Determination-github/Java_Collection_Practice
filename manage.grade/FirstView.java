package managegrade;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstView {
	JFrame jframe = new JFrame("성적처리");
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();
	JLabel label1 = new JLabel("성적처리인원수");
	JLabel label2 = new JLabel("명");
	JTextField jtf = new JTextField(10);
	JButton jbt1 = new JButton("만들기");
	JButton jbt2 = new JButton("종료");

	public FirstView() {

		jframe.setSize(600, 400);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

		jPanel1.setLayout(new BorderLayout());

		jPanel2.add(label2);
		jPanel2.add(jbt1);

		jPanel1.add("West", label1);
		jPanel1.add("Center", jtf);
		jPanel1.add("East", jPanel2);
		jframe.add("North", jPanel1);

		jPanel3.setLayout(new BorderLayout());
		jPanel3.add("East", jbt2);
		jframe.add("South", jPanel3);

		jbt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(jtf.getText());
				jframe.dispose();
				SecondView sv = new SecondView(number);
			}
		});

		jbt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}

}
