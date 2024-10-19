package GoogleCalander;

public class RecurringEvent extends Event {
    private Period recurrencePeriod;  // e.g., every day, week, month

    public RecurringEvent(String eventId, String title, String description,
                          String location, LocalDateTime startTime, 
                          LocalDateTime endTime, Calendar calendar, 
                          Period recurrencePeriod) {
        super(eventId, title, description, location, startTime, endTime, calendar);
        this.recurrencePeriod = recurrencePeriod;
    }

    // Generate the next occurrence of the event
    public LocalDateTime getNextOccurrence(LocalDateTime current) {
        return current.plus(recurrencePeriod);
    }
}