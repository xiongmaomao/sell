package com.xgq.sell;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
