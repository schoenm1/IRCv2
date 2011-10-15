package main.ch.zhaw.students.groupf.server;

import java.io.IOException;
/**
 * The Class ServerStarter starts the SocketServer. To start the Server start this compiled .JAR File
 * with the prefered TCP-Port on which the Server sould listen.
 * 
 * eg.: To start the Server on Listening-Port 90100
 * >java ServerStarter.jar 90100
 * 
 * @author Renato Estermann
 * 
 */
public class ServerStarter {
	public static void main(String[] args){
		
		//TODO eventually replace with BufferedReader from Config File or Java-Class in .groupf.data
		int serverPort = Integer.parseInt(args[0]);
		
		new SocketServer(serverPort);
		
	}
}