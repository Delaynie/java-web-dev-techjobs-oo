package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTests {
    Job test_jobOne;
    Job test_jobTwo;
    Job test_jobThree;
    Job testJobs;
    Job fullJob;
    Job equalJobOne;
    Job equalJobTwo;

    @Before
    public void createJobObjects() {
        test_jobOne = new Job();
        test_jobTwo = new Job();
        test_jobThree = new Job();
        testJobs = new Job();
        fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        equalJobOne = new Job("name", new Employer("employer"), new Location("location"), new PositionType("position type"), new CoreCompetency("core competency"));
        equalJobTwo = new Job("name", new Employer("employer"), new Location("location"), new PositionType("position type"), new CoreCompetency("core competency"));

    }

    // just testing with an empty test
    @Test
    public void emptyTest() {
        assertEquals(5, 5, .001);
    }

    // making sure the job Id constructor sets an Id number of 1 or greater
    @Test
    public void testJobIdConstructor() {
        assertTrue(testJobs.getId() >= 1);
        //System.out.println(testJobs.getId());
    }

    // making sure the job constructor does not set the same number for two different job objects
    @Test
    public void testJobIdConstructor2() {
        assertTrue(test_jobOne.getId() != test_jobTwo.getId());
    }

    // another test to make sure the constructor doesn't give the same number to different job objects
    @Test
    public void testsDifferentIDNumbers() {
        assertNotSame(test_jobOne.getId(), test_jobTwo.getId());
    }


    // Testing the full constructor

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(fullJob instanceof Job);
    }

    @Test
    public void testJobConstructorSetsCorrectNameField() {
        assertTrue("Product tester" == fullJob.getName());
    }

    @Test
    public void testJobConstructorSetsCorrectEmployerField() {
        assertTrue(fullJob.getEmployer() instanceof Employer);
    }

    // test jobs for equality
    @Test
    public void testJobsForEquality() {
        assertFalse(equalJobOne == equalJobTwo);
    }
}
