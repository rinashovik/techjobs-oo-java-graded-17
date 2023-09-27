package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;


public class Job {

    private int id;
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


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

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

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public static int getNextId() {
//        return nextId;
//    }
//
//    public static void setNextId(int nextId) {
//        Job.nextId = nextId;
//    }

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

       //String lineSeparator = lineSeparator();//// Doesn't work
         String lineSeparator = "\n";

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


        return lineSeparator +
                       "ID: " + id + lineSeparator +
                       "Name: " + name + lineSeparator +
                       "Employer: " + employer + lineSeparator +
                       "Location: " + location + lineSeparator +
                       "Position Type: " + positionType + lineSeparator +
                       "Core Competency: " + coreCompetency + lineSeparator;


    }

}
