package com.company.model;

public class Lesson {

    private String lessonName ;
    private int midtermNote;
    private int finalNote;

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
