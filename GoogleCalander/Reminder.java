package GoogleCalander;

public class Reminder {
    private String reminderId;
    private Duration timeBefore;
    private Event event;

    public Reminder(String reminderId, Duration timeBefore, Event event) {
        this.reminderId = reminderId;
        this.timeBefore = timeBefore;
        this.event = event;
    }

    public void triggerReminder() {
        System.out.println("Reminder: Event " + event.getTitle() + " is starting soon!");
    }
}
