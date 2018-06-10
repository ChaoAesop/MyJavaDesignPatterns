package com.chao.strategypattern;

/**
 * 会员折扣优惠类 （策略的具体实现）
 * Create by CMC(chao_c_c@163.com) 2018/6/10 17:17
 */
public class StrategyOfCouponBefore implements IStrategy {
    //先减优惠券再乘折扣
    public double calcMoney(double oldMoney, double memberDiscount, int coupon) {
        return (oldMoney-coupon)*memberDiscount;
    }
}
