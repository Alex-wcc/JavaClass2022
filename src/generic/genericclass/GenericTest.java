package generic.genericclass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenericTest {
    public static void main(String[] args) {
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(2006, Calendar.DECEMBER, 9),
                new GregorianCalendar(2015, Calendar.DECEMBER, 10),
                new GregorianCalendar(2020, Calendar.DECEMBER, 3)};

        Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min ＝" + mm.getFirst().getTime());
        System.out.println("max ＝" + mm.getSecond().getTime());

        String[] words = {"able", "word", "excel", "course", "java ", "c＃"};
        Pair<String> mm2 = ArrayAlg.minmax(words);
        System.out.println("first word＝" + mm2.getFirst());
        System.out.println("last word ＝" + mm2.getSecond());
    }
}

