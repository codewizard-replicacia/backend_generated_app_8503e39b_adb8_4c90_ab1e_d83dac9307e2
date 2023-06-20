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

@Entity(name = "Vet_Visit_History")
@Table(name = "\"Vet_Visit_History\"", schema =  "\"generated_app\"")
@Data
                        
public class Vet_Visit_History {
	public Vet_Visit_History () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Vet_visit_history_id\"", nullable = true )
  private Integer vet_visit_history_id;
	  
  @Column(name = "\"Visit_date\"")
  @Temporal(value = TemporalType.DATE)
  private Date visit_date;  
  
	  
  @Column(name = "\"Petname\"", nullable = true )
  private String petname;
  
	  
  @Column(name = "\"Visit_reason\"", nullable = true )
  private String visit_reason;
  
	  
  @Column(name = "\"VeterinarianName\"", nullable = true )
  private String veterinarianName;
  
	  
  @Column(name = "\"Vet_notes\"", nullable = true )
  private String vet_notes;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Vet_Visit_History [" 
  + "Vet_visit_history_id= " + vet_visit_history_id  + ", " 
  + "Visit_date= " + visit_date  + ", " 
  + "Petname= " + petname  + ", " 
  + "Visit_reason= " + visit_reason  + ", " 
  + "VeterinarianName= " + veterinarianName  + ", " 
  + "Vet_notes= " + vet_notes 
 + "]";
	}
	
}