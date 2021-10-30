package address_book.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;

import address_book.module.MDBConnection;
import address_book.module.MMakeTable;
import address_book.view.VAddressBook1;
import address_book.view.VAddressBook2;


public class CMenuController implements ActionListener {
    private MDBConnection 		mdbc  = MDBConnection.getInstance();
    private Connection 			con  = null;
    private Statement 		   stmt  = null;
    private PreparedStatement pstmt  = null;
    private ResultSet 			 rs  = null;
    VAddressBook1			   vab1  = null;
	VAddressBook2			   vab2  = null;
	MMakeTable				    mmt	 = null;
	

	public List<Map<String, Object>> getAddressBook() {
		List<Map<String, Object>> ab = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT id, name, address, phone FROM  address_book ");
		try {
			con = mdbc.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
			Map<String, Object> rmap = null;
			//이전에 조회된 정보가 있다면 모두 제거하거 새로 출력하기
			while(rs.next()) {
				rmap = new HashMap<>();
				rmap.put("id", rs.getInt("id"));
				rmap.put("name", rs.getString("name"));
				rmap.put("address", rs.getString("address"));
				rmap.put("phone", rs.getString("phone"));
				ab.add(rmap);
			}
			//이전에 조회된 정보가 있다면 모두 제거하거 새로 출력하기
			while(mmt.getDtm_addressBook().getRowCount()>0) mmt.getDtm_addressBook().removeRow(0);
			for(int i=0; i<ab.size(); i++) {
				Map map = ab.get(i);
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(0, map.get("id"));
				oneRow.add(1, map.get("name"));
				oneRow.add(2, map.get("address"));
				oneRow.add(3, map.get("phone"));
				mmt.getDtm_addressBook().addRow(oneRow);
			}
		} catch (SQLException se) {
		    System.out.println("[[query]]"+sql.toString());
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			mdbc.freeConnection(con, stmt, rs);
		} return ab;
			
		
	} 	

	
    public CMenuController(MDBConnection mdbc, VAddressBook1 vab1, VAddressBook2 vab2) {
    	this.vab1 = vab1;
    	this.vab2 = vab2;
    	connectDB();
    }
    
    
    public void connectDB() {
    	vab1.getJmi1().addActionListener(this);;	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == vab1.getJmi1()) {
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT name FROM  address_book ");
			try {
				con = mdbc.getConnection();
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql.toString());
				JOptionPane.showMessageDialog(null,"DB가 연결되었습니다.");	
			} catch (SQLException se) {
			    System.out.println("[[query]]"+sql.toString());
			} catch (Exception e2) {
				e2.printStackTrace();
			} finally {
				mdbc.freeConnection(con, stmt, rs);
			}
			mmt = new MMakeTable();
			vab1.getjFrame().add(mmt.getjScrollPane(), "Center");
			
			getAddressBook();
		}
		
	}
	

    
}


