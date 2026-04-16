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
    
      // it is Specify or Tell to the java my Date is Custom Format
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      
        // LocalDateTime convert Normal string to LcalDateTime Object
        LocalDateTime localtime = LocalDateTime.parse(time,formatter);
        
        String trimtimezone = timezone.trim();
        
        //  Take String Timezone and Convert it into ZoneId Object  
        ZoneId timezoneid = ZoneId.of(trimtimezone);
        
        // Take zoneid Object and add with localtime object Then  Convert it into ZoneDateTime object (e.g 2026-04-16T19:30+05:30[Asia/Kolkata])
        ZonedDateTime userZone=localtime.atZone(timezoneid);
        System.out.println("userzone:"+ userZone);
        
        // Take ZoneTime convert Timezone to Utc Time(withZoneSameInstant keeping same Momement but Time change According to TimeZone )
        ZonedDateTime utcZoned = userZone.withZoneSameInstant(ZoneId.of("UTC"));
       System.out.println("utczoned:"+utcZoned);
        
       // Here remove Timezone keep only The Exact moment in UTC (No TimeZone like Asia/Kolkata)
       // Instant Represent Only UTC time (e.g 2026-04-16T14:00Z)
       // instant = Pure UTC time no Timezone Information (e.g 2026-04-16T14:00Z)
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
