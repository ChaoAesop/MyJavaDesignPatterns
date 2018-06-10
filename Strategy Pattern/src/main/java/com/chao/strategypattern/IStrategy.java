package com.chao.strategypattern;

/**
 * 策略接口
 * Create by CMC(chao_c_c@163.com) 2018/6/10 17:14
 */
public interface IStrategy {
    /**
     * 计算优惠价
     * @param oldMoney 原价
     * @param memberDiscount 会员折扣
     * @param coupon 优惠券金额
     * @return
     */
    double calcMoney(double oldMoney, double memberDiscount, int coupon);
}
