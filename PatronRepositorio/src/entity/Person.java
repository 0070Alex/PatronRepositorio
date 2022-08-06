/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Alexander Elias
 */
public class Person {
    
    private long id;
    private String name;
    private int age;
    private String livingCity;
    private String email;
    private String job;
    private String gender;
    private boolean isMarried;
    
    public Person(){
        
    }

    public Person(long id, String name, int age, String livingCity, String email, String job, String gender, boolean isMarried) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.livingCity = livingCity;
        this.email = email;
        this.job = job;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingCity() {
        return livingCity;
    }

    public void setLivingCity(String livingCity) {
        this.livingCity = livingCity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    
    @Override
    public String toString() {
        return "id: "+id+ " name: "+name+" age: "+age+ " livingCity: "+livingCity+" email: "+email+ " job: "+job+" gender: "+gender+" isMarried: "+isMarried;
    }
    
    
    
}
