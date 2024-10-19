package GoogleCalander;

public class User {
    private String userId;
    private String name;
    private String email;
    private List<Calendar> calendars;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.calendars = new ArrayList<>();
    }

    public void addCalendar(Calendar calendar) {
        calendars.add(calendar);
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }
}