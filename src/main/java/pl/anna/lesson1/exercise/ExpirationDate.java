package pl.anna.lesson1.exercise;

public class ExpirationDate {
    private String date;

    public ExpirationDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ExpirationDate{" +
                "date='" + date + '\'' +
                '}';
    }
}
