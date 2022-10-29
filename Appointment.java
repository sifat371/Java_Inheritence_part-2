import java.time.LocalDate;

public class Appointment {
    private int day;
    private int month;
    private int year;

    public Appointment() {
        LocalDate date = LocalDate.now();
        this.day = date.getDayOfMonth();
        this.month = date.getMonthValue();
        this.year = date.getYear();
    }

    public boolean occurOn(int day, int month, int year) {
        if (this.day == day && this.month == month && this.year == year) {
            return true;
        }
        return false;
    }
}
