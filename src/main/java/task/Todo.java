package task;


/** Todo is a class that holds the information of the task that user has inputted to
 * be done.
 * The String ThingToDo is to contain the specific task denoted by the user.
 * The class contains the method Todo which allows us to add the specific
 * Task into the new Todo.
 * The class contains the method toString which strings the task together
 * with the specific details that is attributed to its marking as a task
 *
 */
public class Todo {
    String ThingToDo;
    public static int taskNum;

    public Todo(String ThingToDo){
        this.ThingToDo = ThingToDo;
        taskNum += 1;
    }

    public String toString(){
        return "[T] " + ThingToDo;
    }

}
