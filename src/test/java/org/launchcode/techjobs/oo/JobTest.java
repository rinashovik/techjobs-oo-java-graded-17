package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

//    @BeforeTest
//    public void runCreatedjobBeforeTesting() {
//
//    Job testJob1 = new Job();
//    Job testJob2 = new Job();
//    Job testJob3 = new Job();
//    Job testJob4 = new Job();
//    Job testJob5 = new Job();
//
//    }


    @Test
    public void testSettingJobId() {

        Job testJob1 = new Job();

        assertEquals(10, testJob1.getId());

    }

    @Test
    public void twoJobIdNotEquals() {

        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(),testJob2.getId());
        //assertNotEquals(id1,id2);
    }

@Test
    public void testJobConstructorSetsAllFields(){

    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertTrue(new Job() instanceof Job);
    assertTrue(new Employer("ACME") instanceof Employer);
    assertTrue(new Location("Desert") instanceof Location);
    assertTrue(new PositionType("Quality control") instanceof PositionType);
    assertTrue(new CoreCompetency("Persistence") instanceof CoreCompetency);

    assertEquals("Product tester", testJob3.getName());
    assertEquals("ACME", testJob3.getEmployer().getValue());
    assertEquals("Desert", testJob3.getLocation().getValue());
    assertEquals("Quality control", testJob3.getPositionType().getValue());
    assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
    assertEquals(8, testJob3.getId());


}

@Test
    public void testJobsForEquality(){

    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


    assertNotEquals(testJob3.getId(),testJob4.getId());
    //assertNotEquals(2,newJob.getId());
//    assertFalse(newJob.equals(newJob1));
//    assertTrue(newJob.equals(newJob));


}
@Test
    public void testToStringStartsAndEndsWithNewLine(){
     // Job testJob6 = new Job("Product tester", new Employer("Charter"), new Location("St Louis"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

      // String newLine = "\n\r";
    String newLine = System.lineSeparator();


      // Job emptyJob = new Job();
   // emptyJob.setName("Product tester");

    String firstChar = String.valueOf(testJob3.toString().charAt(0));
    String lastChar = String.valueOf(testJob3.toString().charAt(testJob3.toString().length()-1));
     assertEquals(firstChar, "\n");// Passed
     assertEquals(lastChar, "\n");// Passed

//        assertEquals(firstChar, newLine);// good
//       assertEquals(lastChar, newLine);

}

@Test
    public void testToStringContainsCorrectLabelsAndData(){

   // Job testJob5 = new Job("Product tester", new Employer("Charter"), new Location("St Louis"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     String newLine = System.lineSeparator();
        assertEquals("\n" +
                " ID: " + 6 + newLine +
                " Name: " + "Product tester" + newLine +
                " Employer: " + "ACME" + newLine +
                " Location: " + "Desert" + newLine +
                " Position Type: " + "Quality control" + newLine +
                " Core Competency: " + "Persistence" + "\n",   testJob3.toString());

}

@Test
    public void testToStringHandlesEmptyField(){

   Job testJob5 = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("Java"));
    //testJob4 = new Job("", "", "", "", "");
    //Job testJob5 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //Job testJob5 = new Job("Web Developer", "", "StL", "", "Java");

    String newLine = System.lineSeparator();
    // assertEquals("OOPS! This job does not seem to exsit.", 1, emptyJob.getId());

    assertEquals("\n" +
            " ID: " + 5 + newLine +
            " Name: " + "Web Developer" + newLine +
            " Employer: " + "Data not available" + newLine +
            " Location: " + "StL" + newLine +
            " Position Type: " + "Data not available" + newLine +
            " Core Competency: " + "Java" + "\n",   testJob5.toString());

//    return String.format("\nID: %d\n" +
//               "Name: %s\n" +
//               "Employer: %s\n" +
//               "Location: %s\n" +
//               "Position Type: %s\n" +
//               "Core Competency: %s\n",id, name, employer,location, positionType,coreCompetency);
}

    @Test
    public void testToStringHandlesEmptyJob() {
        Job testJob6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("OOPS! This job does not seem to exist.", 1, testJob6.getId());
    }

}