package JavaProject;


public class Report extends student_data{  
    
    int sem;
    protected double cgpa;
    String verdict;

    public Report(){
        super();
        System.out.print("Enter SEM: ");
        try{
            sem=sc.nextInt();  //nextInt()
            if(sem<=0||sem>8)
            {
                throw new Exception("Sem cannot be greater than 8");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Exception Caught: "+e);
            System.exit(1);

        }
        catch(Exception e){
            System.out.println("Exception Caught: "+e);
            etcg();
        }

        System.out.print("Enter CGPA: ");
        try{
            cgpa=sc.nextDouble();
            if(cgpa>10||cgpa<0)
            {
                throw new Exception("CGPA Can't be greater than 10 or less than 0");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Exception Caught: "+e);
            System.exit(1);
        }
        catch(Exception e){
            System.out.println("Exception Caught: "+e);
            etcg();
        }

        if(cgpa<5){
            verdict="Fail";
            char ar[]= new char[verdict.length()];
            ar=verdict.toCharArray();

            for(int i=0;i<verdict.length();i++)
            System.out.print(ar[i]+" ");
        }
        else{
            verdict="Pass";
            char ar[]= new char[verdict.length()];  //1).length() function
            ar=verdict.toCharArray();  //2).toCharArray() function ...//two string functions

            for(int i=0;i<verdict.length();i++)
            System.out.print(ar[i]+" ");
        }
    }

    void etcg()
    {
        System.out.print("Enter Sem: ");
        try{
            sem=sc.nextInt();
            if(sem<0||sem>8)
            {
                throw new Exception("Sem cannot be greater than 8 or less than 1");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Exception Caught: "+e);
            System.exit(1);
        }
        catch(Exception e){
            System.out.println("Exception Caught: "+e);
            etcg();
        }

        System.out.print("Enter CGPA: ");
        try{
            cgpa=sc.nextDouble();
            if(cgpa>10||cgpa<0)
            {
                throw new Exception("CGPA Can't be greater than 10 or less than 0");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Exception Caught: "+e);
            System.exit(1);
        }
        catch(Exception e){
            System.out.println("Exception Caught: "+e);
            etcg(); // To retake inputs
        }


    }

    public void dis(float percentage) //overridden method
    {
        super.dis();
        System.out.println(this.sem+"th Sem "+this.cgpa);
        
    }    
}
