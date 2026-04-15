/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.time;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Gyana-VIS
 */
public class UtcFormat {
    
    public static Instant GenerateUTCTime(String time , String timezone){
        
        String replacetime = time.trim().replace(" ", "T");
      //  String replacetime = time.replace(" ", "T");
        
        LocalDateTime localtime = LocalDateTime.parse(replacetime);
        
        String trimtimezone = timezone.trim();
        
        ZonedDateTime userZone=localtime.atZone(ZoneId.of(trimtimezone));
        
        // convert  Timezone to Utc Time
        ZonedDateTime utcZoned = userZone.withZoneSameInstant(ZoneId.of("UTC"));
     //   System.out.println("utczoned:"+utcZoned);
        
        Instant instant = utcZoned.toInstant();
                
       // Date utcDate = Date.from(Instant);
        
//        //  converting Date to String And String to Date
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        // create TimeZone object
//        TimeZone timeZone = TimeZone.getTimeZone("UTC");
//        sdf.setTimeZone(timeZone);
//        String formatedUtcDate = sdf.format(utcDate);
//        
//        //System.out.println("IST TIME IS:"+ utcDate);
//        System.out.println("UTC TIME IS:" + formatedUtcDate);
        
        return instant;
       // return utcDate;
    }
    
//    public static LocalDateTime parese(String time){
//        DateTimeFormatter formatter 
//        
//        return  null;
//    }
    
}
