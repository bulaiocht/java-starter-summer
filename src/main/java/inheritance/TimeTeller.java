package inheritance;

import java.time.LocalDateTime;

public class TimeTeller {

    private LocalDateTime time;

    public TimeTeller(){
        this.time = LocalDateTime.now();
    }

    public String tellMyTime(){
        return time.toString();
    }

}
