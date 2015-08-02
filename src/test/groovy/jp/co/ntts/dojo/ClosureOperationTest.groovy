package jp.co.ntts.dojo

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
class ClosureOperationTest extends GroovyTestCase {

	ClosureOperation cut
	@Before
	void startUp() {
		cut = new ClosureOperation()
	}
	@Test
	void "クロージャを呼び出す"() {
		assert cut.method1() == "hello"
	}
	@Test
	void "引数を二倍するクロージャを呼び出す"() {
		assert cut.method2(3) == 6
	}
	@Test
	void "暗黙の引数itを自乗するクロージャを呼び出す"() {
		assert cut.method3(4) == 16
	}
	@Test
	void "引数を自乗するクロージャを返す"() {
		assert cut.method4().call(3) == 9
		assert cut.method4()(4) == 16
	}
	@Test
	void "引数に渡されたクロージャを呼び出し、その結果を返す"() {
		assert cut.method5({ 1+1 }) == 2
		def n = 3
		assert cut.method5 { n*2 } == 6
	}
	@Test
	void "引数に渡されたクロージャを呼び出し、その結果に引数nを加えたものを返す"() {
		assert cut.method6(3, { 1+1 }) == 5
		assert cut.method6(4) { 1+1 } == 6
		def n = 3
		assert cut.method6(4) { n*2 } == 10
	}
}
