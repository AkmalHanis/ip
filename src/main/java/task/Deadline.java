package task;

/** Deadline is a class that holds the information of the deadline that user has inputted to
 * be done.
 * The String DeadlineToDoa and Timeline is to contain the specific
 * tasks denoted by the user as well as the due date of the task held by.
 * The class contains the method Deadline which allows us to add the specific Task
 * into the new Event through inheritance. The class also contains
 * the method toString which strings the Deadline together with the specific details
 * of the task that is attributed to its marking as a Deadline
 *
 */
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
