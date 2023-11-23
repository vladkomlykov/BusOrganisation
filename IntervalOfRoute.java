public class IntervalOfRoute {

    private int interval;
    private int minute = 0;
    private int hours = 7;
    public String roteTime() {
        interval = (int) (Math.random() * (30 - 15) + 15);
        minute = minute + interval;
        if (minute >= 60) {
            hours = hours +1;
            minute = minute - 60;
        }
        return hours + ":" + minute;
    }
}
