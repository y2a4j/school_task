import java.util.Scanner;
public class PostCodeSearch {
	public static void main(String args[]) {
		ZipDB3 zd3 = new ZipDB3("郵便番号ファイル");

		Scanner s = new Scanner(System.in);

		System.out.println("郵便番号を入力して下さい");
		while(s.hasNext()){
			String line = s.nextLine();

			zd3.searchPrint(line);
			System.out.println("続けて検索できます。郵便番号を入力して下さい");
		}
		s.close();
	}

}
