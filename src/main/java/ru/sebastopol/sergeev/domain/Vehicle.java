package ru.sebastopol.sergeev.domain;

import javax.persistence.*;

/**
 * Created by gsergeev on 7/29/2014.
 */
/*
@NamedNativeQueries({
        @NamedNativeQuery(name = User.NamedQuery.USER_FIND_BY_NAME, query = "select * from hb_user where name like :name", resultClass = User.class) })
*/
@Entity
@Table(name = "hb_vehicle")
public class Vehicle {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "VIN", unique = true, nullable = true)
    private String VIN;

    @Column(nullable = false)
    private Integer year;
/*
//    @Column(columnDefinition = "enum('male','female')")
//    @Enumerated(EnumType.STRING)
//    private Gender gender = Gender.male;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private Boolean subscribed;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public static class NamedQuery {
        public static final String USER_FIND_ALL = "User.findAll";
        public static final String USER_FIND_BY_ID = "User.findById";
        public static final String USER_FIND_BY_NAME = "User.findByName";
    }
*/
}