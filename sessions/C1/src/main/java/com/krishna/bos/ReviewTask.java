package com.krishna.bos;

public class ReviewTask extends Task{
    private String reviewerName;
    public String startDate = "Day+4";
    public ReviewTask(String taskName) {
        super(taskName);
        System.out.println("Review Task");
    }
   public String getReviewerName() {
        return reviewerName;
    }

    public void setVerifierName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    public void setVerifierName(String reviewerName, boolean shouldChangeStatus) {
       if(shouldChangeStatus){
            setStatus("REVIEW");
       }
       this.reviewerName = reviewerName;
    }

    public String display(){
        return String.format("Task '%s' Assigned to '%s' will be reviewed by '%s'", getName(), getAssigneeName(), reviewerName);
    }

}
