
public class Proceso extends Thread {

	Directory source;
	Directory destination;
	private FileSysUtil fl;
	String sourcetxt;
	String destinationtxt;
	public Proceso (Directory src, Directory dst) {
		fl=new FileSysUtil();
		source= src;
		destination=dst;
		sourcetxt= source.getName();
		destinationtxt=destination.getName();
	}
	public void run() {
		System.out.println("Se moverá "+ sourcetxt + " to " + destinationtxt);
		fl.moveContents(source, destination);
	}	
}
