package com.example.lab;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private int priorty;
    private int estMinsToComplete;
    private LocalDateTime whenDue;


    public Task(String initName, int initPriorty, int initEstMinsToComplete, LocalDateTime whenDue) {
        name = initName;
        priorty = initPriorty;
        estMinsToComplete = initEstMinsToComplete;
        this.whenDue=whenDue;

    }


    public String getname() {
        return name;
    }

    public int getpriorty() {
        return priorty;
    }

    public int getEstMinsToComplete() {
        return estMinsToComplete;
    }

    public void setName(String Newname) {
        this.name = Newname;
    }

    public void setEstMinsToComplete(int newEst) {
        this.estMinsToComplete = newEst;
    }
    public LocalDateTime getWhenDue() {
        return whenDue;

    }
    public void setWhenDue(LocalDateTime whenDue) {

        this.whenDue = whenDue;

    }


    public String toString() {
        return "remind me " + name + " priorty " + priorty + " the estimated time to finsh is " + estMinsToComplete;
    }

    public int increasepriorty(int amount) {
        if (amount >= 0) {
            priorty += amount;
        } else {
            return priorty;
        }
        return priorty;
    }
    public int decresePriority(int amount) {

        if(amount >= priorty) {
            priorty = 0;
        }
        else {
            priorty -= amount;
        }
        return priorty;
    }
    public boolean overdue() {
        if(LocalDateTime.now().compareTo(this.whenDue) > 0)
            return true;
        else
            return false;
    }

}
