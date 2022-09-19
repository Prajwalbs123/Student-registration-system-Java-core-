package JavaProject;
import java.util.*;

class Std_Data{
    
    public static int n;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws InterruptedException
    {
        Must obj1 = new Must();
        System.out.println("Enter Institution name");
        String st=sc.nextLine(); //nextLine();
        System.out.println(st+" Records ");
        Thed obj = new Thed();
        obj.t.start();
        Thed obj2cksy = new Thed();

        try{
          obj.t.join();
          System.out.println("User Input");
          obj2cksy.t.start();
          obj2cksy.t.join();           //synchronizing.
          System.out.println("Enter Number of Students");
          n=sc.nextInt();   //nextInt()
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Exeption Caught: "+e);
            System.exit(1);
        }
        int i=0;
        
        while(i<n){
            System.out.println(obj1.must());
            percent p = new percent();
            p.dis();
            i++;
        }
    }
}

class student_data{

    Scanner sc = new Scanner(System.in);
    String name,branch,usn;
    long phno;

    student_data()  
    {
        try{
        System.out.print("Enter Name: ");
        name=sc.next();  //next()
        System.out.print("Enter Branch: ");
        branch=sc.next();
        System.out.print("Enter USN: ");
        usn=sc.next();
        System.out.print("Enter Phone Number: ");
        phno=sc.nextLong(); //nextLong() similar to nextInt()
          if(phno<=999999999)
          {
            throw new Exception(" Phone Number of less than 10 digits "); 
          }
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("Exeption Caught: "+e);
            System.exit(1);
        }
        catch(Exception e)
        {
            System.out.println("Exeption Caught: "+e);
            std();
        } 
    }

    student_data(String name,String branch,String usn,long phno) //overloading constructor
    {
        this.name=name;
        this.branch=branch;
        this.usn=usn;
        this.phno=phno;
    }

    private void std()  
    {
        try{
            System.out.print("Enter Phone Number: ");
            this.phno=sc.nextLong();
          if(phno<=999999999)
          {
            throw new Exception(" Phone Number of less than 10 digits ");
          }
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("Exeption Caught: "+e);
            System.exit(1);

        }
        catch(Exception e){
            System.out.println("Exeption Caught: "+e);
            std();
        }
    }

    public void dis()
    {
        System.out.print(this.name+" "+this.branch+" "+this.usn+" "+this.phno+" ");
    }

}

//interface
interface inter{
    public String must();
    default void def(){
        System.out.println("Default Method of Interface");
    }//default method
}

class Must implements inter{

    public String must() {
        return "Student Data: "; //method returning object(string as object)
    }
}

class Thed implements Runnable{
Thread t;
Thed(){
    t= new Thread(this,"Thread");
}
public synchronized void run(){

    try{
        
        System.out.println("Loading......");
        Thread.sleep(2000);
        for(int n=5;n>0;n--){
            Thread.sleep(1000);
            System.out.print(" "+n+" ");
        }
    }catch(Exception e){
        System.out.println("Caught Exception");
    }
    System.out.println();
}

}
