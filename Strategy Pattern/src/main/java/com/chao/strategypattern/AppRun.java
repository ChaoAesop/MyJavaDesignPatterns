package com.chao.strategypattern;

public class AppRun {
    public static void main(String[] args) {
        //ContextStrategy contextStrategy = new ContextStrategy(new StrategyOfCouponBefore());
        ContextStrategy contextStrategy = new ContextStrategy(new StrategyOfCouponAfter());
        double price = contextStrategy.calcMoney(300, 0.8, 100);
        System.out.println("应付金额："+price);
    }
}
