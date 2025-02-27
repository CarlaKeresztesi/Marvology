package com.example.marvApiJava.Models;

public class Heroes_stats extends Heroes {

    int id;
    int strength;
    int intelligence;
    int combat;
    int speed;
    int durability;
    int power;
    int total;
    String alias;
    String real_name;
    String description;


    public Heroes_stats(String alias, String real_name, String description, int strength, int intelligence, int combat, int speed, int durability, int power) {
        super(alias, real_name, description);
        this.strength = strength;
        this.intelligence = intelligence;
        this.combat = combat;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String getReal_name() {
        return real_name;
    }

    @Override
    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public int getCombat() {
        return combat;
    }

    public void setCombat(int combat) {
        this.combat = combat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = strength + intelligence + combat + speed + durability + power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
