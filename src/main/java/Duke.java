import java.util.Scanner;
public class Duke {

    public static void main(String[] args) {
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");

        String[] list;
        String[] list2;
        String[] s;
        String update;
        String update_v2;
        int list_num;
        int task_num = 0;
        int event_num = 0;
        int deadline_num = 0;

        list = new String[101];

        list2 = new String[101];

        s = new String[101];
        for (int i = 0; i < 101; i += 1){
            list2[i] = "[ ]";
        }

        int repeat = 1;
        Scanner enter = new Scanner(System.in);
        int counter = 0;
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
                    System.out.println((i + 1) + ". " + s[i] + list2[i] + " " + list[i]);
                }
                System.out.println("____________________________________________________________");

            }

            else {
                update = echo;
                String[] parts = update.split(" ");

                if (parts[0].equals("todo") && parts.length > 1){

                    System.out.println("____________________________________________________________");
                    System.out.println("I've added this for you");

                    list[counter] = echo;
                    s[counter] = "[T]";
                    counter += 1;
                    task_num += 1;
                    System.out.println("Added new task: " + echo);
                    System.out.println("you have" + " " + task_num + " tasks currently");

                }
                else if (parts[0].equals("deadline") && parts.length > 1){
                    update_v2 = echo;
                    String[] particles = update_v2.split("/");
                    System.out.println("____________________________________________________________");
                    System.out.println("I've added this for you");
                    String[] paths = particles[0].split(" ");

                    list[counter] = paths[1] + " " + paths[2] + " by: " + "(" + particles[1] + ")" ;
                    s[counter] = "[D]";
                    counter += 1;
                    deadline_num += 1;
                    System.out.println("Added new deadline: " + list[counter - 1]);
                    System.out.println("you have" + " " + deadline_num + " deadlines currently");

                }
                if (parts[0].equals("event") && parts.length > 1){
                    update_v2 = echo;
                    String[] particles = update_v2.split("/");
                    System.out.println("____________________________________________________________");
                    System.out.println("I've added this for you");
                    String[] paths = particles[0].split(" ");

                    list[counter] = paths[1] + " " + paths[2] + " (from: " + particles[1] + " to "+ particles[2] + ")";
                    s[counter] = "[E]";
                    counter += 1;
                    deadline_num += 1;

                    System.out.println("Added new event: " + list[counter - 1]);
                    System.out.println("you have" + " " + deadline_num + " events left");

                }


                if ((parts[0].equals("mark") || parts[0].equals("unmark")) && parts.length > 1){
                    list_num = Integer.parseInt(parts[1]);
                    if (parts[0].equals("mark")) {
                        list2[list_num - 1] = "[X]";
                    }
                    if (parts[0].equals("unmark")) {
                        list2[list_num - 1] = "[ ]";
                    }
                }
                else{
                    if (parts.length == 1){
                        if (parts[0].equals("mark")){
                            System.out.println("please include the number you want to mark");
                        }
                        else if (parts[0].equals("unmark")){
                            System.out.println("please include the number you want to unmark");
                        }
                        else if (parts[0].equals("todo")){
                            System.out.println("please include the activity you want to do");
                        }
                        else if (parts[0].equals("deadline")){
                            System.out.println("please include the activity to add a deadline to");
                        }
                        else if (parts[0].equals("event")){
                            System.out.println("please include the event you want to add");
                        }
                        else{
                            System.out.println("I don't know what that means");
                        }

                    }


                }
            }
        }
    }
}
