package za.ac.jasonhans.Domain;

import za.ac.jasonhans.DomainInterfaces.IAnimal;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class Animal implements Serializable, IAnimal{
    private String name;
    private int animalId;
    private int spaceRequired;
    private double weight;
    private int age;
    private String breed;
    private Adoption adoption;
    private List<Schedule> schedules;

    public Animal(Builder value)
    {
        this.name = value.name;
        this.age = value.age;
        this.animalId = value.animalId;
        this.spaceRequired = value.spaceRequired;
        this.weight = value.weight;
        this.breed = value.breed;
        this.adoption = value.adoption;
    }

    public String getName() {
        return name;
    }

    public int getAnimalId() {
        return animalId;
    }

    public int getSpaceRequired() {
        return spaceRequired;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public List<Schedule> getSchedules() {
        return schedules;
    }

    @Override
    public Adoption getAdoption() {
        return adoption;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public static class Builder{
        String name;
        int animalId;
        int spaceRequired;
        double weight;
        int age;
        String breed;
        Adoption adoption;
        List<Schedule> schedules;

        public Builder(String name) {
            this.name = name;
        }

        public Builder animalId(int animalId) {
            this.animalId = animalId;
            return this;
        }

        public Builder spaceRequired(int spaceRequired) {
            this.spaceRequired = spaceRequired;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder adoption(Adoption adoption) {
            this.adoption = adoption;
            return this;
        }

        public Builder breed(String breed) {
            this.breed = breed;
            return this;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder copy(Animal value)
        {
            this.name = value.name;
            this.age = value.age;
            this.animalId = value.animalId;
            this.spaceRequired = value.spaceRequired;
            this.weight = value.weight;
            this.breed = value.breed;
            this.adoption = value.adoption;
            return this;
        }

        public Animal build()
        {
            return new Animal(this);
        }

    }
}
