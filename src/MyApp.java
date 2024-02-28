import java.util.Scanner;
enum StateForMoon {
    NEW_MOON("Новолуние (0 %)"),
    WAXING_CRESCENT("Ростущий месяц (25 %)"),
    FIRST_QUARTER("Первая четверть ( 50 % )"),
    WAXING_GIBBOUS("Пред полнолуние (75%)"),
    FULL_MOON("Полнолуние (100 %)"),
    WANING_GIBBOUS("После полнолуния (75 %)"),
    LAST_QUARTER("Последняя четверть (50 %)"),
    WANING_CRESCENT("Нет луны (0 %)");
    private final String description;

    StateForMoon(String description) {
        this.description = description;
    }

    public String get() {
        return description;
    }
}

public class MyApp {
    public static void main(String[] args) {
for (StateForMoon f : StateForMoon.values()) {
    System.out.println(f.get());
}




    }
}

