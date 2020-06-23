package com.example.unittest.suite;

import com.example.unittest.CalculatorTest;
import com.example.unittest.CalculatorWithParameterizedTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @Description:
 * @Author: lushiju
 * @Date: 2020/6/9
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, CalculatorWithParameterizedTest.class})
public class UnitTestSuite {
}
