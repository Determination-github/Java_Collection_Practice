package address_book.module;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MMakeTable {
	 String cols[] = null;
	 String data[][] = null;
	 DefaultTableModel dtm_addressBook = null;
	 JTable jtb = null;
	 JScrollPane jScrollPane = null;
			 
	 
	 public MMakeTable() {
		 initialize();
	 }
	 
	 
	 public void initialize() {
		 cols = new String[] {"아이디", "이름", "주소", "전화번호"};
		 data = new String[0][4];
		 dtm_addressBook = new DefaultTableModel(data, cols);
		 setDtm_addressBook(dtm_addressBook);
		 jtb = new JTable(dtm_addressBook);
		 jtb.requestFocus();
		 jScrollPane = new JScrollPane( new JScrollPane(jtb)
		            ,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
		            ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 setjScrollPane(jScrollPane);
	 }


	public JScrollPane getjScrollPane() {
		return jScrollPane;
	}


	public void setjScrollPane(JScrollPane jScrollPane) {
		this.jScrollPane = jScrollPane;
	}


	public DefaultTableModel getDtm_addressBook() {
		return dtm_addressBook;
	}


	public void setDtm_addressBook(DefaultTableModel dtm_addressBook) {
		this.dtm_addressBook = dtm_addressBook;
	}
	
	






}
