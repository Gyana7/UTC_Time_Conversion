/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vis.code.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.Instant;

import jdk.jfr.Timestamp;


/**
 *
 * @author Gyana-VIS
 */
@Entity
public class User  {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "Uname")
    private String Uname;
    
    @Column(name="Adress")
    private String Adress;
    
    @Column(name = "createdAt",columnDefinition = "TIMESTAMP")
   // @Temporal(TemporalType.TIMESTAMP)
    private Instant createdAt;
    
    
//     @PrePersist
//    public void onCreate() {
//        this.createdAt = Instant.now();
//    }
    
    // Constructor
    
      public User() {
    }
      
      

    public String getUname() {
        return Uname;
    }

    public void setUname(String Uname) {
        this.Uname = Uname;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
   

  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", Uname=" + Uname + ", Adress=" + Adress + ", createdAt=" + createdAt + '}';
    }

   
    

   
    
}
