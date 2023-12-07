import java.time.*;

public class Time {
    public static void main(String[] args) {
        LocalDate ld =LocalDate.of(2023,11,30);
        System.out.println(ld);

        LocalTime lt =LocalTime.of(14,41);
        System.out.println(lt);
        LocalDateTime  ldt = LocalDateTime.of(ld,lt);
        System.out.println(ldt);


      ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Europe/Madrid"));
        System.out.println(zdt);
    }
}
