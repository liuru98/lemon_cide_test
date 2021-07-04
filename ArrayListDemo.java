package com.lemon.day07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static class Teacher {
        private String name;
        private int age;

        public Teacher() {

        }

        public Teacher(String name, int age) {
            this.name = name;
            this.age = age;

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

        @Override
        public String toString() {
            return name + " " + age ;
        }

        public static void main(String[] args) {
            Teacher t1 = new Teacher("张三", 25);
            Teacher t2 = new Teacher("李四", 35);
            Teacher t3 = new Teacher("老王", 19);
            Teacher t4 = new Teacher("赵六", 29);

            ArrayList<Teacher> list = new ArrayList<Teacher>();
            list.add(t1);
            list.add(t2);
            list.add(t3);
            list.add(t4);

            for(int i=0;i<list.size();i++){
                Teacher t=list.get(i);
                System.out.println(t.name+" "+t.age);
            }

            for(Teacher element:list) {
                System.out.println(element.name + " " + element.age);
            }

            int sum = 0;
            for(int i=0;i<list.size();i++){
                Teacher t=list.get(i);
                sum = sum + t.age;
            }
            int averageAge = sum/3;
            System.out.println("老师的平均年龄是" + averageAge);
        }

    }
}
