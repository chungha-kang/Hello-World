package exam04;

import exam03.Grade;

// 프리미엄 고객
public class PremiumCustomer extends Customer {
	// (이름, 나이, 성별), 할인률, 누적구입액
	private int expand;
	private int sale;
	
	public PremiumCustomer(int expand) {
		this.expand = expand;
	}
	
	// 누적구입액에 따라 할인률 차등 적용
	public void setExpand(int expand) {
		if(expand >= 0 && expand <= 999999) {
			this.expand = expand;
	
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public int getExpand() {
		return expand;
	}
	public void setExpand(int expand) {
		this.expand = expand;
	}
	
	@Override
	public String toString() {
		return "PremiumCustomer [sale=" + sale + ", expand=" + expand + "]";
	}
}
