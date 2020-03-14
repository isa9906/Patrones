public class FolderInt implements IFolder 
{
 private Folder folder;
 private User   user;
 private int counter;

 public FolderInt(Folder f)
 {
 this.folder=f;
 this.counter=0;
 }
 @Override
 public void performReadOrWriteOperations(User u) {
 this.user=u;
 counter=counter + 1;
 {

 if(user.getDesignation().equalsIgnoreCase("CEO") || user.getDesignation().equalsIgnoreCase("Manager") )
 {
	 
/*	 folder = new Folder();*/
	 System.out.println(this.getClass()+" : Number of calls to " + this.folder.getName() + " object are =" + this.counter);
	 System.out.println(this.getClass()+" : Folder broker calls 'performReadOrWriteOperations' method to the folder object by user: "+ this.user.getUserName());
 }
 else
 {
	 System.out.println(this.getClass()+" : Number of calls to " + this.folder.getName() + " object are ="+ this.counter);
	 System.out.println(this.getClass()+": Folder broker says: " + this.user.getUserName() + " , You don't have access to folder: " + this.folder.getName());
 }
 }
}
}