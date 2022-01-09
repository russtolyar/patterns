package com.solvd.patterns.builder;

public class Human {

    private String name;
    private String surname;
    private String nationality;
    private Integer age;
    private String hair;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", hair='" + hair + '\'' +
                '}';
    }

    public static class Builder{

        private final Human myHuman;

        public  Builder(){
            myHuman = new Human();
        }

        public Builder name(String name){
            myHuman.name = name;
            return this;
        }
        public Builder surname(String surname){
            myHuman.surname = surname;
            return this;
        }
        public Builder nationality(String nationality){
            myHuman.nationality = nationality;
            return this;
        }
        public Builder age(Integer age){
            myHuman.age = age;
            return this;
        }
        public Builder hair(String hair){
            myHuman.hair = hair;
            return this;
        }

        public Human build(){
            return myHuman;
        }


    }
}
