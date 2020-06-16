package NEW;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jtable {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		String[] headings = new String[] {"id","Name", "Country"};
		Object[][] data = new Object[][] {
			{"1","Daniel","Korea"},
			{"2","Sunny","France"},
			{"3","Jhon","Japan"}
		};
		
		
		JTable table = new JTable(data, headings);
		//데이터, 의미
		
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		//하나의 디멘션(사각형)을 따로 만들어서 사이즈 저장
		
		table.setFillsViewportHeight(true);	
		//setVisible과 유사
		
		panel.add(new JScrollPane(table));	
		//스크롤할 수 있게 설정
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
