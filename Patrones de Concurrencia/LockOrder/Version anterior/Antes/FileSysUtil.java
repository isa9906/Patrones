public class FileSysUtil {

  public void moveContents(Directory src, Directory dest) {
    synchronized (src) {
    	System.out.println("Se bloque� "+src.getName());
      synchronized (dest) {
    	 System.out.println("Se bloque� "+ dest.getName());
        System.out.println("Contents Moved Successfully");
      }
    }
  }
}
