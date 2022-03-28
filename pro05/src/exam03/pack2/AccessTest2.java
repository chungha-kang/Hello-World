package exam03.pack2;

import exam03.pack1.AccessMain;

public class AccessTest2 {
	 public static void main(String[] args) {
		 AccessMain m1 = new AccessMain();
			System.out.println(m1.v1);		// 다른 패키지에서 가져 올 수 있는건 public 뿐
			System.out.println(m1.v2);
			System.out.println(m1.v3);
			System.out.println(m1.v4);		
	 }

}
