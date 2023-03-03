package task;

public class Deadline extends Todo {
    public String TimeLine;
    public String DeadlineToDo;

    public static int NoOfDeadline;

    public Deadline(String DeadlineToDo, String TimeLine){
        super(DeadlineToDo);
        NoOfDeadline += 1;
        this.TimeLine = TimeLine;
    }
    public String toString(){
        String updateString = super.toString().replaceFirst("T","D");
        return   updateString + " (By: " + TimeLine + ")";
    }


}
