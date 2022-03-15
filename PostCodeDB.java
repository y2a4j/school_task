//郵便番号簿のクラス
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PostCodeDB{
	//ArrayListの利用
	ArrayList<PostCodeData> db;

	public PostCodeDB(String file) {

		db = new ArrayList<PostCodeData>();

		try (Scanner sfile = new Scanner(new File(file))){
			while (sfile.hasNext()) {
				String line = sfile.nextLine();
				String sarr[] = line.split(",");

				db.add(new PostCodeData(sarr[1],sarr[2],sarr[3],sarr[4]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			System.exit(1);
		}
	}

	public void searchPrint(String zipcode) {

		for(ZipData3 z3: db) {
			if(z3.getZipcode().equals(zipcode))
				System.out.println(z3);
		}
	}

	public int size() {
		return db.size();
	}

	public void printAll() {

		for(PotCodeData z3:db) {
			System.out.println(z3);
		}
	}
}
