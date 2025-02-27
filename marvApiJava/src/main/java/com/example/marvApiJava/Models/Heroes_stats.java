package com.example.marvApiJava.Models;

public class Heroes_stats extends Heroes {

    Long id;
    Long strength;
    Long intelligence;
    Long combat;
    Long speed;
    Long durability;
    Long power;
    Long total;
    String alias;
    String real_name;
    String description;


    public Heroes_stats(String alias, String real_name, String description, Long strength, Long intelligence, Long combat, Long speed, Long durability, Long power) {
        super(alias, real_name, description);
        this.strength = strength;
        this.intelligence = intelligence;
        this.combat = combat;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
    }

    public Long getStrength() {
        return strength;
    }

    public void setStrength(Long strength) {
        this.strength = strength;
    }

    public Long getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Long intelligence) {
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

    public Long getCombat() {
        return combat;
    }

    public void setCombat(Long combat) {
        this.combat = combat;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Long getDurability() {
        return durability;
    }

    public void setDurability(Long durability) {
        this.durability = durability;
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = strength + intelligence + combat + speed + durability + power;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
