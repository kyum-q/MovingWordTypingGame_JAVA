import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EditPanel extends JPanel{
	private TextSource textSource = null;
	private JTextField edit = new JTextField(15);
	private Font font = new Font("타이포_쌍문동 B", Font.BOLD, 15);
	private JButton addButton = new JButton("add");
	private JLabel please1 = new JLabel("보석이 있는 곳을");
	private JLabel please2 = new JLabel("나에게 알려줘!");
	
	public EditPanel(TextSource textSource) {
		this.textSource = textSource;
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		please1.setFont(font);
		please2.setFont(font);
		add(please1);
		add(please2);
		add(edit);
		add(addButton);

		addButton.addActionListener(new ActionListener() { // 버튼에 action listener 등록
			@Override
			public void actionPerformed(ActionEvent e) {
				String inWord = edit.getText();  // edit에 적혀있는 단어 알아내기
				textSource.writeFile(inWord); // txt 파일에 inWord 추가
			}
		});
	}
}
