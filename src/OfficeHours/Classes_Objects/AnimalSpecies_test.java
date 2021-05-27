package OfficeHours.Classes_Objects;

public class AnimalSpecies_test {
    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
        System.out.println(dogs.getName());
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();
        cats.setInfo("cats", 100,14);
        System.out.println(cats);

        AnimalSpecies birds = cats;
        cats.setInfo("birds", 200,34);
        System.out.println(birds);

        }
    }

