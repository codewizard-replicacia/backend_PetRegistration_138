package com.apps.petreg.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.petreg.model.Visit;
import com.apps.petreg.model.Pet;
import com.apps.petreg.model.PetOwner;
import com.apps.petreg.model.VisitScheduler;
import com.apps.petreg.model.Veterian;
import com.apps.petreg.model.Appointment;
import com.apps.petreg.model.VaccineScheduler;
import com.apps.petreg.model.Image;

@Entity(name = "VisitSchedulerVisitSchedular")
@Table(schema = "\"petreg\"", name = "\"VisitSchedulerVisitSchedular\"")
@Data
public class VisitSchedulerVisitSchedular{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ScheduleVisit_id\"")
	private Integer scheduleVisit_id;

    
    @Column(name = "\"Vet_id\"")
    private Integer vet_id;
 
}