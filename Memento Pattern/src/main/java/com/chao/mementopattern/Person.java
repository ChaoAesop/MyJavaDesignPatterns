package com.chao.mementopattern;

/**
 * 创建一个需要备份的实体
 * Create by CMC(chao_c_c@163.com) 2018/6/10 15:16
 */
public class Person {
    private String name;
    private String gender;
    private Integer age;

    public Person() {
    }

    public Person(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 备份
     * @return
     */
    public Memento createMemento(){
        return new Memento(BeanUtils.backupProp(this));
    }

    /**
     * 还原
     * @param memento
     */
    public void restoreMemento(Memento memento){
        BeanUtils.restoreProp(this, memento.getState());
    }
}
