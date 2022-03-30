package exam06;

// 프리미엄 고객
public class PremiumCustomer extends Customer {
	// (이름, 나이, 성별), 할인률, 누적구입액
	private int priceTotal;
	private double discount;
	
	public int getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(int priceTotal) {
		this.priceTotal = priceTotal;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public void buy(String productName, int price) {
		priceTotal += price;
		double p = _calcDiscount(price);
		System.out.printf("%s 상품을 %.2f 할인율을 적용하여 %,.1f 원에 구입하였습니다.\n", productName, discount, p);
	}
	
	@Override
	public Customer renewal() {
		Customer c = this;				// 업 캐스팅
		if(priceTotal < 5000000) {
			c = new NormalCustomer();	// 업 캐스팅
			c.setName(getName());
			c.setAge(getAge());
			c.setGender(getGender());
			System.out.println("누적사용액이 기준에 미달하여 일반 고객으로 강등 조치 되었습니다.");
		}
		return c;
	}
	
	private double _calcDiscount(int price) {
		if(priceTotal >= 10000000) {
			discount = 0.1;
			return price * (1 - 0.1);
		} else if(priceTotal >= 5000000) {
			discount = 0.05;
			return price * (1- 0.05);
		} else if(priceTotal >= 1000000) {
			discount = 0.01;
			return price * (1 - 0.01);
		} else {
			return price;
		}
	}
}