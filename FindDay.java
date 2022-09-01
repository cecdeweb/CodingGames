public class FindDay {
    /*
     * Complete the 'findDaytoDate' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDaytoDate(int month, int day, int year) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        Calendar c = new GregorianCalendar();
        c.set(year, month-1, day);
        String formatDay = dateFormat.format(c.getTime());
        return formatDay.toUpperCase();

    }

}
