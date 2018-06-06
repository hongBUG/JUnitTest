package org.xu.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterTest {
	
	/*
	 * 1. 更改默认的测试运行器为RunWith(Parameterized.class)
	 * 2. 生命变量来存放预期值和输入参数
	 * 3. 生命一个@Parameters修饰的返回值为Collection 的public static 方法(用来存放参数)
	 * 4. 为测试类声明一个带有参数的公共构造函数， 为变量赋值
	 */
	
    int expected = 0;
    int input1 = 0;
    int input2 = 0;
    
    @Parameters
    public static Collection<Object[]> t() {
    	return Arrays.asList(new Object[][] {
    		{3, 2, 1},
    		{4, 2, 2}
    	});
    }
    
    public ParameterTest(int expected, int input1, int input2) {
    	this.expected = expected;
    	this.input1 = input1;
    	this.input2 = input2;
    }
    
    @Test
    public void testAdd() {
    	assertEquals(expected, new Calculate().add(input1, input2));
    }

}
