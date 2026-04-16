/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.entityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.time.Instant;
import vis.code.entites.User;





/**
 *
 * @author Gyana-VIS
 */
public class EntityManagerFactoryCreation {
    
    public static String _persistanceUnit="USERPU";
    public static   EntityManagerFactory _EntityManagerFactory ;
    
    static{
        
      _EntityManagerFactory = Persistence.createEntityManagerFactory(_persistanceUnit);
        
    }
    
    public static void insertuser(User user){
        EntityManager entityManager = _EntityManagerFactory.createEntityManager();
        
        EntityTransaction transaction = entityManager.getTransaction();
       
        try{
                 transaction.begin();
                 
                entityManager.persist(user);
               // transaction.commit();
                
            User find = entityManager.find(User.class, user.getId());
            Instant createdAt = find.getCreatedAt();
            System.out.println("created at user is:"+createdAt);
               // System.out.println("user saved Sucessfully");
                transaction.commit();
                }catch(Exception ex){
                    transaction.rollback();
                }finally{
            entityManager.close();
             }
        
        
    }
    
  

}
