package exam02.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		try {
			/*
			 * 1. 서보용 소켓 생성
			 */
			ServerSocket sSock = new ServerSocket();
		
			/*
			 * 2. 생성한 소켓에 서버IP 주소, 서버 Port 번호 바인딩(연결)
			 */
			byte[] addr = new byte[] {(byte)192, (byte)168, 0, 5};
			InetAddress serverIP = InetAddress.getByAddress(addr);
			int serverPort = 50000;
			
			InetSocketAddress serverIpPort = new InetSocketAddress(serverIP, serverPort);
			sSock.bind(serverIpPort);
			
			Socket cSock = sSock.accept();
			
			InetAddress clientIP = cSock.getInetAddress();
			int clientPort = cSock.getPort();
			int connectionPort = cSock.getLocalPort();
			
			System.out.printf("%s:%d <----> %s:%d\n", serverIP.getHostAddress(), connectionPort,
					clientIP.getHostAddress(), clientPort);

			/*
			 * 3. 
			 */
			Socket cScok = sSock.accept();
			
			InetAddress clientOP = cSock.getInetAddress();	// 클라이언트 주소 정보
			int clientPort = cSock.getPort();				// 클라이언트 포트 정보
			int connectionPort = cSock.getLocalPort();		// 서버 포트 정보
			
			System.out.printf("%s:%d <----> %s:%d\n", serverIP.getHostAddress(), connectionPort,
					clientPort, connectionPort);
			
			/*
			 * 4. 통신용 입출력 스트림 생성
			 */

			BufferedReader sockIn = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(cSock.getOutputStream()));
			
			/*
			 * 5. 지속적인 통신을 위한 반복문
			 */
			boolean disconnect = false;
			while(true) {
				// 클라이언트로 부터 수신한 메세지가 있으면 반복 진행.
				while(sockIn.ready()) {
					String line = sockIn.readLine();
					if(line.contains("exit")) {
						disconnect = true;
						break;
					}
					System.out.println(line);
				}
				if(disconnect) {
					break;
				}
			}
			
			/*
			 * 6. 통신 종료 후에는 모든 자원 반납.
			 */
			sockIn.close();
			sockOut.close();
			cSock.close();
			sSock.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
