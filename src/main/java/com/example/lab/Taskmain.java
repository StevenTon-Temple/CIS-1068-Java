package com.example.lab;

import java.time.LocalDateTime;

public class Taskmain {
    public static void main(String[] args) {
        Task hw = new Task("Finish 1068 HW", 3, 120, LocalDateTime.of(2022, 11, 16, 23, 59));

        hw.setWhenDue(LocalDateTime.of(2022, 11, 16, 23, 59));
        hw.setName("eat food");
        hw.setEstMinsToComplete(11);
        hw.decresePriority(1);
        hw.increasepriorty(5);
        System.out.println(hw);
    }
}
