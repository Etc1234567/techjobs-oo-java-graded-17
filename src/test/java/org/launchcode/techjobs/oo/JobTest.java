package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
       Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       //name
        String expectedName = "Product tester";
        assertNotNull(testJob.getName());
        assertEquals(expectedName, testJob.getName());

        //employer
        String expectedEmployer = "ACME";
        String actualEmployer = testJob.getEmployer().toString();
        assertNotNull(testJob.getEmployer());
        //assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals(expectedEmployer, actualEmployer);

        //location
        String expectedLocation = "Desert";
        String actualLocation = testJob.getLocation().toString();
        assertNotNull(testJob.getLocation());
        //assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(expectedLocation, actualLocation);

        //position type
        String expectedPositionType = "Quality control";
        String actualPositionType = testJob.getPositionType().toString();
        assertNotNull(testJob.getPositionType());
        //assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(expectedPositionType, actualPositionType);

        //core competency
        String expectedCoreCompetency = "Persistence";
        String actualCoreCompetency = testJob.getCoreCompetency().toString();
        assertNotNull(testJob.getCoreCompetency());
        //assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(expectedCoreCompetency,actualCoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Jedi Master", new Employer("The Council"), new Location("Coruscant"), new PositionType("Master Jedi"), new CoreCompetency("The Force"));
        Job job2 = new Job("Jedi Master", new Employer("The Council"), new Location("Coruscant"), new PositionType("Master Jedi"), new CoreCompetency("The Force"));

    assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Jedi Master", new Employer("The Council"), new Location("Coruscant"), new PositionType("Master Jedi"), new CoreCompetency("The Force"));
        String expectedOutput = System.lineSeparator() + testJob.toString() + System.lineSeparator();
        assertEquals(testJob.toString().startsWith(System.lineSeparator()), true);
        assertEquals(testJob.toString().endsWith(System.lineSeparator()), true);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Jedi Master", new Employer("The Council"), new Location("Coruscant"), new PositionType("Master Jedi"), new CoreCompetency("The Force"));
        String output = System.lineSeparator() +
                        "ID: " + testJob.getId() + "\n" +
                        "Name: " + testJob.getName() + "\n" +
                        "Employer: " + testJob.getEmployer() + "\n" +
                        "Location: " + testJob.getLocation() + "\n" +
                        "Position Type: " + testJob.getPositionType() + "\n" +
                        "Core Competency: " + testJob.getCoreCompetency() +
                                System.lineSeparator() ;

        assertEquals(output, testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job missingLocation = new Job("Jedi Master", new Employer("The Council"), new Location(""), new PositionType("Master Jedi"), new CoreCompetency("The Force"));
        String expectedOutput = System.lineSeparator() +
                "ID: " + missingLocation.getId() + "\n" +
                "Name: " + missingLocation.getName() + "\n" +
                "Employer: " + missingLocation.getEmployer() + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: " + missingLocation.getPositionType() + "\n" +
                "Core Competency: " + missingLocation.getCoreCompetency() +
                System.lineSeparator() ;

        assertEquals(expectedOutput, missingLocation.toString());
    }
}
