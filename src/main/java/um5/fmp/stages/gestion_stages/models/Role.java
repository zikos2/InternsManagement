package um5.fmp.stages.gestion_stages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    
    
	public Role(String nom) {
		super();
		this.nom = nom;
	}
	
	public Role() {
	
	}
    
   
}
