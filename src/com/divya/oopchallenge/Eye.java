package com.divya.oopchallenge;

public class Eye extends Organ{
    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + color);
    }

    public void open() {
        this.isOpen = true;
        System.out.println(this.getName() + " Opened");
    }

    public void close() {
        this.isOpen = false;
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
