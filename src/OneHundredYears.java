import java.time.LocalDate;

public class OneHundredYears {
    private int[] dateArray = new int[3];
    public int[] timer(String birthday) {
        LocalDate localDate = LocalDate.now();
        int date = Integer.parseInt(birthday.substring(0, 2));
        int month = Integer.parseInt(birthday.substring(3, 5));
        int years = Integer.parseInt(birthday.substring(6, 10));
        int localYear = localDate.getYear();
        int localMonth = localDate.getMonthValue();
        int localDay = localDate.getDayOfMonth();
        int userOld = localYear - years;
        if (month > localMonth) --userOld;
        if (month == localMonth && (date - localDay) > 0) --userOld;

        if (localMonth >= month) {
            dateArray[0] = (100 - userOld);
            dateArray[1] = (localMonth - month);
            dateArray[2] = (Math.abs(localDay - date));
        } else {
            dateArray[0] = (100 - userOld);
            dateArray[1] = ((month - localMonth) + month - 1);
            dateArray[2] = (Math.abs(localDay - date));
        }
return dateArray;
    }


}
