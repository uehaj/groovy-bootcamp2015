package jp.co.ntts.dojo

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
class MapOperationTest extends GroovyTestCase {

	MapOperation cut
	@Before
	void startUp() {
		cut = new MapOperation()
	}
	@Test
	void "空のマップ"() {
		assert cut.method1().size() == 0
		assert cut.method1().getClass() == LinkedHashMap
		assert cut.method1() == new HashMap()
	}
	@Test
	void "マップの参照"() {
		assert cut.method2([name:'taro', age:20]) == 20
	}
	@Test
	void "マップのキーを変数で指定して参照1"() {
		assert cut.method3([name:'taro', age:20], 'name') == 'taro'
	}
	@Test
	void "マップのキーを変数で指定して参照2"() {
		assert cut.method4([name:'taro', age:20], 'age') == 20
	}
	@Test
	void "マップのキーを変数で指定して参照3"() {
		assert cut.method5([name:'taro', age:20], 'age') == 20
	}
	@Test
	void "マップへの追加"() {
		Map map = cut.method6([:], 30)
		assert map.age == 30
	}
	@Test
	void "マップにキーを変数で指定して追加1"() {
		Map map = cut.method7([:], "k", "value")
		assert map.k == "value"
	}
	@Test
	void "マップにキーを変数で指定して追加2"() {
		Map map = cut.method8([:], "k", "value")
		assert map["k"] == "value"
	}
	@Test
	void "マップにキーを変数で指定して追加3"() {
		Map map = cut.method9([:], "k", "value")
		assert map."k" == "value"
	}
}
