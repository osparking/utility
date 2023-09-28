package space.jbpark.utility;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class MyUtil {
	public static ConsoleHandler handler;

	public static Logger getLogger(String className) {
		Logger logger = Logger.getLogger(className);
		handler = new ConsoleHandler();
		try {
			handler.setEncoding("UTF-8");
		} catch (SecurityException | UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		logger.addHandler(handler);
		logger.setUseParentHandlers(false);
		return logger;
	}
	
	public static PrintStream getPrintStream() {
		var ps = new PrintStream(System.out, true, UTF_8);
		return ps;
	}
}
