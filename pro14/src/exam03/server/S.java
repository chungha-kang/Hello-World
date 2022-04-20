package exam03.server;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class S {
	
	public static void dataReceive(DatagramSocket socket) throws IOException {
		int buffersize = socket.getReceiveBufferSize();
		byte[] buffer = new byte[bufferSize];
		
		DatagramSocket packet = new DatagramPacket(buff, buff.length);
		while(true) {
			socket.receive(packet);
		}
	}

	public static void main(String[] args) {
		try {
			byte[] addr = new byte[] {(byte)192, (byte)168, 0, 5};
			InetAddress serverIP = InetAddress.getByAddress(addr);
			int port = 50000;
		
			DatagramSocket udpSocket = new DatagramSocket(port, ipv4);
			
			dataReceive(udpSocket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
