package JavaProject;
// import LabSuggestedpgms.sug3;

class cusEx extends Exception{
    
    cusEx(){
    super("cusEx");
    }
}

public class percent extends Report{
    float percentage;
    percent(){
        super(); //super to constructor
        percentage=(float) ((95*cgpa)/10);
    }

    public void dis(){ //overridden method;
        super.dis(percentage);  // super to method
        System.out.println("Percentage: "+percentage);
        
        try{
            throw new cusEx();
        }catch(cusEx e){
            System.out.println("To show custom Exception: "+e);
        }
    }
    
}
