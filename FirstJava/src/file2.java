import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class file2 {
	
	private static ArrayList<String> readFile() {
		ArrayList<String> strs = new ArrayList<String>();
		try(Reader reader = new FileReader("C:\\Users\\USER\\CusomerM\\CusomerManager.txt");
			BufferedReader bufReader = new BufferedReader(reader) ){
			
			String line = "";
			String[] arr = new String[4];
			int tmp = 0;
			int tmp2 = 0;
			int i = 0;
			while((line = bufReader.readLine()) != null) {
				tmp = line.indexOf("이름");
				tmp2 = line.indexOf(",");
				arr[0] = line.substring(tmp, tmp2);
				
				tmp = line.indexOf("성별");
				arr[1] = line.substring(tmp, line.indexOf(",", tmp));
				
				tmp = line.indexOf("이메일");
				arr[2] = line.substring(tmp, line.indexOf(",", tmp));
				
				tmp = line.indexOf("출생년도");
				arr[3] = line.substring(tmp);
				
				strs.add(arr[0] + "\n" + arr[1] + "\n" + arr[2] + "\n" + arr[3] + "\n");
				System.out.println(strs.get(i));
				i++;
			}
		}catch (FileNotFoundException e) {
			System.out.println("파일실패" + e.getMessage());
		}catch (IOException e) {
			System.out.println(e);
		}
		return strs;
	}

	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<String>();
		strs = readFile();

	}

}
