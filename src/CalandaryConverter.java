public class CalandaryConverter {
   private   static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESTDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;



    static String convertDayToString(int dayNumber){
        String day = "";
        switch(dayNumber){

            case MONDAY:
                 day = "Poniedziałek";
                 break;
            case TUESDAY:
                day = "Wtorek";
                break;
            case WEDNESTDAY:
                day = "Sroda";
                break;
            case THURSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piątek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;
        }
return day;
    }





}
