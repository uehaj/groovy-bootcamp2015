package jp.co.ntts.dojo

/**
 * リスト操作。
 * 参考: プログラミングGroovy p82, p182
 */
class ListOperation {

	/**
	 * 空リストを返す。
	 */
	def method1() {
		// [Question]穴埋め問題: ここを埋めて下さい。
		[]
	}

	/**
	 * 引数に与えたリストlistのn番目の要素を返す。
	 */
	def method2(List list, n) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list[n]
	}

	/**
	 * 引数に与えたリストlistの末尾の要素を返す。
	 */
	def method3(List list) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list[-1]
	}

	/**
	 * 引数に与えたリストlistの長さを返す。
	 */
	def method4(List list) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list.size()
	}

	/**
	 * 引数に与えたリストlist1,list2を結合したリストを返す。
	 */
	def method5(List list1, List list2) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list1 + list2
	}

	/**
	 * 引数に与えたリストlistを3回繰り返したリストを返す。
	 */
	def method6(List list) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list * 3
	}

	/**
	 * 引数に与えたリストlistに要素elemを追加したリストを返す。
	 */
	def method7(List list, elem) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list + elem
	}

	/**
	 * 引数に与えたリストをソートしたものを返す。
	 */
	def method8(List list) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		list.sort()
	}
}
