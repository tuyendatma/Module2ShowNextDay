public class ShowNextDay {
    public static final int LAST_DAY_OF_MONTH30 =30;
    public static final int LAST_DAY_OF_MONTH31 =31;
    public static final int FIRST_DAY_OF_MONTH =1;
    public static String showNextDay(int day, int month, int year){
        String data ="";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if(day==LAST_DAY_OF_MONTH31){
                    data ="day"+FIRST_DAY_OF_MONTH+",month"+(month+1)+",year"+year;
                }
                else {
                    data ="day"+(day+1)+",month"+month+",year"+year;
                }
                break;
            case 2:
                if(isLeapYear(year)){
                    if(day==29){
                        data ="day"+FIRST_DAY_OF_MONTH+",month"+(month+1)+",year"+year;
                    }else {
                        data ="day"+(day+1)+",month"+month+",year"+year;
                    }
                    break;
                }else {
                    if(day==28){
                        data ="day"+FIRST_DAY_OF_MONTH+",month"+(month+1)+",year"+year;
                    }else {
                        data ="day"+(day+1)+",month"+month+",year"+year;
                    }
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if(day==LAST_DAY_OF_MONTH30){
                    data ="day"+FIRST_DAY_OF_MONTH+",month"+(month+1)+",year"+year;
                }else {
                    data ="day"+(day+1)+",month"+month+",year"+year;
                }
                break;
            case 12:
                if(day==LAST_DAY_OF_MONTH31){
                    data ="day"+FIRST_DAY_OF_MONTH+",month"+(month+1)+",year"+year;
                }
                else {
                    data ="day"+(day+1)+",month"+month+",year"+(year+1);
                }
                break;
        }
        return data;
    }
    public static boolean isLeapYear(int year){
        boolean check = false;
        if (year%100==0 && year%400==0){
            check= true;
        }else if(year%4==0){
            check = true;
        }else {
            check =false;
        }
        return check;
    }
}
