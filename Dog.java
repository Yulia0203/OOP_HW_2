package org.example;

public final class Dog {
    private final String name;
    private final String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void sayInfo() {
        System.out.printf("Собаку зовут %s, порода %s", this.name, this.breed);
    }
}
