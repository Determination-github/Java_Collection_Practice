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

public class ConnectDB implements ActionListener {

	MainView mv = null;
	DBConnection dbc = null;
	Table tb = null;
	
	public void ButtonClick(MainView mv, Table tb) {
		this.mv = mv;
		this.tb = tb;
		mv.getJmi1().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dbc = DBConnection.getInstance();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT name FROM  address_book ");
		try {
			dbc.setCon(dbc.getConnection());
			dbc.setStmt(dbc.getCon().createStatement());
			dbc.setRs(dbc.getStmt().executeQuery(sql.toString()));
			JOptionPane.showMessageDialog(null,"DB가 연결되었습니다.");	
		} catch (SQLException se) {
		    System.out.println("[[query]]"+sql.toString());
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			dbc.freeConnection(dbc.getCon(), dbc.getStmt(), dbc.getRs());
		}
		
		tb.getjScrollPane().setVisible(true);
		getAddressBook(tb);	
	}
	
	public List<Map<String, Object>> getAddressBook(Table tb) {
		this.tb = tb;
		List<Map<String, Object>> tList = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT id, name, address, phone FROM  address_book order by id asc ");
		try {
			dbc.setCon(dbc.getConnection());
			dbc.setStmt(dbc.getCon().createStatement());
			dbc.setRs(dbc.getStmt().executeQuery(sql.toString()));

			Map<String, Object> rmap = null;
			//이전에 조회된 정보가 있다면 모두 제거하거 새로 출력하기
			while(dbc.getRs().next()) {
				rmap = new HashMap<>();
				rmap.put("id", dbc.getRs().getInt("id"));
				rmap.put("name", dbc.getRs().getString("name"));
				rmap.put("address", dbc.getRs().getString("address"));
				rmap.put("phone", dbc.getRs().getString("phone"));
				tList.add(rmap);
			}
			//이전에 조회된 정보가 있다면 모두 제거하거 새로 출력하기
			while(tb.getDtm_addressBook().getRowCount()>0) tb.getDtm_addressBook().removeRow(0);
			for(int i=0; i<tList.size(); i++) {
				Map map = tList.get(i);
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(0, map.get("id"));
				oneRow.add(1, map.get("name"));
				oneRow.add(2, map.get("address"));
				oneRow.add(3, map.get("phone"));
				tb.getDtm_addressBook().addRow(oneRow);
			}
		} catch (SQLException se) {
		    System.out.println("[[query]]"+sql.toString());
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			dbc.freeConnection(dbc.getCon(), dbc.getStmt(), dbc.getRs());
		} return tList;	
	} 	
	
	
	
}
