package GoogleCalander;

import java.time.LocalDateTime;
import javax.swing.event.DocumentEvent;

public class Event {
    private String eventId;
    private String title;
    private String location;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<User> attendees;
    private EventType eventType;

    public Event(String eventId, String title, String location, LocalDateTime starTime, LocalDateTime endTime, String desciption, EventType eventType) {
        this.eventId = eventId;
        this.title = title;
        this.location = location;
        this.description = desciption;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventType = eventType;
        this.attendees = new ArrayList<>();
    }

    public void addUser(User user) {
        attendees.add(user);
    }

    public List<User> getAttendees() {
        return attendees;
    }

    public EventType getEventType(EventType eventType) {
        return eventType;
    }
}
