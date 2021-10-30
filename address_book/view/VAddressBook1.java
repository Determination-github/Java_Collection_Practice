package address_book.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VAddressBook1 extends Thread {
	private JFrame jFrame;
	private JLabel jLabel;
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
	
	
	private Calendar calendar;
	private int hour;
	private int min;
	private int sec;
	private int amPm;
	private String ampm;
	private String time;
	
	public void initComp() {
		jFrame = new JFrame("주소록 관리");
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
		jLabel = new JLabel();	
	}
	
	public void setFrame() {
		jFrame.setSize(600, 400);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
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
		
		jFrame.setJMenuBar(jMenuBar);
		
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jFrame.setLayout(new BorderLayout());
		jFrame.add(jLabel, "South");
;	}
	
    public void refresh() { //프레임 새로고침
		jFrame.revalidate();
		jFrame.repaint();
    }
	
	public VAddressBook1() {
		initComp();
		setFrame();
		setLayout();
		refresh();
	}
	
	public void run() {
	    while(true) {
	    	calendar = Calendar.getInstance();
			hour = calendar.get(Calendar.HOUR_OF_DAY);
			min = calendar.get(Calendar.MINUTE);
			sec = calendar.get(Calendar.SECOND);
			amPm = calendar.get(Calendar.AM_PM);
			ampm = amPm == Calendar.AM? "PM" : "AM";
			time = "현재 시간 : "+hour+"시 "+min+"분 "+sec+"초 "+ampm;
			jLabel.setText(time);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				//예외처리
			}
	    }
		
	}
	
	
	public static void main(String[] args) {
		VAddressBook1 vab = new VAddressBook1();
		vab.start();
	}

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

	public JFrame getjFrame() {
		return jFrame;
	}

	public void setjFrame(JFrame jFrame) {
		this.jFrame = jFrame;
	}
	
	
}
