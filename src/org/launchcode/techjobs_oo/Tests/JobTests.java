package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTests {
    Job testId;
    Job test_jobOne;
    Job test_jobTwo;
    Job test_jobThree;
    Job equalJobOne;
    Job equalJobTwo;
    Job toStringJob;
    Job emptyJob;
    Job partialJob;
    Job fullJob;

    @Before
    public void createJobObjects() {
        testId = new Job();
        test_jobOne = new Job();
        test_jobTwo = new Job();
        test_jobThree = new Job();
        equalJobOne = new Job("name", new Employer("employer"), new Location("location"), new PositionType("position type"), new CoreCompetency("core competency"));
        equalJobTwo = new Job("name", new Employer("employer"), new Location("location"), new PositionType("position type"), new CoreCompetency("core competency"));
        toStringJob = new Job();
        emptyJob = new Job();
        partialJob = new Job("name", new Employer(""), new Location(""), new PositionType("position type"), new CoreCompetency("CoreCompetency"));
        fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    // making sure the job Id constructor sets an Id number of 1 or greater
    @Test
    public void testJobIdConstructor() {
        assertTrue(testId.getId() > 0);
    }

    // making sure the job constructor does not set the same number for two different job objects
    @Test
    public void testJobIdConstructorTwo() {
        assertTrue(test_jobOne.getId() != test_jobTwo.getId());
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

    @Test
    public void testJobConstructorSetsCorrectLocationField() {
        assertTrue(fullJob.getLocation() instanceof Location);
    }

    @Test
    public void testJobConstructorSetsCorrectPositionTypeField() {
        assertTrue(fullJob.getPositionType() instanceof PositionType);
    }

    @Test
    public void testJobConstructorSetsCorrectCoreCompetencyField() {
        assertTrue(fullJob.getCoreCompetency() instanceof CoreCompetency);
    }

    // test jobs for equality (only difference is the ID field which makes them unequal)
    @Test
    public void testJobsForEquality() {
        assertFalse(equalJobOne == equalJobTwo);
    }

    // Tests for toString method that will be built in the Job class

    @Test
    public void toStringContainsBlankLineBefore() {
        assertEquals("\n", fullJob.toString().substring(0,1));
    }

    @Test
    public void toStringContainsBlankLineAfter() {
        assertEquals("\n", fullJob.toString().length()-1);
    }

    @Test
    public void toStringContainsBlankLineAfterSubstring() {
        assertEquals("\n", fullJob.toString().substring(120,121));
    }

    @Test
    public void toStringTestAllFieldsCompleted() {
        assertFalse("data not available" == fullJob.toString());
    }


    @Test
    public void toStringTestPartiallyCompletedFields() {
        assertFalse("" == partialJob.toString());
    }

    @Test
    public void toStringTestEmptyFieldsReturnsOops() {
        assertTrue("OOPS! This job does not seem to exist" == emptyJob.toString());
    }
}
