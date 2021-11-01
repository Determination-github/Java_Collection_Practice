package address_book.module;

import java.util.Calendar;

import javax.swing.JLabel;

public class Time extends Thread{
	private Calendar calendar;
	private int hour;
	private int min;
	private int sec;
	private int amPm;
	private String ampm;
	private String time;
	
	private JLabel jLabel;
	
	public JLabel initTimeLabel() {
		jLabel = new JLabel();
		jLabel.setHorizontalAlignment(jLabel.CENTER);
		return jLabel;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}