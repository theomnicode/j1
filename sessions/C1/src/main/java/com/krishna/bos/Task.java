package com.krishna.bos;
public abstract class Task{
    private String name;
    private int priority;
    private String assigneeName;
    private String dueDate;
    private String status;
    public String startDate = "Day+1";
    private Task(){
        status = "UNASSIGNED";
        priority = 4;
        dueDate = "Day+4";
    }
    public Task(String taskName){
        this();
        name = taskName;
    }
    public Task(String taskName, int priority){
        this(taskName);
        this.priority = priority;
    }

    public void setAssignee(String assigneeName){
        this.assigneeName = assigneeName;
        this.status = "ASSIGNED";
    }

    public String getAssigneeName() {
        return this.assigneeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public String display(){
        return String.format("Task '%s' Assigned to '%s'", name, assigneeName);
    }
    public abstract void setVerifierName(String verifierName);

}