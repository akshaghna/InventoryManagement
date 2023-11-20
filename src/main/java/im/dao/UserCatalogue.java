package im.dao;

public class UserCatalogue {
	
	String catalogueName;
	int year;
	String season;
	
	@Override
	public String toString() {
		return "UserCatalogue [catalogueName=" + catalogueName + ", year=" + year + ", season=" + season + "]";
	}
	public UserCatalogue(String catalogueName, int year, String season) {
		super();
		this.catalogueName = catalogueName;
		this.year = year;
		this.season = season;
	}
	public String getCatalogueName() {
		return catalogueName;
	}
	public void setCatalogueName(String catalogueName) {
		this.catalogueName = catalogueName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	

}
