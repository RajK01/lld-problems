package GoogleCalander;

public class Calendar {
    private String calendarId;
    private String name;
    private List<Event>events;
    private User owner;

    public Calendar(String calendarId, String name, User owner) {
        this.calendarId = calendarId;
        this.name = name;
        this.owner = owner;
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getEvent() {
        return events;
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }
}