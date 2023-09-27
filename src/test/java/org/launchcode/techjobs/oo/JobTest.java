package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here


                 String lineSeparator = "\n";
      //  String lineSeparator = lineSeparator();
//    @BeforeTest
//    public void runJobBeforeTesting() {
//
//    Job testJob1 = new Job();
//    Job testJob2 = new Job();
//    Job job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//    Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

   // Job job6 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//    Job job7 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//   }


    @Test
    public void testSettingJobId() {

        Job testJob1 = new Job();

        assertEquals(11, testJob1.getId());

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

    Job job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));


    assertTrue(new Job() instanceof Job);
    assertTrue(new Employer("LaunchCode") instanceof Employer);
   // assertTrue(employer("LaunchCode") instanceof new Employer());
    assertTrue(new Location("St. Louis") instanceof Location);
    assertTrue(new PositionType("Front-end developer") instanceof PositionType);
    assertTrue(new CoreCompetency("JavaScript") instanceof CoreCompetency);

    assertEquals("Web Developer", job3.getName());
    assertEquals("LaunchCode", job3.getEmployer().getValue());
    assertEquals("St. Louis", job3.getLocation().getValue());
    assertEquals("Front-end developer", job3.getPositionType().getValue());
    assertEquals("JavaScript", job3.getCoreCompetency().getValue());
    assertEquals(9, job3.getId());


}

@Test
    public void testJobsForEquality(){
    Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


            assertNotEquals(job4.getId(),job5.getId());
           // assertFalse(job4.equals(job5));


}
@Test
    public void testToStringStartsAndEndsWithNewLine(){
    // Job job6 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
    Job job6 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"),new CoreCompetency("Java"));

   // String lineSeparator = "\n";
   // String lineSeparator = System.lineSeparator();

    String firstChar = String.valueOf(job6.toString().charAt(0));
    String lastChar = String.valueOf(job6.toString().charAt(job6.toString().length()-1));
        assertEquals(firstChar, lineSeparator);
        assertEquals(lastChar, lineSeparator);
}

@Test
    public void testToStringContainsCorrectLabelsAndData(){

    Job job6 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"),new CoreCompetency("Java"));
   // String newLine = lineSeparator();

    assertEquals(lineSeparator +
                    "ID: " + 6 + lineSeparator +
                    "Name: " + "Web Developer" + lineSeparator +
                    "Employer: " + "LaunchCode" + lineSeparator +
                    "Location: " + "StL" + lineSeparator +
                    "Position Type: " + "Back-end developer" + lineSeparator +
                    "Core Competency: " + "Java" + lineSeparator,   job6.toString());

}

@Test
    public void testToStringHandlesEmptyField(){


   Job testJob5 = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("Java"));
    String newLine = lineSeparator();


    assertEquals(lineSeparator +
                    "ID: " + 5 + lineSeparator +
                    "Name: " + "Web Developer" + lineSeparator +
                    "Employer: " + "Data not available" + lineSeparator +
                    "Location: " + "StL" + lineSeparator +
                    "Position Type: " + "Data not available" + lineSeparator +
                    "Core Competency: " + "Java" + lineSeparator,   testJob5.toString());

}

    @Test
    public void testToStringHandlesEmptyJob() {
    Job job8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("OOPS! This job does not seem to exist.", 8, job8.getId());
    }

}