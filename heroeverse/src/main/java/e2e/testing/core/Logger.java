package e2e.testing.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	private static final SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat hour_format = new SimpleDateFormat("HH:mm:ss");
	
	public Logger(String suite) {
		add("Test suite: " + suite);
		add("Execution date: " + date_format.format(new Date())); 
	}
	
	public void add(String line) {
		String trace = String.format("[%s]: %s", hour_format.format(new Date()), line);
		System.out.println(trace);
	}
}


