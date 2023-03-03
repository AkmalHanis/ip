package duke;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import task.Todo;
import task.Event;
import task.Deadline;


public class Duke {

    private static ArrayList<Todo> taskList = new ArrayList<>();

    private static ArrayList<String> taskMark = new ArrayList<>();




    private static void printFileContents(String filePath) throws FileNotFoundException {
        File f = new File(filePath); // create a File for the given file path
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }
    private static int counter = 0;

    private static int repeat = 1;
    private static int todoNum = 0;
    private static int eventNum = 0;
    private static int deadlineNum = 0;


    private static void print_list() {
        for (int i = 0; i < taskList.size(); i += 1) {
            System.out.println((i + 1) + ". " + taskMark.get(i) + taskList.get(i));
        }
    }
    private static void printErrors(){
        System.out.println("Please include the task number you want to mark, unmark or delete!");
    }
    private static void printTaskNum(){
        System.out.println(taskList.size() - 1);
    }
    private static void printTodoNum(){
        System.out.println("You have successfully added a new task to do.");
        System.out.println("Total number of task: " + todoNum);
    }
    private static void printEventNo(){
        System.out.println("You have successfully added a new event.");
        System.out.println("Total number of events: " + eventNum);
    }
    private static void printDeadlineNo(){
        System.out.println("You have successfully added a new deadline.");
        System.out.println("Total number of deadlines: " + deadlineNum);
    }

    private static void printTaskError(){
        System.out.println("Please include the task to be added!");
    }
    private static void printAdded(){
        System.out.println("_____________________________________________________________________");
        System.out.println("I've added that task, event or deadline for you!");
        System.out.println("_____________________________________________________________________");
    }
    private static void printMarked(){
        System.out.println("_____________________________________________________________________");
        System.out.println("I've marked/unmarked that task, event or deadline for you!");
        System.out.println("_____________________________________________________________________");
    }

    private static void run_check(String userInput) {
        int task_num = 0;
        int event_num = 0;
        int deadline_num = 0;

        String[] inputs = userInput.split("\\s+", 2);
        String inputCommand = inputs[0];
        for (int i = 0; i < 101; i += 1){
            taskMark.add("[ ]");
        }


            if (inputCommand.equals("bye")) {
                repeat = 0;
                System.out.println("Bye. Hope to see you again soon!");
                System.out.println("____________________________________________________________");
                return;
            }
            else if (inputCommand.equals("list")) {
                System.out.println("Your saved task: ");
                print_list();

            }
            else if (inputCommand.equals("mark")){
                if (inputs.length < 2){
                    printErrors();
                }
                else if (Integer.parseInt(inputs[1]) > taskList.size()){
                    System.out.println("Unable to mark a non existing task");
                }
                else{
                    taskMark.add(Integer.parseInt(inputs[1]) - 1, "[X]");
                    printMarked();
                }

            }
            else if (inputCommand.equals("unmark")){
                if (inputs.length < 2){
                    printErrors();
                }
                else if (Integer.parseInt(inputs[1]) > taskList.size()){
                    System.out.println("Unable to unmark a non existing task");
                }
                else{
                    taskMark.add(Integer.parseInt(inputs[1]), "[ ]");
                    printMarked();
                }
            }
            else if (inputCommand.equals("delete")){
                if (inputs.length < 2){
                    printErrors();
                }
                else if (Integer.parseInt(inputs[1]) > taskList.size()){
                    System.out.println("Unable to delete a non existing task");
                }
                else{
                    taskList.remove(taskList.indexOf(Integer.parseInt(inputs[1])));

                    taskMark.remove(taskMark.indexOf(Integer.parseInt(inputs[1])));
                    printTaskNum();
                    System.out.println("Now you have " + taskList.size() + " numbers of tasks left");
                }
            }
            else if (inputCommand.equals("todo")){
                if (inputs.length < 2 ){
                    printTaskError();
                }
                else {
                    //process data
                    String todoTask = inputs[1];
                    Todo newTodo = new Todo(todoTask);
                    taskList.add(newTodo);
                    todoNum += 1;
                    printAdded();
                }
            }
            else if (inputCommand.equals("deadline")){
                if (inputs.length < 2){
                    printTaskError();
                }
                else{
                    String DeadlineDetails = inputs[1];
                    String[] details = DeadlineDetails.split("/by");
                    Todo newTodo = new Deadline(details[0].trim(), details[1].trim());
                    taskList.add(newTodo);
                    deadlineNum += 1;
                    printAdded();
                }
        }
            else if (inputCommand.equals("event")){
                if (inputs.length < 2){
                    printTaskError();
                }
                else{
                    String EventDetails = inputs[1];
                    String[] details = EventDetails.split("/from|/to");
                    Todo newTodo = new Event(details[0].trim(), details[1].trim(), details[2].trim());
                    taskList.add(newTodo);
                    eventNum += 1;
                    printAdded();
                }

            }
            else if (inputCommand.equals("find")){
                System.out.println("___________________________________________________________");
                System.out.println("Here are the matching tasks found in your list: ");
                String WordCheck = inputs[1];
                int foundCounter = 1;
                boolean foundMatch = false;
                for (int i = 0; i < taskList.size(); i += 1){
                    String TaskToCheck = taskList.get(i).toString();
                    String[] words = TaskToCheck.split(" ");
                    for (int j = 0; j < words.length; j += 1){
                        if (words[j].equals(WordCheck)){
                            foundMatch = true;
                            break;
                        }
                    }
                    if (foundMatch == true){
                        System.out.println((foundCounter) + ". " + taskMark.get(i) + taskList.get(i));
                        foundMatch = false;
                        foundCounter += 1;
                    }
                }
                System.out.println("___________________________________________________________");
            }

            else{
                System.out.println("I don't understand that command");
            }
        }


    public static void main(String[] args) {
        File f = new File("./data/chicken.txt");
        System.out.println("full path: " + f.getAbsolutePath());
        System.out.println("file exists?: " + f.exists());
        System.out.println("is Directory?: " + f.isDirectory());

        try {
            printFileContents("./data/chicken.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm duke.Duke");
        System.out.println("What can I do for you?");






        Scanner enter = new Scanner(System.in);

        String file2 = "./data/chicken.txt";
        FileWriter fw;

        while (repeat == 1){
            String echo = enter.nextLine();
            if (echo.equals("bye")){
                break;
            }
            run_check(echo);
        }


/*
        while (repeat == 1) {
            String echo = enter.nextLine();
            if (echo.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                System.out.println("____________________________________________________________");

                break;
            }

            if (echo.equals("list")) {
                System.out.println("Your saved task:");
                for (int i = 0; i < counter; i += 1) {
                    if (list[i].equals("")) {
                        break;
                    }
                    if (!list[i].equals("deleted")) {
                        System.out.println((indexes[i + 1] + ". " + s[i] + list2[i] + " " + list[i]));
                    } else {
                        for (int x = i; x <= counter; x += 1) {
                            if (x + 1 < counter || list[x + 1].equals("deleted")) {
                                break;
                            }
                            if (list[x + 1] != null) {
                                list[x] = list[x + 1]; // update the deleted list
                            }
                        }
                        for (int x = i; x < 101; x += 1) {
                            indexes[x] = x - 1;
                        }
                    }
                }
                System.out.println("____________________________________________________________");

            } else {
                update = echo;
                String[] parts = update.split(" ");

                if (parts[0].equals("delete") && parts.length > 1) {
                    list_counter = task_num + deadline_num + event_num;
                    System.out.println("Successfully deleted " + s[Integer.parseInt(parts[1]) - 1] + " " + list[Integer.parseInt(parts[1]) - 1]);
                    System.out.println("You have " + (list_counter - 1) + " number of items left in your list");
                    list[Integer.parseInt(parts[1]) - 1] = "deleted";

                }

                if (parts[0].equals("todo") && parts.length > 1) {

                    System.out.println("____________________________________________________________");
                    System.out.println("I've added this for you");

                    list[counter] = parts[1] + " " + parts[2];
                    s[counter] = "[T]";
                    counter += 1;
                    task_num += 1;
                    System.out.println("Added new task: " + parts[1] + " " + parts[2]);
                    System.out.println("you have" + " " + task_num + " tasks currently");

                } else if (parts[0].equals("deadline") && parts.length > 1) {
                    update_v2 = echo;
                    String[] particles = update_v2.split("/");
                    System.out.println("____________________________________________________________");
                    System.out.println("I've added this for you");
                    String[] paths = particles[0].split(" ");

                    list[counter] = paths[1] + " " + paths[2] + "(" + particles[1] + ")";
                    s[counter] = "[D]";
                    counter += 1;
                    deadline_num += 1;
                    System.out.println("Added new deadline: " + list[counter - 1]);
                    System.out.println("you have" + " " + deadline_num + " deadlines currently");

                }
                if (parts[0].equals("event") && parts.length > 1) {
                    update_v2 = echo;
                    String[] particles = update_v2.split("/");
                    System.out.println("____________________________________________________________");
                    System.out.println("I've added this for you");
                    String[] paths = particles[0].split(" ");

                    list[counter] = paths[1] + " " + paths[2] + "(" + particles[1] + particles[2] + ")";
                    s[counter] = "[E]";
                    counter += 1;
                    event_num += 1;

                    System.out.println("Added new event: " + list[counter - 1]);
                    System.out.println("you have" + " " + event_num + " events left");

                }


                if ((parts[0].equals("mark") || parts[0].equals("unmark")) && parts.length > 1) {
                    list_num = Integer.parseInt(parts[1]);
                    if (parts[0].equals("mark")) {
                        list2[list_num - 1] = "[X]";
                    }
                    if (parts[0].equals("unmark")) {
                        list2[list_num - 1] = "[ ]";
                    }
                } else {
                    if (parts.length == 1) {
                        if (parts[0].equals("mark")) {
                            System.out.println("please include the number you want to mark");
                        } else if (parts[0].equals("unmark")) {
                            System.out.println("please include the number you want to unmark");
                        } else if (parts[0].equals("todo")) {
                            System.out.println("please include the activity you want to do");
                        } else if (parts[0].equals("deadline")) {
                            System.out.println("please include the activity to add a deadline to");
                        } else if (parts[0].equals("event")) {
                            System.out.println("please include the event you want to add");
                        } else {
                            System.out.println("I don't know what that means");
                        }

                    }

                }
            }
        }
*/
        try {
            fw = new FileWriter("./data/chicken.txt");
            for (int i = 0; i < counter; i += 1) {
                // words = words + list[i];

                fw.write(taskList.get(i) + System.lineSeparator());;

            }
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }

}
