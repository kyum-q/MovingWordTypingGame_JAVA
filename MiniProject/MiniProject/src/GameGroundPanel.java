import java.awt.*;
import javax.swing.*;

class GameGroundPanel extends JPanel {
	private TextSource textSource = null;
	private Thread textTh [] = null;
	private Thread diamondTh = null;
	private ScorePanel scorePanel = null;

	private ImageIcon icon = new ImageIcon("game.png");
	private Image img = icon.getImage();
		
	public GameGroundPanel(ScorePanel scorePanel, Thread[] textTh,TextSource textSource) {
		this.scorePanel = scorePanel;
		this.textTh = textTh;
		this.textSource = textSource;
		setLayout(null); // Layout ���ֱ�
	}
	public void textAdd(JLabel text) {
		addNewWord(text); // �ܾ� �ҷ�����
		text.setSize(150,30);
		// x�� ������ ��ġ���� y�� �ð��� ���� �����;��ϹǷ� 10�������� ����
		int x = (int)(Math.random()*300); 
		int y = 10; 
		text.setLocation(x,y);
		text.setForeground(Color.WHITE);
		add(text);
	}
	public void addNewWord(JLabel text) { // �ܾ� �� �� ����
		String newWord = textSource.get(); // �ܾ� �ϳ� ��������
		text.setText(newWord); // text ������ �ܾ�� ����	
	}
	public void paintComponent(Graphics g) { //call back �Լ�
		super.paintComponent(g); // �߿� - �г��� ��� ����� -> ������ ĥ�Ѵ�
		g.drawImage(img, 0,0, this.getWidth(), this.getHeight(), null);
	}
}