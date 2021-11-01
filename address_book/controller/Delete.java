package address_book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import address_book.module.DBConnection;
import address_book.module.Table;
import address_book.view.MainView;
import address_book.view.MenuView;

public class Delete implements ActionListener {
	private MainView mainView;
	private DBConnection dbc;
	private Table tb;

	public void clickDeleteButton(DBConnection dbc, MainView mainView, Table tb) {
		this.dbc = DBConnection.getInstance();
		this.mainView = mainView;
		this.tb = tb;
		mainView.getJmi5().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == mainView.getJmi5()) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("삭제할 아이디를 입력하세요."));
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE  FROM address_book ");
			sql.append(" WHERE id = ?    ");
			try {
				dbc.setCon(dbc.getConnection());
				dbc.setPstmt(dbc.getCon().prepareStatement(sql.toString()));
				dbc.getPstmt().setInt(1, id);
				dbc.getPstmt().executeUpdate();
				JOptionPane.showMessageDialog(null, "데이터를 삭제했습니다.");
			} catch (SQLException se) {
				System.out.println("[[query]]" + sql.toString());
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				dbc.freeConnection(dbc.getCon(), dbc.getPstmt(), dbc.getRs());

			}
		}
	}

}
