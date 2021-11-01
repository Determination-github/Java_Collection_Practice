package address_book.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import address_book.module.DBConnection;
import address_book.module.Table;
import address_book.view.MainView;
import address_book.view.MenuView;


public class Search implements ActionListener, MouseListener {
	private MainView mainView;
	private MenuView menuView;
	private DBConnection dbc;
	private Table tb;

	
	public Search() { //
		

	}
	
	
	public void clickSearchButton(DBConnection dbc, MainView mainView, MenuView menuView, Table tb) {
		this.dbc = DBConnection.getInstance();
		this.mainView = mainView;
		this.menuView = menuView;
		this.tb = tb;
		mainView.getJmi2().addActionListener(this);
		tb.getJtb().addMouseListener(this);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getClickCount() == 2) {//마우스 더블클릭했니?
			for(int i=0; i<tb.getDtm_addressBook().getRowCount(); i++) {
				if(tb.getJtb().isRowSelected(i)) {
					int findID = (int)tb.getDtm_addressBook().getValueAt(i, 0);
					StringBuilder sql = new StringBuilder();
					sql.append("SELECT id, name, address, phone, mem_relation, gender, birth  ");
					sql.append(" FROM address_book  ");
					sql.append(" WHERE id = ?    ");
					try {
						dbc.setCon(dbc.getConnection());
						dbc.setPstmt(dbc.getCon().prepareStatement(sql.toString()));
						dbc.getPstmt().setInt(1, findID);
						dbc.setRs(dbc.getPstmt().executeQuery());
					
						while(dbc.getRs().next()) {
							String putName = dbc.getRs().getString("name");
							menuView.getTextField().setText(putName);
							String putAddress = dbc.getRs().getString("address");
							menuView.getTextField_1().setText(putAddress);
							String putPhone = dbc.getRs().getString("phone");
							menuView.getTextField_2().setText(putPhone);
							String putRelation = dbc.getRs().getString("mem_relation");
							menuView.getTextField_3().setText(putRelation);
							String putGender = dbc.getRs().getString("gender");
							menuView.getTextField_4().setText(putGender);
							String putBirth = dbc.getRs().getString("birth");
							menuView.getTextField_5().setText(putBirth);
						}
					} catch (SQLException se) {
					    System.out.println("[[query]]"+sql.toString());
					} catch (Exception e1) {
						e1.printStackTrace();
					} finally {
						dbc.freeConnection(dbc.getCon(), dbc.getPstmt(), dbc.getRs());
					}
				}
			}
				}
			}
				
		
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == mainView.getJmi2()) {
			menuView.dispose();
			menuView = new MenuView();
			menuView.setVisible(true);
			
			menuView.getBtnNewButton().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
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