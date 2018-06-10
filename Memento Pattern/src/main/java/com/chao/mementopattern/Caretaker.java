package com.chao.mementopattern;

import java.util.HashMap;
import java.util.Map;

/**
 *  备忘录的管理者
 *  可以存储和提取多个备忘录Memento
 * Create by CMC(chao_c_c@163.com) 2018/6/10 15:19
 */
public class Caretaker {
    private Map<String, Memento> memMap = new HashMap<>();

    public void setMemento(String index, Memento memento){
        this.memMap.put(index, memento);
    }
    public Memento getMemento(String index){
        return this.memMap.get(index);
    }

}
