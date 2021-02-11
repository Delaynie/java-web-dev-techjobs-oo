package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }


    // toString method
    @Override
    public String toString() {

        if (this.name == null || this.name == "" &&
                this.employer == null || this.employer.getValue() == "" &&
                this.location == null || this.location.getValue() == "" &&
                this.positionType == null || this.positionType.toString() == "" &&
                this.coreCompetency == null || this.coreCompetency.toString() == "") {
            return "OOPS! This job does not seem to exist";
        } else {
            if (this.name == "") {
                this.name = "data not available";
            }
            if (this.employer.getValue() == "") {
                this.employer.setValue("data not available");
            }
            if (this.location.getValue() == "") {
                this.location.setValue("data not available");
            }
            if (this.positionType.toString() == "") {
                this.positionType.setValue("data not available");
            }
            if (this.coreCompetency.toString() == "") {
                this.coreCompetency.setValue("data not available");
            }
        }
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nEmployer: " + this.employer +
                "\nLocation: " + this.location +
                "\nPosition Type: " + this.positionType +
                "\nCore Competency: " + this.coreCompetency + "\n";
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Job idField = (Job) toBeCompared;
        return idField.getId() == getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

}
