public class FileSysUtil {

  public void moveContents(Directory src, Directory dest) {
    synchronized (src) {
    	System.out.println("Se bloqueó "+src.getName());
      synchronized (dest) {
    	 System.out.println("Se bloqueó "+ dest.getName());
        System.out.println("Contents Moved Successfully");
      }
    }
  }
}
