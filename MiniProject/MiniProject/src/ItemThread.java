import java.awt.*;
import javax.swing.JLabel;

public class ItemThread extends Thread {
	private JLabel item = null;
	private int delay = 0; 
	
	public ItemThread(JLabel item, int delay) {
		this.item = item;
		this.delay = delay;
	}
	@Override
	public void run() { // 스레드 코드. 이주소에서 실행을 시작하도록  TCB에 기록된다.
		while(true) {
			Container c = item.getParent(); // label이 붙어 있는 컨테이너
			int x = item.getX();
			int y = item.getY();
			item.setLocation(x,y+10);
				
			if(y >= c.getHeight()) {
				interrupt(); // thread 종료
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				c.remove(item); //컨테이너에서 label 컴포넌트 떼어내기
				c.repaint(); //컨테이너에게 다시 그릴 것을 지시
				
				return; //run()의 리턴은 스레드 종료
			}
		}
	}
}
