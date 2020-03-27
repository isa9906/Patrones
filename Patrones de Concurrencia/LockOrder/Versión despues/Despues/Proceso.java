
public class Proceso extends Thread {

	Directory source;
	Directory destination;
	private FileSysUtil_Rev fl;
	String sourcetxt;
	String destinationtxt;
	public Proceso (Directory src, Directory dst) {
		fl=new FileSysUtil_Rev();
		source= src;
		destination=dst;
		sourcetxt= src.getName();
		destinationtxt=dst.getName();
	}
	public void run() {
		System.out.println("Se moverá "+ sourcetxt + " to " + destinationtxt);
		fl.moveContents(source, destination);
	}	
}
