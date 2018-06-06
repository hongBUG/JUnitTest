package org.xu.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 1.Failure一般由单元测试使用的断言判断方法判断失败所引起的， 这表示测试点发现了问题， 输出结果与预期不一样
 * 2.Error一般由代码异常引起， 可能是测试代码bug or 被测试代码bug
 * 3.测试代码不是用来证明你是对的， 而是从来证明你没有错
 * @author xu
 *
 */
public class ErrorAndFailureTest {

	@Test
	public void testAdd() {
		assertEquals(5,new Calculate().add(1, 2));
	}
	
	@Test
	public void testDivide() {
		assertEquals(3, new Calculate().divide(1, 0));
	}
}
