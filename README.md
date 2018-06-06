# JUnitTest
This is JunitTestLearning

# Contents
@Test 测试方法
  @Test(expected=xx.class)
  @Test(timeout=?)   // 毫秒为单位
@BeforeClass 在所有的测试方法运行之前运行 static 方法
  一般用于初始化资源文件
@AfterClass 在所有的方法运行之后运行 static 方法
  一般用于释放资源
@Before 在每个测试方法运行之前运行
@After 在每个测试方法运行之后运行
@Ignore("xxx") 忽略所修饰的测试方法 xxx为测试原因
@RunWith 更改测试运行器 
  运行器需要继承org.junit.runner.Runner类
断言：assert*Equals()
测试套件：
  * 测试套件是组织各个测试类一起运行
  * 写一个类作为测试套件的入口类， 类为空类
  * 更改运行测试器为Suite.class
  * 然后将要进行的测试的类，以数组形式传入Suite.SuiteClasses({classname1.class, classname2.class, etc})
参数化测试套件(重复测试)
  * 1. 更改默认的测试运行器为RunWith(Parameterized.class)
  * 2. 生命变量来存放预期值和输入参数
  * 3. 生命一个@Parameters修饰的返回值为Collection 的public static 方法(用来存放参数)
  * 4. 为测试类声明一个带有参数的公共构造函数， 为变量赋值
	 