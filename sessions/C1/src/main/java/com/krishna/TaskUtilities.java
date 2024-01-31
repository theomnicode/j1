package com.krishna;

public class TaskUtilities {
    public static String trimTaskName(String taskName, int length){
        if(taskName!=null && taskName.length()>length){
            return taskName.substring(0,length);
        }
        return taskName;
    }
}
