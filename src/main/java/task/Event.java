package task;

/** Event is a class that holds the information of the event that user has inputted to
 * be done.
 * The String EventToDo, EventFrom and EventTo is to contain the specific
 * tasks denoted by the user as well as the duration of the task held by
 * EventFrom and EventTo. The class contains the method Event which allows us to
 * add the specific Task into the new Event through inheritance. The class contains
 * the method toString which strings the Event together with the specific details
 * of the task that is attributed to its marking as an Event
 *
 */
public class Event extends Todo {
        public String EventToDo;
        public String EventFrom;
        public String EventTo;
        public static int NoOfEvents;

        public Event(String EventToDo, String EventFrom, String EventTo){
            super(EventToDo);
            this.EventFrom = EventFrom;
            NoOfEvents += 1;
            this.EventTo = EventTo;
        }
        public String toString(){
            String updateString = super.toString().replaceFirst("T","E");
            return updateString + " (From: " + EventFrom + " to: " + EventTo + ")";
        }


    }





