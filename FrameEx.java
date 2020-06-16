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
		JFrame frame = new JFrame();		//시작하는 하나의 툴
		JPanel panel = new JPanel();		//프레임 사이에 여러 가지 정보 삽입
		JLabel label = new JLabel("some text");			//레이블 추가
		JButton btn1 = new JButton("Click me!");		//버튼
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea();			//많은 내용
		//JTextField txtField = new JTextField(200);	//한 줄 글씨(숫자 필수: 글씨수 제한)
		JPanel btnPanel = new JPanel();					//버튼 패널
		
		panel.setLayout(new BorderLayout());	//자기가 원하는 방식대로 위치시킨다.
		
		btnPanel.add(btn1);			//버튼1 출력
		btnPanel.add(btn2);			//버튼2 출력
		
		panel.add(label, BorderLayout.NORTH);		//위쪽에 위치
		panel.add(btnPanel, BorderLayout.WEST);			//왼쪽에 위치
		panel.add(txtArea, BorderLayout.CENTER);	//중앙 위치
		
		btn1.addActionListener(new ActionListener(){	//버튼 기능 추가
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				//txtArea.append("You are amazing\n"); 버튼 클릭시 문자열 삽입
				label.setText(txtArea.getText());			//txtArea를 입력한 텍스트로 변환		
			}
		});
		
		btn2.addActionListener(new ActionListener(){	//버튼 기능 추가
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);							//종료
			}
		});
		
		frame.add(panel);
		
		frame.setResizable(false);	//프레임 사이즈 조정 가능 여부
		frame.setVisible(true);		//보이게 하기
		frame.setPreferredSize(new Dimension(840, 840/12*9));	//좌,우
		frame.setSize(840, 840/12*9);	//사이즈
		frame.setLocationRelativeTo(null);	//실행시 팝업 위치, 가운데 출력
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 시 모두 종료
	}
}
