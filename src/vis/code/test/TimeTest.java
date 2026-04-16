/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.test;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import vis.code.entites.User;
import vis.code.entityManager.EntityManagerFactoryCreation;
import vis.code.time.UtcFormat;

/**
 *
 * @author Gyana-VIS
 */
public class TimeTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            
           try{
               
        System.out.println("Enter Time (dd-MM-yyyy HH:mm:ss):OR type Exit to stop");
        String time = sc.nextLine();
        
         if (time.equalsIgnoreCase("Exit")){
            System.out.println("Thank You for using this System");
            break;
         }
       
            System.out.println("Enter Timezone (e.g. Asia/Kolkata):");
            String timezone = sc.nextLine();
        
            System.out.println("Enter user name");
            String name = sc.nextLine();
            System.out.println("Enter user adress");
            String adress = sc.nextLine();
                
            // Date date = UtcFormat.GenerateUTCTime(time, timezone);
            Instant GenerateUTCTime = UtcFormat.GenerateUTCTime(time, timezone);
            
            User user = new User();
            user.setUname(name);
            user.setAdress(adress);
            user.setCreatedAt(GenerateUTCTime);
            //user.setCreatedAt(new Date());
            
            
            
            EntityManagerFactoryCreation.insertuser(user);
            
          }catch(Exception ex){
              System.out.println(ex.getLocalizedMessage());
              continue;
              
          } // while loop close
            
           // System.out.println(date);
        }
        
        sc.close();
    }
    
}
