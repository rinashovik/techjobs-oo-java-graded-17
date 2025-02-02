package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;


public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
   // private String employer;
    private Location location;

    //private String location;

    private PositionType positionType;
   //private String positionType;

    private CoreCompetency coreCompetency;
    //private String coreCompetency;


    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        //  Job(String name, String employer, String location, String positionType, String coreCompetency){

        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    public int getId() {

        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


   @Override
   public String toString() {

       //String newLine = System.lineSeparator();//// Doesn't work
         String newLine = "\n";

       if ((getName().isEmpty()) && (getEmployer().getValue().isEmpty()) && (getLocation().getValue().isEmpty()) && (getPositionType().getValue().isEmpty()) && (getCoreCompetency().getValue().isEmpty()))

           {
           return  "OOPS! This job does not seem to exist.";
       }
        if (getName().isEmpty())
        {
            setName("Data not available");
        }
        if (getEmployer().getValue().isEmpty())

            {
            getEmployer().setValue("Data not available");
        }
       if (getLocation().getValue().isEmpty())

            {
            getLocation().setValue("Data not available");

            }
        if (getPositionType().getValue().isEmpty())

            {
            getPositionType().setValue("Data not available");

            }
        if (getCoreCompetency().getValue().isEmpty())

            {
            getCoreCompetency().setValue("Data not available");

            }

       return newLine +
               "ID: " + id + newLine +
               "Name: " + name + newLine +
               "Employer: " + employer + newLine +
               "Location: " + location + newLine +
               "Position Type: " + positionType + newLine +
               "Core Competency: " + coreCompetency + newLine;


//        return lineSeparator +
//                       "ID: " + id + lineSeparator +
//                       "Name: " + name + lineSeparator +
//                       "Employer: " + employer + lineSeparator +
//                       "Location: " + location + lineSeparator +
//                       "Position Type: " + positionType + lineSeparator +
//                       "Core Competency: " + coreCompetency + lineSeparator;


    }

}
