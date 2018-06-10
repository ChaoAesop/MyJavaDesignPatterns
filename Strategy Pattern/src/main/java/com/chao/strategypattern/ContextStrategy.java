package com.chao.strategypattern;
/**
 * 策略的环境类，类似一个容器
 * Create by CMC(chao_c_c@163.com) 2018/6/10 17:13
 */
public class ContextStrategy {
    private IStrategy iStrategy;

    /*
    可继续添加策略...
     */

    /**
     * 对应策略的构造器
     * @param iStrategy
     */
    public ContextStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    /**
     * 对应策略的方法
     * @param oldMoney
     * @param memberDiscount
     * @param coupon
     * @return
     */
    public double calcMoney(double oldMoney, double memberDiscount, int coupon){
        return iStrategy.calcMoney(oldMoney, memberDiscount, coupon);
    }

    public IStrategy getiStrategy() {
        return iStrategy;
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
