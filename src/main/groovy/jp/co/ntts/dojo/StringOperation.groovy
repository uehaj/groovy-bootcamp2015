package jp.co.ntts.dojo

/**
 * 文字列操作。
 * 参考: プログラミングGroovy p64,p67,p117,p186
 */
class StringOperation {

	/**
	 * 空文字列を返す。
	 */
	def method1() {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 引数に与えた文字列strの長さを返す。
	 */
	def method2(String str) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 引数に与えた文字列strのn番目の文字を返す。
	 * substring()は使用しない。
	 * ヒント： 配列の要素参照と同様に行うことができる。
	 */
	def method3(String str, n) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 引数a,b,cの値をカンマを挟んで連結する。
	 * Java的にやるなら「a+','+b+','+c」だが、ここではGStringを用いて文字列を組み立てる。
	 */
	def method4(a, b, c) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 複数行の文字列("abc"+"\n"+"def"+"\n"を返す)。
	 * トリプルクォートで複数行文字列リテラルを表現する。
	 * "\n"やSystem.getProperty("line.separator")は使用しない。
	 */
	def method5() {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * バックスラッシュ文字を含む文字列(c:\WINDOWS\system32\drivers\etc\hosts)を返す。
	 * バックスラッシュをエスケープする記法(\\)を使わない。
	 */
	def method6() {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 文字列のパディングを行う。
	 * 引数で与えられた文字列sについて、幅10文字で右詰めにして空白でパディング
	 * した結果を返す。
	 * "ABC"  => "       ABC"
	 */
	def method7(String s) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 引数で与えられた文字列sについて、ひらがなをカタカナに変換した結果を返す。
	 * "こんにちわ"  => "コンニチワ"
	 */
	def method8(String s) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}
}
