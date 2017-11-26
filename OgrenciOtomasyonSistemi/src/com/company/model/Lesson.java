package com.company.model;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.PriorityQueue;

public class Lesson {

    private String lessonName ;
    private int lessonID;
    private int midtermNote;
    private int finalNote;
    private int dersi_veren_ID;

    public int getDersi_veren_ID() {
        return dersi_veren_ID;
    }

    public void setDersi_veren_ID(int dersi_veren_ID) {
        this.dersi_veren_ID = dersi_veren_ID;
    }

    public int getLessonID() {
        return lessonID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getMidtermNote() {
        return midtermNote;
    }

    public void setMidtermNote(int midtermNote) {
        this.midtermNote = midtermNote;
    }

    public int getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(int finalNote) {
        this.finalNote = finalNote;
    }
}
