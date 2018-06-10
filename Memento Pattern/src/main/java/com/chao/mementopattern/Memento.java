package com.chao.mementopattern;

import java.util.Map;

/**
 * Memento：一个备忘录，相当于存储一份实体的快照
 * Create by CMC(chao_c_c@163.com) 2018/6/10 15:02
 */
public class Memento {
    private Map<String, Object> state;

    public Memento(Map<String, Object> state) {
        this.state = state;
    }

    public Map<String, Object> getState() {
        return state;
    }

    public void setState(Map<String, Object> state) {
        this.state = state;
    }
}
