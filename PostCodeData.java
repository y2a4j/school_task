//郵便番号データ
public class PostCodeData {
	String zipcode;
	String pref;
	String city;
	String town;

	public PostCodeData(String zipcode, String pref, String city, String town) {
		this.zipcode = zipcode;
		this.pref = pref;
		this.city = city;
		this.town = town;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPref() {
		return pref;
	}

	public String getCity() {
		return city;
	}

	public String getTown() {
		return town;
	}

	@Override
	public String toString() {
		return "PostCodeData [zipcode=" + zipcode + ", pref=" + pref + ", city=" + city + ", town=" + town + "]";
	}

}
