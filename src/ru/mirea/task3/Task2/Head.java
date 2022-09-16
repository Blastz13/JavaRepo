package ru.mirea.task3.Task2;

public class Head {
    private String hairCut;
    private String hairColor;
    private String eyeClor;

    public Head() {
        hairCut = "long";
        hairColor = "red";
        eyeClor = "Green";
    }

    public Head(String hairCol, String hairCu, String eyeCol) {
        hairCut = hairCu;
        hairColor = hairCol;
        eyeClor = eyeCol;
    }

    public void setHairCut(String cut) {
        hairCut = cut;
    }

    public void setHairColor(String col) {
        hairColor = col;
    }

    public void setEyeColor(String col) {
        eyeClor = col;
    }

    public String getHairCut() {
        return hairCut;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeClor;
    }

    public void info() {
        System.out.println("Hair color is " + hairColor + " eye color is " + eyeClor + " hair style is " + hairCut);
    }
}