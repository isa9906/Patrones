public class FileSysUtil_Rev {

  public void moveContents(Directory src, Directory dest) {
    if (src.hashCode() > dest.hashCode()) {
      synchronized (src) {
    	  System.out.println("Se bloqueó "+ src.getName());
        synchronized (dest) {
        	System.out.println("Se bloqueó "+ dest.getName());
            System.out.println("Contents Moved Successfully");
          
        }
      }
    } else {
      synchronized (dest) {
    	  System.out.println("Se bloqueó "+ dest.getName());
        synchronized (src) {
        	System.out.println("Se bloqueó "+ src.getName());
            System.out.println("Contents Moved Successfully");
        }
      }
    }
  }
}
