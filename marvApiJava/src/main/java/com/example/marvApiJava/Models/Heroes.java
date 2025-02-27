package com.example.marvApiJava.Models;

public class Heroes {

        Long hero_id;
        String alias;
        String image_url;
        String real_name;
        String description;

        public Heroes() {} ;

        public Heroes(String alias, String real_name, String description) {
        this.alias = alias;
        this.real_name = real_name;
        this.description = description;
    }

    public Long getHero_id() {
        return hero_id;
    }

    public void setHero_id(Long hero_id) {
        this.hero_id = hero_id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}//end of Heroes
