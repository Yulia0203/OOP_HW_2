package org.example;

public final class Dog {
    private final String name;
    private final String breed;
    private final String color;

    public Dog(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    public void sayInfo() {
        System.out.printf("Собаку зовут %s, порода %s, окрас %s",  this.name, this.breed, this.color);
    }
}


