package practice_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Logger log=LogManager.getLogger(Log.class);
		log.info("Helli");
		

	}

}
