import java.awt.Container;
import java.time.Clock;
import javax.swing.JLabel;

class TextMoveThread extends Thread {
	private ScorePanel scorePanel = null;
	private GamePanel gamePanel = null;
	private int delay = 600;
	private int increase = 10;
	private int i = 0; // text[i]의 i
	private JLabel label = null;
	
	public TextMoveThread (JLabel label, ScorePanel scorePanel,GamePanel gamePanel, int i, int delay) {
		String name  = "text[" + i + "]";
		this.setName(name);
		this.i = i;
		this.delay = delay;
		this.label = label;
		this.scorePanel = scorePanel;
		this.gamePanel = gamePanel;
	}
	@Override
	public void run() { // 스레드 코드. 이주소에서 실행을 시작하도록  TCB에 기록된다.
		while(true) {
			Container c = label.getParent(); // label이 붙어 있는 컨테이너
			// label에 x,y 위치 알아내기
			int x = label.getX();
			int y = label.getY();
			label.setLocation(x,y+increase); // y를 increase만큼 이동 시키기
				
			if(y >= c.getHeight()) { // label이 맨 아래까지 내려갈 경우
				scorePanel.lifeDecrease(); // life 감소
				interrupt(); // thread 종료
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				gamePanel.textCountDecrease(); // text 수 감소
				gamePanel.setTextChange(i,0); // 입력해야하는 단어수 변경
				c.remove(label); //컨테이너에서 label 컴포넌트 떼어내기
				c.repaint(); //컨테이너에게 다시 그릴 것을 지시
				return; //run()의 리턴은 스레드 종료
			}
		}
	}
	public void textSpped(double n) { delay = (int)(delay*n); } // delay n배
}