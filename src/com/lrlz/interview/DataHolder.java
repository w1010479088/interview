package com.lrlz.interview;

import java.util.ArrayList;
import java.util.List;

/*
* get()方法被经常使用,请问有何问题?如有问题,请重构.
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

    public void remove(int id) {
        for (Person person : mDatas) {
            if (person.id() == id) {
                mDatas.remove(person);
                break;
            }
        }
    }
}

class Person {
    private int id;

    int id() {
        return id;
    }
}
