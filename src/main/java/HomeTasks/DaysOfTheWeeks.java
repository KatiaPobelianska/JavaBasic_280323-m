package HomeTasks;

public class DaysOfTheWeeks {
    public static void main(String[] args) {
        String [] daysOfWeek = new String[7];

        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        String lastDayOfWeek = daysOfWeek[6];
        System.out.println("Last day of the week is: " + lastDayOfWeek);

//        2. for
//        String[] daysOfWeek = {"MO","TU","WE","TH","FR","SA","SU"};
//
//        String lastDayOfWeek = null;
//        for (int i = 0; i < daysOfWeek.length; i++) {
//            if (i == daysOfWeek.length - 1){
//                lastDayOfWeek = daysOfWeek[i];
//                break;
//            }
//        }
//        System.out.println("Last day of week: " + lastDayOfWeek);
    }
}
