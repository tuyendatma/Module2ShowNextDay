import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowNextDayTest {
    @Test
    void checkIsLeapYear(){
        int number = 2000;
        boolean expected =true;
        boolean result = ShowNextDay.isLeapYear(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("check day leap year")
    void checkShowNextDay(){
        int first =29;
        int second=2;
        int thirst=2000;
        String expected ="day"+1+",month"+3+",year"+2000;
        String result=ShowNextDay.showNextDay(first,second,thirst);
        assertEquals(expected,result);
                //"day"+FIRST_DAY_OF_MONTH+",month"+(month+1)+",year"+year

    }

}