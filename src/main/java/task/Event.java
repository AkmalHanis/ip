package task;

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





