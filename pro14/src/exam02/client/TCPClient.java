package exam02.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. 클라이언트용 소켓 생성
		*/
		byte[] addr = new byte[] {(byte)192, (byte)168, 0, 5};
		try {
			InetAddress serverIP = InetAddress.getByAddress(addr);
			int serverPort = 50000;
			
			Socket sock = new Socket(serverIP, serverPort);
			
			/*
			 * 2. 통신용 입출력 스트림 생성
			 */
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			//							성능 향상				문자 변환 보조			바이트 기반
			//							(바이트 데이터가 들어오면 문자로 변환하고 버퍼에 쌓인다. 병목 현상을 줄여줌)
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			//							버퍼에 담긴 데이터를		문자로 출력,			바이트로 변환
			
			while(true) {
				// 서버로 부터 수신한 메세지가 있으면 반복 진행.
				while(sockIn.ready()) {
					String Line = sockIn.readLine();
					System.out.println(Line);
				}
				
				if(sock.isClosed()) {
					System.out.println("서버와의 연결이 종료되었습니다.");
					break;
				}
				
				// 서버에 메세지 전송
				System.out.print("Client : ");
				String msg = sc.nextLine();
				sockOut.write(msg);
				sockOut.newLine();
				sockOut.flush();
			}

			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
