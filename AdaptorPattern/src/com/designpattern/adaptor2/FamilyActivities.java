package com.designpattern.adaptor2;

public class FamilyActivities {
    //family activities
    Activities activity;

    public Activities getActivity() {
        return activity;
    }

    public void setActivity(Activities activity) {
        this.activity = activity;
    }

    //family activity printer.
    public void activityPrinter(String str) {
        //pring thelog
        activity.beHappylog(str);
        activity.dancelog(str);
        activity.playlog(str);
    }
    

}
