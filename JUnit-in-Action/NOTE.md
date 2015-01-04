《JUnit in Action 中文版》笔记
===============================

### 1.JUnit起步

Objective test + Replicable test = Simple test program

单元测试框架应该遵守的几种最佳实践

* 每个单元测试都必须独立于其他单元测试而运行
* 必须以单项测试为单位来检测和报告错误
* 必须易于定义要运行哪些单元测试

JUnit团队为框架设立的3个目标

* 框架必须帮助我们编写有用的测试
* 框架必须帮助我们创建随着时间的过去依然保持有用的测试
* 框架必须通过复用代码来降低我们编写测试的成本

### 2.探索JUnit

TestCase(测试用例) + TestSuite(测试集合) + BaseTestRunner(测试运行器) = TestResult

7个JUnit核心类及接口
* Assert
* TestResult
* Test(interface)
* TestListener(interface)
* TestCase
* TestSuite
* BaseTestRunner

JUnit区分失败和错误

**失败**是可预期的。代码的改变不时的造成断言失败，但只要修正代码，断言就可再次通过。

**错误**（比如常规程序抛出异常）则是测试是不可预料的。当然错误可能意味着支撑环境的失败，而不是测试本身的失败。当遇到错误时，好的分析步骤是

* 检查环境（数据库正常？网络正常？）
* 检查测试
* 检查代码

用fixture来管理资源

fixture--运行一个或多个测试所需的公共资源或数据集合

TestCase通过setUp()和tearDown()来自动创建和销毁fixture。

在实践中，很多开发者都使用mock object或stubs来模拟数据库连接以及其他复杂资源。

Assert超类提供的8个核心方法

* assertTrue
* assertFalse
* assertEquals
* assertNotNull
* assertNull
* assertSame
* assertNotSame
* fail

TestCase额外提供的10个方法

* countTestCases
* createResult
* getName
* setName
* run
* runBare
* runTest
* setUp
* tearDown
* toString

保持测试的独立性--相互依赖的测试会造成的问题

* 不具可移植性
* 难以维护
* 不够清晰


