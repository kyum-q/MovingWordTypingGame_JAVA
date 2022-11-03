import java.io.*;
import java.util.*;

public class TextSource {
	private Vector<String> [] v = new Vector[2];
	
	private File [] file = new File[2];
	private int select = 0; // 언어 선택을 도와주는 변수
	public TextSource() { // 파일에서 읽기
		for(int i=0;i<2;i++) 
			v[i] = new Vector<String>(26000); //= new Vector<String>(26000);
			
		// select가 0일경우 영어 1일경우 한글
		file[0] = new File("eng.txt"); 
		file[1] = new File("kor.txt");
		readFile();
	}
	private void readFile() {
		try {
			for(int i=0;i<2;i++) {
				Scanner fscanner = new Scanner(new FileReader(file[i]));
				while(fscanner.hasNext()) {  // scanner로 true와 값가져오기 (값이 없으면 false)
					String word = fscanner.nextLine();
					v[i].add(word.trim()); // 앞 뒤 공백 자르기
				}
			fscanner.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void writeFile(String text) {
		try {
			FileWriter fw = new FileWriter(file[select], true); // true는 원래 있던 txt 파일에 이어서쓰기 위해 존재 
			BufferedWriter writer = new BufferedWriter(fw); 
			writer.newLine(); // 새로운 라인 만들기 (다음줄에)
			writer.write(text); // 파일에 text 추가
			writer.flush();
			writer.close();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String get() {
		int index = (int)(Math.random()*v[select].size());
		// v의 있는 단어 하나를 가져오기 위해 (0~v.size()-1)의 수를 랜덤하게 선택
		return v[select].get(index);
		// index의 단어를 리턴
	}
	public void setLanguage(int i) { select = i; } // 언어 변경
}
