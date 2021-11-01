package address_book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import address_book.view.MainView;

public class CloseView implements ActionListener {
	private MainView mainView;


	public void clickCVButton(MainView mainView) {
		this.mainView = mainView;
		mainView.getJmi6().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == mainView.getJmi6()) {
			JOptionPane.showMessageDialog(null, "종료합니다.");
			System.exit(0);
		}
	}
}