package javaswing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null))); //이미지 사이즈 조정
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null))); //이미지 사이즈 조정
		setLayout(null);
	}

	public void paintComponent(Graphics g) { // 스윙 컴포넌트가 자신의 모양을 그리는 메서드
		g.drawImage(img, 0, 0, null);
	}
}

public class PutImage {
	public static void main(String[] args) {
		JFrame frame = new JFrame("PutImage");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		ImagePanel panel = new ImagePanel(new ImageIcon("./image/photo.jpg").getImage()); // 이미지 패널 생성 및 이미지
		frame.add(panel); // 아이콘을 이미지 클래스로 // 변환하여 불러오기
		frame.pack(); // 패널의 이미지 사이즈에 맞게 프레임의 사이즈 자동 조절

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
