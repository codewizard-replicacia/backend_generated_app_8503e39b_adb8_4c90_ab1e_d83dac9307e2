package com.mycompany.group234.function;

import com.mycompany.group234.model.Reminder;
import com.mycompany.group234.model.Pet_Info;
import com.mycompany.group234.model.Vet_Visit_History;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.ReminderRepository;
import com.mycompany.group234.repository.Vet_Visit_HistoryRepository;
import com.mycompany.group234.repository.Pet_InfoRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
