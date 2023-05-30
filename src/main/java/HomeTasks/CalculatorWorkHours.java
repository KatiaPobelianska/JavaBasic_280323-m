package HomeTasks;

public class CalculatorWorkHours {
    public static void main(String[] args) {
        int time = (int)(Math.random()*28800), hours;
        double trace, tm = (double)time, del = 3600;
        trace = (double)(tm/del);
        if(time < 3600) {
            System.out.println(time+"\n"+trace+"\n"+"Do kontsa rabochego dnya ostalos menee chasa");
        } else {
            hours = (int)(time/3600);
            System.out.println(time+"\n"+trace+"\n"+"Do kontsa rabochego dnya ostalos "+hours+" chasov");
        }
    }
}
