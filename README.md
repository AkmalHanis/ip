# duke.Duke project template
## The User Guide


This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

### Setting up in Intellij

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
1. Open the project into Intellij as follows:
   1. Click `Open`.
   1. Select the project directory, and click `OK`.
   1. If there are any further prompts, accept the defaults.
1. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).<br>
   In the same dialog, set the **Project language level** field to the `SDK default` option.
3. After that, locate the `src/main/java/duke.Duke.java` file, right-click it, and choose `Run duke.Duke.main()` (if the code editor is showing compile errors, try restarting the IDE). If the setup is correct, you should see something like the below as the output:
   ```
   Hello from
    ____        _        
   |  _ \ _   _| | _____ 
   | | | | | | | |/ / _ \
   | |_| | |_| |   <  __/
   |____/ \__,_|_|\_\___|
   ```
   
   #### User commands
   1. Todo: Add a specific task that you want to do into your list. This task will be saved by duke.
   Example: todo Read Book 
   2. Deadline: Add a specific Deadline to a specific task you want to do.
   Example: deadline Read Book /by monday
   3. Event: Add a specific Event that you want to save. The timeline of the event is also saved.
   Example: event Read Book /from monday /to tuesday
   4. Mark/Unmark: Allows user to mark or unmark a specific task for tracking.
   Example: mark 1
   5. Delete: Allows user to delete a particular event from their list.
   Example: delete 1
   6. Find: Allows user to find a particular task based on keyword
   Example: find Read Book
   7. List: List out all the tasks already saved into the list
   Example: list 
   1. [X][ ] Read Book
   2. [ ][ ] Read magazine
   8. Bye: Ends the program.
