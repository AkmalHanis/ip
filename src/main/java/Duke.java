import java.util.Scanner;
public class Duke {

    public static void main(String[] args) {
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");

        String[] list;
        String[] list2;
        String update;
        int list_num;

        list = new String[101];

        list2 = new String[101];
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
                    System.out.println((i + 1) + ". " + list2[i] + " " + list[i]);
                }
                System.out.println("____________________________________________________________");

            }

            else {
                update = echo;
                String[] parts = update.split(" ");
                if (parts[0].equals("mark") || parts[0].equals("unmark")){
                    list_num = Integer.parseInt(parts[1]);
                    if (parts[0].equals("mark")) {
                        list2[list_num - 1] = "[X]";
                    }
                    if (parts[0].equals("unmark")) {
                        list2[list_num - 1] = "[ ]";
                    }
                }
                else {
                    list[counter] = echo;
                    counter += 1;
                   System.out.println("Added: " + echo);
                }
            }
        }
    }
}
