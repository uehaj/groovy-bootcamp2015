package jp.co.ntts.dojo

/**
 * マップ操作。
 * 参考: プログラミングGroovy p88
 */
class MapOperation {

	/**
	 * 空のマップを返す。
	 */
	def method1() {
		// [Question]穴埋め問題: ここを埋めて下さい。
		[:]
	}

	/**
	 * マップmapのキー'age'の値を返す。
	 */
	def method2(Map map) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map.age
	}

	/**
	 * マップmapについて、キーが引数keyである値を返す。
	 * Map#get(key)メソッドを使用する。
	 */
	def method3(Map map, key) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map.get(key)
	}

	/**
	 * マップmapについて、キーが引数keyである値を返す。
	 * 配列要素参照の記法(map[key])を使用する。
	 */
	def method4(Map map, key) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map[key]
	}

	/**
	 * マップmapについて、キーが引数keyである値を返す。
	 * GStringを用いたプロパティの記法(map."$xxx")を使用する。
	 */
	def method5(Map map, key) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map."$key"
	}

	/**
	 * マップmapにキー'age'であるようなエントリを追加する。
	 */
	def method6(Map map, value) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map.age = value
		return map
	}
	/**
	 * マップmapに、キーがkey, 値がvalueであるようなエントリを追加する。
	 * Map#put(key, value)メソッドを使用。
	 */
	def method7(Map map, key, value) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map.put(key, value)
		return map
	}
	/**
	 * マップmapに、キーがkey, 値がvalueであるようなエントリを追加する。
	 * 配列要素への代入の記法(map[key] = ...)を使用。
	 */
	def method8(Map map, key, value) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map[key] = value
		return map
	}
	/**
	 * マップmapに、キーがkey, 値がvalueであるようなエントリを追加する。
	 * GStringを用いたプロパティの記法(map."$xxx" = ...)を使用。
	 */
	def method9(Map map, key, value) {
		// [Question]穴埋め問題: ここを埋めて下さい。
		map."$key" = value
		return map
	}
}
