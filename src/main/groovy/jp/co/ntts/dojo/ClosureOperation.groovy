package jp.co.ntts.dojo

/**
 * コレクション操作。
 * 参考: プログラミングGroovy p99、p182
 */
class ClosureOperation {

	/**
	 * "hello"を返すクロージャを呼び出す。
	 */
	def method1() {
		Closure c // = ... [Question]穴埋め問題: ここを埋めて下さい。
		return c.call()  // もしくはc()
	}

	/**
	 * 引数を二倍するクロージャを呼び出す。
	 */
	def method2(n) {
		Closure c // = ... [Question]穴埋め問題: ここを埋めて下さい。
		return c(n)
	}

	/**
	 * 引数を自乗するクロージャを呼び出す。暗黙の引数「it」を使用する。
	 */
	def method3(n) {
		Closure c // = ... [Question]穴埋め問題: ここを埋めて下さい。
		return c(n)
	}

	/**
	 * 引数を自乗するクロージャを返す。
	 */
	def method4() {
		return // [Question]穴埋め問題: ここを埋めて下さい。
	}

	/**
	 * 引数に渡されたクロージャを呼び出し、その結果を返す。
	 */
	def method5(Closure c) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}
	/**
	 * 引数に渡されたクロージャを呼び出し、その結果
	 * に引数nを加えたものを返す。
	 */
	def method6(n, Closure c) {
		// [Question]穴埋め問題: ここを埋めて下さい。
	}
}
