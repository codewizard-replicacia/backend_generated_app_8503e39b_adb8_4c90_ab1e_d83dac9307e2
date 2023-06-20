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

@Entity(name = "Reminder")
@Table(name = "\"Reminder\"", schema =  "\"generated_app\"")
@Data
                        
public class Reminder {
	public Reminder () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Reminder_id\"", nullable = true )
  private Integer reminder_id;
	  
  @Column(name = "\"Reminder_date\"")
  @Temporal(value = TemporalType.DATE)
  private Date reminder_date;  
  
	  
  @Column(name = "\"Notified\"", nullable = true )
  private Boolean notified;
  
	  
  @Column(name = "\"Petname\"", nullable = true )
  private String petname;
  
	  
  @Column(name = "\"Species\"", nullable = true )
  private String species;
  
	  
  @Column(name = "\"Notes\"", nullable = true )
  private String notes;
  
	  
  @Column(name = "\"Contact_number\"", nullable = true )
  private String contact_number;
  
	  
  @Column(name = "\"Owner_name\"", nullable = true )
  private String owner_name;
  
	  
  @Column(name = "\"Sms\"", nullable = true )
  private String sms;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Reminder [" 
  + "Reminder_id= " + reminder_id  + ", " 
  + "Reminder_date= " + reminder_date  + ", " 
  + "Notified= " + notified  + ", " 
  + "Petname= " + petname  + ", " 
  + "Species= " + species  + ", " 
  + "Notes= " + notes  + ", " 
  + "Contact_number= " + contact_number  + ", " 
  + "Owner_name= " + owner_name  + ", " 
  + "Sms= " + sms 
 + "]";
	}
	
}