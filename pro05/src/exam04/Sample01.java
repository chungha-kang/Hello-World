package exam04;

public class Sample01 {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		// Static 예약어를 사용한 변수는 클래스 명으로 사용하는 것을 권장한다.
		st1.share = 20;		// share = 갚을 공유 함 (얕은 복사) // StaticTest.Share = 20; 도 가능
		System.out.println(st1.share + "|" + st2.share + "|" + st3.share);

		st2.share = 30;
		System.out.println(st1.share + "|" + st2.share + "|" + st3.share);

		st3.share = 40;
		System.out.println(st1.share + "|" + st2.share + "|" + st3.share);

		FinalTest ft1 = new FinalTest();
		
		System.out.println(ft1.CONSTANT);
//		ft1.CONSTANT = 20;
		
		FinalStaticTest fst1 = new FinalStaticTest();
		FinalStaticTest fst2 = new FinalStaticTest();

		System.out.println(fst1.CONSTSHARE+ "|" + fst2.CONSTSHARE);
		System.out.println(FinalStaticTest.CONSTSHARE);
//		FinalStaticTest.CONSTSHARE = 30;		// Final 이므로 불가능
	}

}
