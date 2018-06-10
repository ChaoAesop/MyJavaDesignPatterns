package com.chao.strategypattern;

/**
 * 会员折扣优惠类 （策略的具体实现）
 * Create by CMC(chao_c_c@163.com) 2018/6/10 17:17
 */
public class StrategyOfCouponAfter implements IStrategy {
    //先乘折扣再减优惠券
    public double calcMoney(double oldMoney, double memberDiscount, int coupon) {
        return oldMoney*memberDiscount - coupon;
    }
}
