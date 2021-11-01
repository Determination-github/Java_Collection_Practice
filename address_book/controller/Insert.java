package address_book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;

import address_book.module.DBConnection;
import address_book.module.Table;
import address_book.view.MainView;
import address_book.view.MenuView;

public class Insert implements ActionListener {
	private MainView mainView;
	private MenuView menuView;
	private DBConnection dbc;
	private Table tb;

	public void clickInsertButton(DBConnection dbc, MainView mainView, MenuView menuView, Table tb) {
		this.dbc = DBConnection.getInstance();
		this.mainView = mainView;
		this.menuView = menuView;
		this.tb = tb;
		mainView.getJmi3().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == mainView.getJmi3()) {
			menuView.dispose();
			menuView = new MenuView();
			menuView.setVisible(true);

			menuView.getBtnNewButton().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					dbc = DBConnection.getInstance();
					StringBuilder sql = new StringBuilder();
					sql.append("INSERT INTO address_book (id, name, address, phone, mem_relation, gender, birth)  ");
					sql.append(" VALUES (?, ?, ?, ?, ?, ?, ?)  ");
					try {
						dbc.setCon(dbc.getConnection());
						dbc.setPstmt(dbc.getCon().prepareStatement(sql.toString()));
						int id = tb.getDtm_addressBook().getRowCount() + 1;
						dbc.getPstmt().setInt(1, id);
						String name = menuView.getTextField().getText();
						dbc.getPstmt().setString(2, name);
						String address = menuView.getTextField_1().getText();
						dbc.getPstmt().setString(3, address);
						String phone = menuView.getTextField_2().getText();
						dbc.getPstmt().setString(4, phone);
						String memRelation = menuView.getTextField_3().getText();
						dbc.getPstmt().setString(5, memRelation);
						String gender = menuView.getTextField_4().getText();
						dbc.getPstmt().setString(6, gender);
						int birth = Integer.parseInt(menuView.getTextField_5().getText());
						dbc.getPstmt().setInt(7, birth);
						dbc.getPstmt().executeUpdate();
						JOptionPane.showMessageDialog(null, "사용자가 입력되었습니다.");
					} catch (SQLException se) {
						System.out.println("[[query]]" + sql.toString());
					} catch (Exception e2) {
						e2.printStackTrace();
					} finally {
						dbc.freeConnection(dbc.getCon(), dbc.getPstmt(), dbc.getRs());
					}

				}
			});
			
			menuView.getBtnNewButton_1().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}

	}
}
