package NEW;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame  extends JFrame{
	public Frame(){
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);	//�Է��� �� ��ȣȭ�ϴ� �ؽ�Ʈ �ʵ�
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener(){		//�α��� ��ư ��� �߰�

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Dan";
				String pass = "1234";
				
				//���̵�� ��й�ȣ ������ Ȯ��
				if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "You have logged in Successfully!");
					//�ܼ� �޽����� ����ϴ� ���̾�α�
				}
			}
		});
		
		add(panel);
		
		setVisible(true);				//���̰���
		setSize(600,400);				//������ ����
		setLocationRelativeTo(null);	//�˾� ��ġ ���
		setResizable(false);			//������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//����� ��� ����
		
	}
	public static void main(String[] args) {
		new Frame();
	}
}
