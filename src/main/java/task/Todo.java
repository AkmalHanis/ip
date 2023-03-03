package task;

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
