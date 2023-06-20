package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Reminder;
import com.mycompany.group234.model.Pet_Info;
import com.mycompany.group234.model.Vet_Visit_History;

@Entity(name = "Pet_InfoPet_vet_visit_history")
@Table(schema = "\"generated_app\"", name = "\"Pet_InfoPet_vet_visit_history\"")
@Data
public class Pet_InfoPet_vet_visit_history{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_info_id\"")
	private Integer pet_info_id;

    
    @Column(name = "\"Vet_visit_history_id\"")
    private Integer vet_visit_history_id;
 
}