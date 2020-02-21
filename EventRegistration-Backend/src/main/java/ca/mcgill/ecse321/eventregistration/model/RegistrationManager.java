package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public class RegistrationManager{
   private Set<Person> persons;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Person> getPersons() {
      return this.persons;
   }
   
   public void setPersons(Set<Person> persons) {
      this.persons = persons;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
   
   private Set<Registration> registrations;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Registration> getRegistrations() {
      return this.registrations;
   }
   
   public void setRegistrations(Set<Registration> registrationss) {
      this.registrations = registrationss;
   }
   
   private Set<Event> events;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Event> getEvents() {
      return this.events;
   }
   
   public void setEvents(Set<Event> eventss) {
      this.events = eventss;
   }
   
   }
