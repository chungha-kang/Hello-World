import java.text.SimpleDateFormat;
import java.util.Date;

import controller.LoginMenuManager;
import controller.MenuManager;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * 프로그램 시작 점.
		 */
		SimpleDateFormat sFormat = new SimpleDateFormat("현재 시각 : yyyy년 MM월 dd일 a hh시 mm분 ss초");
		LoginMenuManager loginMenu = new LoginMenuManager();
//		MenuManager myMenu = new MenuManager();
		
		System.out.println(sFormat.format(new Date()));
		loginMenu.main();
//		myMenu.main();
	}

}
