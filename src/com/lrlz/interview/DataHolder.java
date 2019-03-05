package com.lrlz.interview;

import java.util.ArrayList;
import java.util.List;

/*
* get()方法被经常使用,请问如何重构?
* */
public class DataHolder {
    private List<Person> mDatas = new ArrayList<>();

    public void add(List<Person> data) {
        mDatas.addAll(data);
    }

    public Person get(int id) {
        for (Person person : mDatas) {
            if (person.id() == id) {
                return person;
            }
        }
        return null;
    }
}

class Person {
    private int id;

    int id() {
        return id;
    }
}
