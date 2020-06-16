package NEW;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	//패널열었을 때 이미지를 자동으로 보이게 하기
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
}

public class Lesson08 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lesson08");
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//이미지 보이기
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/dog.jpg").getImage());
		frame.add(panel);
		frame.pack();
		
		//File f = new File("./image/dog.jpg");
		//System.out.println(f.exists()?"Exists":"NO Exists");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
