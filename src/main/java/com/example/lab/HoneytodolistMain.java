package com.example.lab;

import java.time.LocalDateTime;

public class HoneytodolistMain {
    public static void main(String[] args) {
        Honeytodolist honeydo = new Honeytodolist();
        honeydo.addTasks(new Task("Take Aspirin", 3, 120, LocalDateTime.of(2022, 11, 16, 23, 59)));
        honeydo.addTasks(new Task("Take thyroid med", 1, 140, LocalDateTime.of(2022, 4, 16, 23, 59)));
        honeydo.addTasks(new Task("Eat breakfast", 2, 110, LocalDateTime.of(2022, 3, 16, 23, 59)));
        honeydo.addTasks(new Task("Drive home", 4, 12, LocalDateTime.of(2021, 2, 16, 23, 59)));
        honeydo.addTasks(new Task("Sleep", 5, 10, LocalDateTime.of(2021, 1, 15, 23, 59)));

        System.out.println(honeydo);
        System.out.println(honeydo.TotalTime());
        System.out.println("First occurrence index is "+honeydo.find("Take Aspirin"));
        System.out.println("First occurrence index is "+honeydo.find("Take thyroid med"));
        System.out.println("First occurrence index is "+honeydo.find("Eat breakfast"));
        System.out.println(honeydo.shortestTime());
        System.out.println(honeydo.overdueTasks());
        System.out.println(honeydo.completeTask(0));
    }
}
