package com.jiao.filter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ground {
    private int id;
    private String name;
    private ArrayList<People> people;

    public Ground() {
    }

    public Ground(int id, String name, ArrayList<People> people) {
        this.id = id;
        this.name = name;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<People> people) {
        this.people = people;
    }
}
