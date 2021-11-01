package address_book.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MainView extends JFrame {
//	private JLabel jLabel;
	private JMenuBar jMenuBar;
	private JMenu jMenu1;
	private JMenu jMenu2;
	private JMenuItem jmi1;
	private JSeparator jsp1;
	private JMenuItem jmi2;
	private JMenuItem jmi3;
	private JMenuItem jmi4;
	private JMenuItem jmi5;
	private JSeparator jsp2;
	private JMenuItem jmi6;
	private JMenuItem jmi7;
	private JSeparator jsp3;
//	private String cols[];
//	private String data[][];
//	private DefaultTableModel dtm_addressBook;
//	private JTable jtb;
//	private JScrollPane jScrollPane;
	
	public MainView() {
		
	}
	
	
	public void initComp() {
		this.setTitle("주소록 관리");
		jMenuBar = new JMenuBar();
		jMenu1 = new JMenu("메뉴");
		jMenu2 = new JMenu("About");
		jmi1 = new JMenuItem("DB연결");
		jsp1 = new JSeparator();
		jmi2 = new JMenuItem("조회");
		jmi3 = new JMenuItem("입력");
		jmi4 = new JMenuItem("수정");
		jmi5 = new JMenuItem("삭제");
		jsp2 = new JSeparator();
		jmi6 = new JMenuItem("종료");
		jmi7 = new JMenuItem("만든 사람");
//		jLabel = new JLabel();	
//		cols = new String[] {"아이디", "이름", "주소", "전화번호"};
//		data = new String[0][4];
//		dtm_addressBook = new DefaultTableModel(data, cols);
//   	    jtb = new JTable(dtm_addressBook);
//		jtb.requestFocus();
//		jScrollPane = new JScrollPane( new JScrollPane(jtb)
//		            ,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
//		            ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		
	}
	
	public void setFrame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void setLayout() {
		jMenu1.add(jmi1);
		jMenu1.add(jsp1);
		jMenu1.add(jmi2);
		jMenu1.add(jmi3);
		jMenu1.add(jmi4);
		jMenu1.add(jmi5);
		jMenu1.add(jsp2);
		jMenu1.add(jmi6);
		
		jMenu2.add(jmi7);
		
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		this.setJMenuBar(jMenuBar);
		
//		this.setLayout(new BorderLayout());
//		this.add(jScrollPane, "Center")
		
;	}
	
    public void refresh() { //프레임 새로고침
		this.revalidate();
		this.repaint();
    }

//	public DefaultTableModel getDtm_addressBook() {
//		return dtm_addressBook;
//	}
//
//	public void setDtm_addressBook(DefaultTableModel dtm_addressBook) {
//		this.dtm_addressBook = dtm_addressBook;
//	}
    
//	public void Action1(ActionListener listener) { //jbt1 눌렀을 때 이벤트
//	jmi1.addActionListener(listener);
//}
//
//public void Action2(ActionListener listener) { //jbt2 눌렀을 때 이벤트
//jmi2.addActionListener(listener);
//}

	public JMenuItem getJmi1() {
		return jmi1;
	}

	public void setJmi1(JMenuItem jmi1) {
		this.jmi1 = jmi1;
	}

	public JMenuItem getJmi2() {
		return jmi2;
	}


	public void setJmi2(JMenuItem jmi2) {
		this.jmi2 = jmi2;
	}


	public JMenuItem getJmi3() {
		return jmi3;
	}


	public void setJmi3(JMenuItem jmi3) {
		this.jmi3 = jmi3;
	}


	public JMenuItem getJmi4() {
		return jmi4;
	}


	public void setJmi4(JMenuItem jmi4) {
		this.jmi4 = jmi4;
	}


	public JMenuItem getJmi5() {
		return jmi5;
	}


	public void setJmi5(JMenuItem jmi5) {
		this.jmi5 = jmi5;
	}


	public JMenuItem getJmi6() {
		return jmi6;
	}


	public void setJmi6(JMenuItem jmi6) {
		this.jmi6 = jmi6;
	}


	public JMenuItem getJmi7() {
		return jmi7;
	}


	public void setJmi7(JMenuItem jmi7) {
		this.jmi7 = jmi7;
	} 



//	public JScrollPane getjScrollPane() {
//		return jScrollPane;
//	}
//
//	public void setjScrollPane(JScrollPane jScrollPane) {
//		this.jScrollPane = jScrollPane;
//	}

}