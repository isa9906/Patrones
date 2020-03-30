
public class Proceso extends Thread {
		private Logger logger;
		public void run() {
			logger = FileLogger.getFileLogger();
			logger.log("mensaje");
		}
		
	
}
