package address_book.module;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Table {
	private String cols[];
	private String data[][];
	private DefaultTableModel dtm_addressBook;
	private JTable jtb;
	private JScrollPane jScrollPane;
	private JTableHeader jth;
	
	public Table() {
	}
	
	public int tableHeight() {
//		int lastNum = jtb.getHeight();
		int lastNum = dtm_addressBook.getColumnCount();
		return lastNum;
	}
	
	public void initComp() {
		cols = new String[] {"아이디", "이름", "주소", "전화번호"};
		data = new String[0][4];
		dtm_addressBook = new DefaultTableModel(data, cols);
   	    jtb = new JTable(dtm_addressBook);
   	    jth = jtb.getTableHeader();
		jtb.requestFocus();
		jScrollPane = new JScrollPane(jtb
		            ,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
		            ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		setjScrollPane(jScrollPane);
	}

	public DefaultTableModel getDtm_addressBook() {
		return dtm_addressBook;
	}

	public void setDtm_addressBook(DefaultTableModel dtm_addressBook) {
		this.dtm_addressBook = dtm_addressBook;
	}

	public JTable getJtb() {
		return jtb;
	}

	public void setJtb(JTable jtb) {
		this.jtb = jtb;
	}

	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}

	public void setjScrollPane(JScrollPane jScrollPane) {
		this.jScrollPane = jScrollPane;
	}
	
	
}