package exam06;

	/*
	 * 직원(Employee) 고객 클래스를 별도로 생성하여 다음의 기능이 동작하도록 한다.
	 * 		- 직원 고객이 물품을 구입할 때 직원 할인가를 적용하여 구입할 수 있도록 한다.
	 * 		  (직원 할인가는 10% 이다.)
	 * 
	 * 모든 고객은 구입한 물품에 대해 환불을 받을 수 있다.
	 * 단, 일반 고객은 구입 영수증이 있어야 환불 받을 수 있다.
	 * 
	 * 고객 정보는 1년에 한번씩 갱신을 수행하며, 프리미엄 고객의 경우 갱신할 시점의
	 * 누적구입액이 최소 5,000,000 원 미안인 경우 일반 고객으로 강등된다.
	 * (100번 반복 횟수에서 30, 60, 90 번 반복에 해당하는 경우 모든 고객의 정보를
	 *  갱신 하도록 하여 1년에 한번씩 갱신을 수행한 것으로 간주한다.)
	 */

public class EmployeeCustomer extends Customer {
	
	@Override
	public void buy(String productName, int price) {
		price = (int)(price * (1 - 0.1));
		super.buy(productName, price);
	}

}
