package org.launchcode.techjobs.oo;
import org.junit.Test;
import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
         String newLine = "\n";
            //String newLine = System.lineSeparator();
@Test
public void testSettingJobId() {

        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());
    }

@Test
public void testJobConstructorSetsAllFields(){

        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(new Job() instanceof Job);
        assertTrue(new Employer("ACME") instanceof Employer);
        assertTrue(new Location("Desert") instanceof Location);
        assertTrue(new PositionType("Quality control") instanceof PositionType);
        assertTrue(new CoreCompetency("Persistence") instanceof CoreCompetency);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
         //assertEquals(9, job3.getId());

}

@Test
public void testJobsForEquality(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

                assertNotEquals(job3.getId(),job4.getId());
                assertFalse(job3.equals(job4));

}
@Test
public void testToStringStartsAndEndsWithNewLine(){
    // Job job6 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
    Job job5 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"),new CoreCompetency("Java"));

//     String lineSeparator = "\n";
   // String lineSeparator = System.lineSeparator();

    String firstChar = String.valueOf(job5.toString().charAt(0));
    String lastChar = String.valueOf(job5.toString().charAt(job5.toString().length()-1));
        assertEquals(firstChar, newLine);
        assertEquals(lastChar, newLine);
}

@Test
public void testToStringContainsCorrectLabelsAndData(){

    Job job5 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"),new CoreCompetency("Java"));
   // String newLine = lineSeparator();
    assertEquals(newLine +
                    "ID: " + 4 + newLine +
                    "Name: " + "Web Developer" + newLine +
                    "Employer: " + "LaunchCode" + newLine +
                    "Location: " + "StL" + newLine +
                    "Position Type: " + "Back-end developer" + newLine +
                    "Core Competency: " + "Java" + newLine,   job5.toString());

}

@Test
public void testToStringHandlesEmptyField(){

   Job testJob5 = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("Java"));
   // String newLine = lineSeparator();
    assertEquals(newLine +
                    "ID: " + 3 + newLine +
                    "Name: " + "Web Developer" + newLine +
                    "Employer: " + "Data not available" + newLine +
                    "Location: " + "StL" + newLine +
                    "Position Type: " + "Data not available" + newLine +
                    "Core Competency: " + "Java" + newLine,   testJob5.toString());

}

@Test
public void testToStringHandlesEmptyJob() {
        Job job6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("OOPS! This job does not seem to exist.", 6, job6.getId());
    }

}