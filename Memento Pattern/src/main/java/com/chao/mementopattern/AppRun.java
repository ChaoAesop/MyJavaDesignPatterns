package com.chao.mementopattern;

public class AppRun {
    public static void main(String[] args) {
        //System.out.println(111);
        //创建管理者
        Caretaker caretaker = new Caretaker();

        //需要备份的实体
        Person person = new Person("夜魔", "男", 99);
        caretaker.setMemento("001", person.createMemento());
        System.out.println(person);

        //改变实体状态
        person.setGender("女");
        person.setAge(88);
        System.out.println(person);

        //恢复实体状态
        person.restoreMemento(caretaker.getMemento("001"));
        System.out.println(person);
    }
}
