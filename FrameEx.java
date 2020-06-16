package NEW;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FrameEx {
	public static void main(String[] args) {
		JFrame frame = new JFrame();		//�����ϴ� �ϳ��� ��
		JPanel panel = new JPanel();		//������ ���̿� ���� ���� ���� ����
		JLabel label = new JLabel("some text");			//���̺� �߰�
		JButton btn1 = new JButton("Click me!");		//��ư
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea();			//���� ����
		//JTextField txtField = new JTextField(200);	//�� �� �۾�(���� �ʼ�: �۾��� ����)
		JPanel btnPanel = new JPanel();					//��ư �г�
		
		panel.setLayout(new BorderLayout());	//�ڱⰡ ���ϴ� ��Ĵ�� ��ġ��Ų��.
		
		btnPanel.add(btn1);			//��ư1 ���
		btnPanel.add(btn2);			//��ư2 ���
		
		panel.add(label, BorderLayout.NORTH);		//���ʿ� ��ġ
		panel.add(btnPanel, BorderLayout.WEST);			//���ʿ� ��ġ
		panel.add(txtArea, BorderLayout.CENTER);	//�߾� ��ġ
		
		btn1.addActionListener(new ActionListener(){	//��ư ��� �߰�
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				//txtArea.append("You are amazing\n"); ��ư Ŭ���� ���ڿ� ����
				label.setText(txtArea.getText());			//txtArea�� �Է��� �ؽ�Ʈ�� ��ȯ		
			}
		});
		
		btn2.addActionListener(new ActionListener(){	//��ư ��� �߰�
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);							//����
			}
		});
		
		frame.add(panel);
		
		frame.setResizable(false);	//������ ������ ���� ���� ����
		frame.setVisible(true);		//���̰� �ϱ�
		frame.setPreferredSize(new Dimension(840, 840/12*9));	//��,��
		frame.setSize(840, 840/12*9);	//������
		frame.setLocationRelativeTo(null);	//����� �˾� ��ġ, ��� ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���� �� ��� ����
	}
}
