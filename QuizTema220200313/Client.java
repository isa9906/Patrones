 /**** Adapted by https://ramj2ee.blogspot.com.co/2013/11/proxy-design-pattern-implementation.html#.WuNtyYCVsWN ****/
 
 public class Client{
 public static void main( String[] args){
 Folder dir1 = new Folder("My Folder");
 FolderInt folderRep = new FolderInt(dir1);
 User john = new User("John", "John123","CEO");
 System.out.println("Client passing user with designation 'CEO' to folderRep");
 folderRep.performReadOrWriteOperations(john);
 System.out.println("\n************************************************************           ***********************\n");
 User luisa = new User("Luisa", "LUI123","Developer");
 System.out.println("Client passing user with designation 'Developer' to folderRep");
 folderRep.performReadOrWriteOperations(luisa);
 System.out.println("\n************************************************************           ***********************\n");
 User manuel = new User("Manuel", "Manu123","Manager");
 System.out.println("Client passing user with designation 'Manager' to folderRep");
 folderRep.performReadOrWriteOperations(manuel);
 }
}
