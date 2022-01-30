package Lista10;

public class Welder extends Person {
    String jobSeniority;

    public Welder(String jobSeniority, String name){
        super(name);
        this.jobSeniority = jobSeniority;
    }

    @Override
    public String getString(){
        return super.getString() + " " + jobSeniority;
    }
}
