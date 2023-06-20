package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.Reminder;
import com.mycompany.group234.model.Pet_Info;
import com.mycompany.group234.model.Vet_Visit_History;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Pet_Info")
@Table(name = "\"Pet_Info\"", schema =  "\"generated_app\"")
@Data
                        
public class Pet_Info {
	public Pet_Info () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Pet_info_id\"", nullable = true )
  private Integer pet_info_id;
	  
  @Column(name = "\"Petname\"", nullable = true )
  private String petname;
  
	  
  @Column(name = "\"Species\"", nullable = true )
  private String species;
  
	  
  @Column(name = "\"Photo_file\"", nullable = true )
  private String photo_file;
  
	  
  @Column(name = "\"Breed\"", nullable = true )
  private String breed;
  
	  
  @Column(name = "\"Age\"", nullable = true )
  private Integer age;
  
	  
  @Column(name = "\"Sex\"", nullable = true )
  private String sex;
  
	  
  @Column(name = "\"Spayed_or_neutered\"", nullable = true )
  private String spayed_or_neutered;
  
	  
  @Column(name = "\"Owner_name\"", nullable = true )
  private String owner_name;
  
	  
  @Column(name = "\"Phone_number\"", nullable = true )
  private String phone_number;
  
	  
  @Column(name = "\"Email\"", nullable = true )
  private String email;
  
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
  
  
  
		@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"Pet_InfoPet_info_reminder\"", referencedColumnName = "\"Reminder_id\"", insertable = false, updatable = false)
	private Reminder pet_info_reminder;
	
	@Column(name = "\"Pet_InfoPet_info_reminder\"")
	private Integer pet_InfoPet_info_reminder;
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"Pet_InfoPet_vet_visit_history\"",
            joinColumns = @JoinColumn( name="\"Pet_info_id\""),
            inverseJoinColumns = @JoinColumn( name="\"Vet_visit_history_id\""), schema = "\"generated_app\"")
private List<Vet_Visit_History> pet_vet_visit_history = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Pet_Info [" 
  + "Pet_info_id= " + pet_info_id  + ", " 
  + "Petname= " + petname  + ", " 
  + "Species= " + species  + ", " 
  + "Photo_file= " + photo_file  + ", " 
  + "Breed= " + breed  + ", " 
  + "Age= " + age  + ", " 
  + "Sex= " + sex  + ", " 
  + "Spayed_or_neutered= " + spayed_or_neutered  + ", " 
  + "Owner_name= " + owner_name  + ", " 
  + "Phone_number= " + phone_number  + ", " 
  + "Email= " + email  + ", " 
  + "Address= " + address 
 + "]";
	}
	
}