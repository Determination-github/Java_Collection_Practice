package address_book.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JOptionPane;

import address_book.controller.About;
import address_book.controller.CloseView;
import address_book.controller.ConnectDB;
import address_book.controller.Delete;
import address_book.controller.Insert;
import address_book.controller.Search;
import address_book.controller.Update;
import address_book.module.DBConnection;
import address_book.module.Table;
import address_book.module.Time;
import address_book.view.MainView;
import address_book.view.MenuView;

public class Test {
	
	MainView mv;
	MenuView menuView;
	Table tb;
	Time time;
	DBConnection dbc;
	
	public Test(MainView mv, MenuView menuView, Table tb) {
		this.mv = mv;
		this.tb = tb;
		this.menuView = menuView;
		this.dbc = DBConnection.getInstance();
		time = new Time();
		
		mv.initComp();
		tb.initComp();
		mv.setFrame();
		mv.setLayout();
		mv.setLayout(new BorderLayout());
		mv.add(time.initTimeLabel(), "South");
		mv.add(tb.getjScrollPane(), "Center");
		tb.getjScrollPane().setVisible(false);
		mv.refresh();
		ConnectDB cdb = new ConnectDB();
		cdb.ButtonClick(mv, tb);
		Search search = new Search();
		search.clickSearchButton(dbc, mv, menuView, tb);
		
		Insert insert = new Insert();
		insert.clickInsertButton(dbc, mv, menuView, tb);
		
		Update update = new Update();
		update.clickUpdateButton(dbc, mv, menuView, tb);
		
		Delete delete = new Delete();
		delete.clickDeleteButton(dbc, mv, tb);
		
		CloseView cv = new CloseView();
		cv.clickCVButton(mv);
		
		About about = new About();
		about.clickAbout(mv);
		
		time.run();
	}
	
	
	public static void main(String[] args) {
		MainView mv = new MainView();
		MenuView menuView = new MenuView();
		Table tb = new Table();
		Test test = new Test(mv, menuView, tb);

	}
	
	
	
	
	
}