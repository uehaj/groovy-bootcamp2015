package jp.co.ntts.dojo

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
class OtherOperationTest extends GroovyTestCase {
	OtherOperation cut
	@Before
	void startUp() {
		cut = new OtherOperation()
	}
	@Test
	void "名前引数でのインスタンスの生成"() {
		Person p = new Person()
		p.name = "taro"
		p.age = 33
		assert cut.method1("taro", 33) == p
	}
	@Test
	void "名前引数でのメソッドの呼び出し"() {
		assert cut.method2(100, 200) == 300
	}
}
