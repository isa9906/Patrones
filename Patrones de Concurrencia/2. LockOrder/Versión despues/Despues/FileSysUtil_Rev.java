public class FileSysUtil_Rev {

  public void moveContents(Directory src, Directory dest) {
    if (src.hashCode() > dest.hashCode()) {
      synchronized (src) {
    	  System.out.println("Se bloque� "+ src.getName());
        synchronized (dest) {
        	System.out.println("Se bloque� "+ dest.getName());
            System.out.println("Contents Moved Successfully");
          
        }
      }
    } else {
      synchronized (dest) {
    	  System.out.println("Se bloque� "+ dest.getName());
        synchronized (src) {
        	System.out.println("Se bloque� "+ src.getName());
            System.out.println("Contents Moved Successfully");
        }
      }
    }
  }
}
