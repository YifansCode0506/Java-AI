package com.yifan.Extends8;

public class Teachers extends Person{
    private String subject;

    public Teachers() {;
    }

    public Teachers(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println("teaching");
    }
}
