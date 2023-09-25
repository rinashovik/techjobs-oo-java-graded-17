package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
   // private Employer employer;
    private String employer;
   // private Location location;

    private String location;

    //private PositionType positionType;
    private String positionType;

    //private CoreCompetency coreCompetency;
    private String coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    Job(){
        id = nextId;
        nextId++;
    }

   // Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        Job(String name, String employer, String location, String positionType, String coreCompetency){

            this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(String coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    public PositionType getPositionType() {
//        return positionType;
//    }
//
//    public CoreCompetency getCoreCompetency() {
//        return coreCompetency;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
//
//    public void setPositionType(PositionType positionType) {
//        this.positionType = positionType;
//    }
//
//    public void setCoreCompetency(CoreCompetency coreCompetency) {
//        this.coreCompetency = coreCompetency;
//    }


   @Override
   public String toString() {

       String newLine = System.lineSeparator();//// Doesn't work

      // if ((getName().isEmpty()) && (getEmployer().getValue().isEmpty()) && (getLocation().getValue().isEmpty()) && (positionType.getValue().isEmpty()) && (coreCompetency.getValue().isEmpty()))
           if ((getName().isEmpty()) && (getEmployer().isEmpty()) && (getLocation().isEmpty()) && (getPositionType().isEmpty()) && (getCoreCompetency().isEmpty()))


           {
           return  "OOPS! This job does not seem to exist.";
       }
        if (getName().isEmpty())
        {
            setName("Data not available");
        }
        //if (getEmployer().getValue().isEmpty())
            if (getEmployer().isEmpty())

            {
            setEmployer("Data not available");
        }
       // if (getLocation().getValue().isEmpty())
            if (getLocation().isEmpty())

            {
           // location.setValue("Data not available");
                setLocation("Data not available");

            }
        //if (positionType.getValue().isEmpty())
            if (getPositionType().isEmpty())

            {
            //positionType.setValue("Data not available");
                setPositionType("Data not available");

            }
       // if (coreCompetency.getValue().isEmpty())
            if (getCoreCompetency().isEmpty())

            {
            //coreCompetency.setValue("Data not available");
                setCoreCompetency("Data not available");

            }

        return "\n" +
                " ID: " + id + newLine +
                " Name: " + name + newLine +
                " Employer: " + employer + newLine +
                " Location: " + location + newLine +
                " Position Type: " + positionType + newLine +
                " Core Competency: " + coreCompetency +
                "\n" ;

//       return String.format("\nID: %d\n" +
//               "Name: %s\n" +
//               "Employer: %s\n" +
//               "Location: %s\n" +
//               "Position Type: %s\n" +
//               "Core Competency: %s\n",id, name, employer,location, positionType,coreCompetency);

    }

}
