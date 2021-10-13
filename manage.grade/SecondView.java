package managegrade;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SecondView extends FirstView {
	JPanel newPanel1 = new JPanel();
	JPanel newPanel2 = new JPanel();
	JButton jButton1 = new JButton("연산");
	JButton jButton2 = new JButton("종료");
	int total;
	float avg;

	public SecondView(int number) {
		super();

		String header[] = { "이름", "국어", "영어", "수학", "총점", "평균", "석차" };
		String contents[][];
		contents = new String[number][];

		DefaultTableModel model = new DefaultTableModel(contents, header);
		JTable table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);

		newPanel1.setLayout(new BorderLayout());
		jframe.add("Center", scroll);
		newPanel2.add(jButton1);
		newPanel2.add(jButton2);
		newPanel1.add("East", newPanel2);
		jframe.add("South", newPanel1);
		
		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[][] newArray = new int[number][2];
				table.clearSelection();
				for (int i = 0; i < number; i++) {

					int value1 = Integer.parseInt((String) model.getValueAt(i, 1));
					int value2 = Integer.parseInt((String) model.getValueAt(i, 2));
					int value3 = Integer.parseInt((String) model.getValueAt(i, 3));
					total = value1 + value2 + value3;
					avg = total / 3.0f;

					model.setValueAt(String.valueOf(total), i, 4);
					model.setValueAt(String.valueOf(avg), i, 5);

					newArray[i][0] = total;
					newArray[i][1] = 1;
				}

				for (int i = 0; i < number; i++) {
					for (int j = 0; j < number; j++) {
						if (newArray[i][0] < newArray[j][0]) {
							newArray[i][1]++;
						}
					}
				}

				for (int i = 0; i < number; i++) {
					model.setValueAt(String.valueOf(newArray[i][1]), i, 6);
				}

			}
		});

	}
}
