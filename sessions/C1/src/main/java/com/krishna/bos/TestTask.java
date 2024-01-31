package com.krishna.bos;

public class TestTask extends Task{
    private String testerName;
    public TestTask(String taskName) {
        super(taskName);
    }

    public String getTesterName() {
        return testerName;
    }

    public void setVerifierName(String testerName) {
        this.testerName = testerName;
    }

    @Override
    public String display() {
        return String.format("Task '%s' Assigned to '%s' will be tested by '%s'", getName(), getAssigneeName(), testerName);
    }
}
