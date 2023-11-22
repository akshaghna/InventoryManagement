package im.dao;

public class UserCatalogueItem {
	String itemname;
	int pcost;
	int scost;
	int sizexsavail;
	int sizexssold;
	int sizesavail;
	int sizessold;
	int sizemavail;
	int sizemsold;
	int sizelavail;
	int sizelsold;
	int sizexlavail;
	int sizexlsold;
	int sizexxlavail;
	int sizexxlsold;
	
	
	@Override
	public String toString() {
		return "UserCatalogueItem [itemname=" + itemname + ", pcost=" + pcost + ", scost=" + scost + ", sizexsavail="
				+ sizexsavail + ", sizexssold=" + sizexssold + ", sizesavail=" + sizesavail + ", sizessold=" + sizessold
				+ ", sizemavail=" + sizemavail + ", sizemsold=" + sizemsold + ", sizelavail=" + sizelavail
				+ ", sizelsold=" + sizelsold + ", sizexlavail=" + sizexlavail + ", sizexlsold=" + sizexlsold
				+ ", sizexxlavail=" + sizexxlavail + ", sizexxlsold=" + sizexxlsold + "]";
	}
	public UserCatalogueItem(String itemname, int pcost, int scost,int sizexsavail, int sizexssold, int sizesavail, 
			int sizessold,int sizemavail,int sizemsold,int sizelavail, int sizelsold, int sizexlavail, int sizexlsold,
			int sizexxlavail, int sizexxlsold) {
		super();
		this.itemname = itemname;
		this.pcost = pcost;
		this.scost = scost;
		this.sizexsavail = sizexsavail;
		this.sizexssold = sizexssold;
		this.sizesavail = sizesavail;
		this.sizessold = sizessold;
		this.sizemavail = sizemavail;
		this.sizemsold = sizemsold;
		this.sizelavail = sizelavail;
		this.sizelsold = sizelsold;
		this.sizexlavail = sizexlavail;
		this.sizexlsold = sizexlsold;
		this.sizexxlavail = sizexxlavail;
		this.sizexxlsold = sizexxlsold;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public int getScost() {
		return scost;
	}
	public void setScost(int scost) {
		this.scost = scost;
	}
	public int getsizexsavail() {
		return sizexsavail;
	}
	public void setsizexsavail(int sizexsavail) {
		this.sizexsavail = sizexsavail;
	}
	public int getsizexssold() {
		return sizexssold;
	}
	public void setsizexssold(int sizexssold) {
		this.sizexssold = sizexssold;
	}
	public int getsizesavail() {
		return sizesavail;
	}
	public void setsizesavail(int sizesavail) {
		this.sizesavail = sizesavail;
	}
	public int getsizessold() {
		return sizessold;
	}
	public void setsizessold(int sizessold) {
		this.sizessold = sizessold;
	}
	public int getsizemavail() {
		return sizemavail;
	}
	public void setsizemavail(int sizemavail) {
		this.sizemavail = sizemavail;
	}
	public int getsizemsold() {
		return sizemsold;
	}
	public void setsizemsold(int sizemsold) {
		this.sizemsold = sizemsold;
	}
	public int getsizelavail() {
		return sizelavail;
	}
	public void setsizelavail(int sizelavail) {
		this.sizelavail = sizelavail;
	}
	public int getsizelsold() {
		return sizelsold;
	}
	public void setsizelsold(int sizelsold) {
		this.sizelsold = sizelsold;
	}
	public int getsizexlavail() {
		return sizexlavail;
	}
	public void setsizexlavail(int sizexlavail) {
		this.scost = sizexlavail;
	}
	public int getsizexlsold() {
		return sizexlsold;
	}
	public void setsizexlsold(int sizexlsold) {
		this.sizexlsold = sizexlsold;
	}
	public int getsizexxlavail() {
		return sizexxlavail;
	}
	public void setsizexxlavail(int sizexxlavail) {
		this.sizexxlavail = sizexxlavail;
	}
	public int getsizexxlsold() {
		return sizexxlsold;
	}
	public void setsizexxlsold(int sizexxlsold) {
		this.sizexxlsold = sizexxlsold;
	}
	
	
}
	
	


