package ch.hszt.students.groupf.server.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hszt.students.groupf.server.srvconfig.ServerDefaultConfig;
//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;

/**
 * The Class ServerStarter starts the SocketServer. To start the Server start
 * this compiled .JAR File with the preferred TCP-Port on which the Server
 * should listen.
 * 
 * e.g.: To start the Server on Listening-Port 10550 >java -jar
 * ServerStarter.jar 90100
 * 
 * @author Renato Estermann
 * 
 */
public class ServerStarter {
	final static Logger logger = LoggerFactory.getLogger(ServerStarter.class);

	public static void main(String[] args) {
		// // assume SLF4J is bound to logback in the current environment
		// LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		// // print logback's internal status
		// StatusPrinter.print(lc);
		int serverPort = getServerPortToStart(args);

		new SocketServer(serverPort);

	}

	private static int getServerPortToStart(String[] args) {
		int serverPort = ServerDefaultConfig.SERVERPORT;

		// TODO eventually replace with BufferedReader from Config File
		if (args.length != 0) {
			try {

				serverPort = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				// TODO: Append to logger output that the default Serverport
				logger.info("Could not Parse Argument to Integer. Default Port " + ServerDefaultConfig.SERVERPORT
						+ " will be used");

			}
		}
		return serverPort;
	}
}
