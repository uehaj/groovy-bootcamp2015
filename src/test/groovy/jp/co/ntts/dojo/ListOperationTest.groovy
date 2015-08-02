package jp.co.ntts.dojo

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
class ListOperationTest extends GroovyTestCase {

	ListOperation cut
	@Before
	void startUp() {
		cut = new ListOperation()
	}
	@Test
	void "空のリスト"() {
		assert cut.method1().size() == 0
		assert cut.method1().getClass() == ArrayList
		assert cut.method1() == new ArrayList()
	}
	@Test
	void "n番目の要素を参照する"() {
		assert cut.method2([1, 2, 3, 4], 0) == 1
		assert cut.method2([1, 2, 3, 4], 1) == 2
		assert cut.method2([1, 2, 3, 4], 2) == 3
		assert cut.method2([1, 2, 3, 4], -1) == 4
		assert cut.method2([1, 2, 3, 4], -2) == 3
		assert cut.method2([1, 2, 3, 4], 1..2) == [2, 3]
		assert cut.method2([1, 2, 3, 4], 1..-1) == [2, 3, 4]
	}
	@Test
	void "末尾の要素を参照する"() {
		assert cut.method3([1, 2, 3]) == 3
	}
	@Test
	void "リストの長さを取得する"() {
		assert cut.method4([1, 2, 3, 4]) == 4
		assert cut.method4([]) == 0
	}
	@Test
	void "リストの連結"() {
		assert cut.method5([1, 2, 3], [4, 5, 6]) == [1, 2, 3, 4, 5, 6]
	}
	@Test
	void "リストを3回繰り返す"() {
		assert cut.method6([1, 2]) == [1, 2, 1, 2, 1, 2]
	}
	@Test
	void "リストに対する要素の追加"() {
		assert cut.method7([1, 2, 3], 4) == [1, 2, 3, 4]
	}
	@Test
	void "リストのソート"() {
		assert cut.method8([3, 5, 2, 0, 9]) == [0, 2, 3, 5, 9]
	}
}
