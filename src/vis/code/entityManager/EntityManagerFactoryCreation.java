/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.entityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
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
                transaction.commit();
                System.out.println("user saved Sucessfully");
                
                }catch(Exception ex){
                    transaction.rollback();
                }finally{
            entityManager.close();
             }
        
        
    }
    
  

}
