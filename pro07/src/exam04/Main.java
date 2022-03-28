package exam04;

public class Main {

	public static void main(String[] args) {
		PremiumCustomer VIP = new PremiumCustomer();
		Expand VVIP = new Expand("누적구입액 3,000,000원 이상 (할인률 5%)", 3000000);
		Expand VVVIP = new Expand("누적구입액 10,000,000원 이상 (할인률 10%)", );
		
		System.out.println(VIP.getName());

	}

}
