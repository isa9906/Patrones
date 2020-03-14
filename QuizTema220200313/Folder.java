public class Folder implements IFolder{
	String name; 
public Folder(String s) {
	name=s;
}
public String getName() {
	return name;
}
public void setName(String t) {
	name=t;
}
 @Override
 public void performReadOrWriteOperations(User u){
 System.out.println(this.getClass()+" : Performing read or write operation on the target folder for user" + u );          
        }
}



