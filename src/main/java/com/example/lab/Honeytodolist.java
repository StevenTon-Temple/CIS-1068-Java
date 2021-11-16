package com.example.lab;

import java.util.Arrays;

public class Honeytodolist {
    private Task tasks[];
    private int numtask;
    private int INITIAL_CAPACITY;

    public Honeytodolist() {
        numtask = 0;
        tasks = new Task[INITIAL_CAPACITY];

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                s = s + tasks[i].toString() + "\n";
            }
        }
        return s;
    }

    public int find(String name) {
        for (int i = 0; i < tasks.length; i++) {
            String t = tasks[i].getname();
            if (t.equalsIgnoreCase(name)) {
                return i;

            }
        }
        return -1;
    }

    public void addTasks(Task task) {
        Task tasks2[] = new Task[tasks.length + 1];
        if (tasks.length == numtask) {
            int i = 0;
            for (i = 0; i < tasks.length; i++) {
                tasks2[i] = tasks[i];
            }
            tasks2[i] = task;
            numtask++;
            tasks = tasks2;
        } else {
            tasks[numtask] = task;
            numtask++;
        }
        sort();
    }
    public void sort(){
        Task temp[] = new Task[tasks.length + 1];
        for (int i = 0; i < tasks.length; i++) {
            for (int j = i + 1; j < tasks.length; j++) {
                if (tasks[i].getpriorty() > tasks[j].getpriorty()) {
                    temp[i] = tasks[i];
                    tasks[i] = tasks[j];
                    tasks[j] = temp[i];

                }

            }
        }
    }

    public int TotalTime() {
        int totaltime = 0;
        for (int i = 0; i < tasks.length; i++) {
            totaltime += tasks[i].getEstMinsToComplete();
        }
        return totaltime;
    }

    public int shortestTime() {
        int min = tasks[0].getEstMinsToComplete();
        if (numtask == 0)
            return -1;

        for (int i = 0; i < numtask; i++) {
            if (tasks[i].getEstMinsToComplete() > min)
                min = tasks[i].getEstMinsToComplete();
        }
        return min;
    }

    public String overdueTasks() {
        int count = 0;
        for (int i = 0; i < numtask; i++) {
            if (tasks[i].overdue() == true){
                count++;
            }
        }
        Task taskss[] = new Task[count];
        int j = 0;
        for (int i = 0; i < numtask; i++) {
            if (tasks[i].overdue() == true)
                taskss[j++] = tasks[i];
        }
        return Arrays.toString(taskss);
    }
    public Task completeTask(int index) {

        if(index < 0 || index >= numtask)
            return null;

        Task t = tasks[index];
        for(int i = index; i < numtask - 1; i++) {
            tasks[i] = tasks[i+1];
        }
        numtask--;
        return t;
    }
}

