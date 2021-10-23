package managegrade;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VManageGrade {


	public DefaultTableModel getModel() { 
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	private JFrame           jframe = null;
	private JPanel          jPanel1 = null;
	private JPanel          jPanel2 = null;
	private JPanel          jPanel3 = null;
	private JPanel          jPanel4 = null;
	private JLabel           label1 = null;
	private JLabel           label2 = null;
	private JTextField          jtf = null;
	private JButton            jbt1	= null;
	private JButton            jbt2 = null;
	private JButton            jbt3 = null;
	private DefaultTableModel model = null;
	private JTable            table = null;
	private JScrollPane      scroll = null;
	private int				 number;
	private String         header[];
	private String     contents[][];
	

    private void initComp() { //프레임 초기화
    	 jframe          = new JFrame("성적처리");           
    	 jPanel1         = new JPanel();                 
    	 jPanel2         = new JPanel();                 
    	 jPanel3         = new JPanel();
    	 jPanel4         = new JPanel(); 
    	 label1          = new JLabel("성적처리인원수");        
    	 label2          = new JLabel("명");              
    	 jtf             = new JTextField(10);           
    	 jbt1            = new JButton("만들기");           
    	 jbt2            = new JButton("연산");
    	 jbt3            = new JButton("종료");
    	 header			 = new String[] { "이름", "국어", "영어", "수학", "총점", "평균", "석차"};
     	 
    }
    
    private void setFrame() { //프레임 세팅
    	jframe.setSize(600, 400);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }
    
    private void setLayout() { //프레임 레이아웃 설정
    	jPanel1.setLayout(new BorderLayout());

		jPanel2.add(label2);
		jPanel2.add(jbt1);

		jPanel1.add("West", label1);
		jPanel1.add("Center", jtf);
		jPanel1.add("East", jPanel2);
		jframe.add("North", jPanel1);

		jPanel4.setLayout(new BorderLayout());
		jPanel3.add(jbt2);
		jPanel3.add(jbt3);
		jPanel4.add("East", jPanel3);
		jframe.add("South", jPanel4);
		
    }
    
    public int setNumber() { //테이블 만들기 위한 입력값
    	try {
    		Integer.parseInt(jtf.getText());
    		number = Integer.parseInt(jtf.getText());
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
			System.out.println("값을 입력하세요.");
			number = 0;
		} finally {
			return number;
		}
    }
    
    public int getNumber() {
    	return number;
    }
    
    public void setTable() { //테이블 만들기
    	int num 		= getNumber();
    	contents        = new String[num][];
    	model           = new DefaultTableModel(contents, header);
    	table           = new JTable(model);
    	scroll          = new JScrollPane(table);
    	jframe.add("Center", scroll);
    }
    
    public void Action1(ActionListener listener) { //jbt1 눌렀을 때 이벤트
    	jbt1.addActionListener(listener);
    } 
    
    public void Action2(ActionListener listener) { //jbt2 눌렀을 때 이벤트
    	jbt2.addActionListener(listener);
    }
    
    public void Action3(ActionListener listener) { //jbt3 눌렀을 때 이벤트
    	jbt3.addActionListener(listener);
    }
    
    public void refresh() { //프레임 새로고침
		jframe.revalidate();
		jframe.repaint();
    }
    
    public VManageGrade() { //view 클래스 생성자
    	initComp();
    	setFrame();
    	setLayout();
    } 
   
                                  
}                                  