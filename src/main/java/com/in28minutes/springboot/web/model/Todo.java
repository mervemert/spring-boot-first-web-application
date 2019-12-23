package com.in28minutes.springboot.web.model;

import javax.validation.constraints.Size;
import java.util.Date;

public class Todo {
    private int id;
    private String user;

    @Size(min = 10, message = "Enter at least 10 characters")
    private String descr;
    private Date targetDate;
    private boolean isDone;

    public Todo(int id, String user, String descr, Date targetDate, boolean isDone) {
        this.id = id;
        this.user = user;
        this.descr = descr;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    //getter setter
    //toString

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", descr='" + descr + '\'' +
                ", targetDate=" + targetDate +
                ", isDone=" + isDone +
                '}';
    }
}
