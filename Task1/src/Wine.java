import java.time.*;
import java.time.format.DateTimeFormatter;

public class Wine {
    private String wineName;
    private String tradeMark;
    private String country;
    private String spillDate;
    private String description;

    public Wine(String wineName, String tradeMark, String country, String spillDate, String description) {
        this.wineName = wineName;
        this.tradeMark = tradeMark;
        this.country = country;
        this.spillDate = spillDate;
        this.description = description;
    }

    public Wine(String wineName, String spillDate) {
        this.wineName = wineName;
        this.spillDate = spillDate;
    }

    public Wine() {
    }

    public void wineAging(String localDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(getSpillDate(), formatter);
        LocalDate endDate = LocalDate.parse(localDate, formatter);
        Period wineAging = Period.between(startDate, endDate);

        System.out.println("Выдержка вашего вина составляет (лет): " + wineAging.getYears() + ".");
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSpillDate() {
        return spillDate;
    }

    public void setSpillDate(String spillDate) {
        this.spillDate = spillDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Название: '" + wineName + '\'' +
                ", Марка: '" + tradeMark + '\'' +
                ", Страна производства: '" + country + '\'' +
                ", Дата розлива: '" + spillDate + '\'' +
                ", Описание: '" + description + '\'' +
                '.';
    }
}
