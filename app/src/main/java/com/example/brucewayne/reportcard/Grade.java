package com.example.brucewayne.reportcard;

public class Grade {
    private String name;
    private int math, english, history, biology, physics, chemistry;

    public Grade() {
        this.name = "";
        this.math = 0;
        this.english = 0;
        this.history = 0;
        this.biology = 0;
        this.physics = 0;
        this.chemistry = 0;
    }
    public Grade(String name, int math, int english, int history, int biology, int physics, int chemistry) {
        if (name != null) {
            this.name = name;
        }

        if (math >= 0 && math <= 100) {
            this.math = math;
        }
        else {
            System.out.println("Invalid math grade! Should be from 0 to 100");
        }

        if (english >= 0 && english <= 100) {
            this.english = english;
        }
        else {
            System.out.println("Invalid math grade! Should be from 0 to 100");
        }

        if (history >= 0 && history <= 100) {
            this.history = history;
        }
        else {
            System.out.println("Invalid math grade! Should be from 0 to 100");
        }

        if (biology >= 0 && biology <= 100) {
            this.biology = biology;
        }
        else {
            System.out.println("Invalid math grade! Should be from 0 to 100");
        }

        if (physics >= 0 && physics <= 100) {
            this.physics = physics;
        }
        else {
            System.out.println("Invalid math grade! Should be from 0 to 100");
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry = chemistry;
        }
        else {
            System.out.println("Invalid math grade! Should be from 0 to 100");
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getMath() {
        return this.math;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getEnglish() {
        return this.english;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getHistory() {
        return this.history;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getBiology() {
        return this.biology;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getPhysics() {
        return this.physics;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getChemistry() {
        return this.chemistry;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
               "\nMath grade: " + this.math +
               "\nEnglish grade: " + this.english +
               "\nHistory grade: " + this.history +
               "\nBiology grade: " + this.biology +
               "\nPhysics grade: " + this.physics +
               "\nChemistry grade: " + this.chemistry;
    }
}