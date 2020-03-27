
public class Test {
	public static void main(String args []) {
		Directory dir1= new Directory ("directorio1");
		Directory dir2= new Directory ("directorio2");
		Proceso p1= new Proceso(dir1,dir2);
		Proceso p2= new Proceso(dir2,dir1);
		p1.start();
		p2.start();
	}
}
