package jp.co.ntts.dojo

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
class CollectionOperationTest extends GroovyTestCase {

	CollectionOperation cut
	@Before
	void startUp() {
		cut = new CollectionOperation()
	}
	@Test
	void "コレクションの合計"() {
		assert cut.method1([1, 2, 3, 4, 5]) == 15
	}
	@Test
	void "3倍したコレクション"() {
		assert cut.method2([100, 200, 300]) == [300, 600, 900]
	}
	@Test
	void "偶数の抽出"() {
		assert cut.method3([1, 2, 3, 4, 5]) == [2, 4]
	}
	@Test
	void "最初の偶数"() {
		assert cut.method4([1, 2, 3, 4, 5]) == 2
		assert cut.method4([1, 3, 5]) == null
	}
	@Test
	void "要素がコレクションに含まれているかどうか"() {
		assert cut.method5([1, 2, 3, 4, 5], 3) == true
		assert cut.method5([1, 2, 3, 4, 5], 7) == false
		assert cut.method5([], 7) == false
		assert cut.method5(1..5, 7) == false
		assert cut.method5(5..8, 7) == true
		assert cut.method5(1..<5, 4) == true
		assert cut.method5(5..<8, 8) == false
	}
}
