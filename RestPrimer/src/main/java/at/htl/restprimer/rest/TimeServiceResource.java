package at.htl.restprimer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("time")
public class TimeServiceResource {
    @GET
    public String time(){
        return "Time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd. LLLL yyyy, hh:mm:ss"));
    }
}
