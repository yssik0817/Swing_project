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
		//������, �ǹ�
		
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		//�ϳ��� ����(�簢��)�� ���� ���� ������ ����
		
		table.setFillsViewportHeight(true);	
		//setVisible�� ����
		
		panel.add(new JScrollPane(table));	
		//��ũ���� �� �ְ� ����
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
