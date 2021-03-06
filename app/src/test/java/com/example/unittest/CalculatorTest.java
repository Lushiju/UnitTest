package com.example.unittest;

import com.example.unittest.model.Calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @Description:
 * @Author: lushiju
 * @Date: 2020/6/9
 */
public class CalculatorTest {

    //计算功能类
    private Calculator mCalculator;

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    /**
     * 方法的命名尽量描述详细
     * 测试两个数相加
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        //使用hamcrest进行assert，直观，易读
        assertThat(resultAdd, is(equalTo(2d)));
    }

    /**
     * 测试两个数相减
     */
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    /**
     * 测试两个数相减
     */
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }
    /**
     * 测试两个数相除
     */
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }
    /**
     * 测试除0时的异常类型
     */
    @Test(expected = IllegalArgumentException.class)
    public void divDivideByZeroThrows() {
        mCalculator.div(32d,0d);
    }
    /**
     * 测试两个数相乘
     */
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }

}
