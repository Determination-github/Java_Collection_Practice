package address_book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import address_book.view.MainView;

public class About implements ActionListener {
	private MainView mainView;


	public void clickAbout(MainView mainView) {
		this.mainView = mainView;
		mainView.getJmi7().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == mainView.getJmi7()) {
			JOptionPane.showMessageDialog(null, "https://github.com/Determination-github/Practice");
			System.exit(0);
		}
	}
}