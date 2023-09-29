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
}
