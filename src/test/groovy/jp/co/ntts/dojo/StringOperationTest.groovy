package jp.co.ntts.dojo

import org.junit.Test
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4.class)
class StringOperationTest extends GroovyTestCase {

	StringOperation cut
	@Before
	void startUp() {
		cut = new StringOperation()
	}
	@Test
	void "空文字列を返す"() {
		assert cut.method1().size() == 0
		assert cut.method1().class == java.lang.String
		assert cut.method1() == ""
	}
	@Test
	void "文字列の長さを取得する"() {
		assert cut.method2("abcdef") == 6
		assert cut.method2("") == 0
	}
	@Test
	void "文字列中のn番目の文字を取得する"() {
		assert cut.method3("abcdef", 3) == 'd'
	}
	@Test
	void "カンマで挟んで連結"() {
		assert cut.method4("a", "b", "c") == "a,b,c"
	}
	@Test
	void "複数行文字列"() {
		assert cut.method5() == "abc\ndef\n"
	}
	@Test
	void "バックスラッシュを含んだ文字列"() {
		assert cut.method6() == "c:\\WINDOWS\\system32\\drivers\\etc\\hosts"
	}
	@Test
	void "右詰め10文字空白パディング"() {
		assert cut.method7("ABCDEF") == "    ABCDEF"
		assert cut.method7("ABC")    == "       ABC"
		assert cut.method7("A")      == "         A"
	}
	@Test
	void "カタカナをひらがなに変換"() {
		assert cut.method8("こんにちは") == "コンニチハ"
	}
}
