import java.util.Scanner;
public class Duke {

    public static void main(String[] args) {
        System.out.println("____________________________________________________________");
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");

        String[] list;
        list = new String[101];

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
            if (echo.equals("list")){
                System.out.println("Your saved task:");
                for (int i = 0; i < counter; i += 1) {
                    if (list[i].equals("")){
                        break;
                    }
                        System.out.println((i + 1) + ". " + list[i]);
                    }
                System.out.println("____________________________________________________________");

            }
            else {
                list[counter] = echo;
                counter += 1;
            }
        }
    }
}
