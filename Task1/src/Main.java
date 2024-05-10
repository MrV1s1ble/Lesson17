import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine merlot = new Wine("Merlot", "Boocco", "France", "10.01.2018", "Top 5 in world.");
        System.out.println(merlot);
        merlot.wineAging("10.10.2050");

        Wine cabernet = new Wine("Cabernet", "19.03.1994");
        System.out.println(cabernet);
        cabernet.wineAging("10.10.2050");
    }
}