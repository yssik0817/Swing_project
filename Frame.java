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
		JPasswordField txtPass = new JPasswordField(10);	//입력할 때 암호화하는 텍스트 필드
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener(){		//로그인 버튼 기능 추가

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Dan";
				String pass = "1234";
				
				//아이디와 비밀번호 같은지 확인
				if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "You have logged in Successfully!");
					//단순 메시지를 출력하는 다이얼로그
				}
			}
		});
		
		add(panel);
		
		setVisible(true);				//보이게함
		setSize(600,400);				//사이즈 정의
		setLocationRelativeTo(null);	//팝업 위치 가운데
		setResizable(false);			//사이즈 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//종료시 모두 종료
		
	}
	public static void main(String[] args) {
		new Frame();
	}
}
