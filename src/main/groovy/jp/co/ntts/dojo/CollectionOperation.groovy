package jp.co.ntts.dojo

/**
 * コレクション操作。
 * 参考: プログラミングGroovy p99、p182
 */
class CollectionOperation {

	/**
	 * 引数として与えられたコレクションの合計を返す。
	 */
	def method1(collection) {
		def total = 0
		collection.each { total += it } // Answer 別解: injectを使う
		total
	}

	/**
	 * コレクションの要素をそれぞれ3倍したものからなるコレクションを返す。
	 * [1,2,3] ==> [3, 6, 9]
	 */
	def method2(collection) {
		collection.collect { it * 3 } // Answer
	}

	/**
	 * コレクションの要素のうち2の倍数からなるコレクションを返す。
	 * [1,2,3,4] ==> [2, 4]
	 */
	def method3(collection) {
		collection.findAll { it % 2 == 0 } // Answer 別解: grepを使う
	}

	/**
	 * コレクションの要素のうち2の倍数である最初の要素を返す。
	 * [1,2,3,4] ==> 2
	 */
	def method4(collection) {
		collection.find { it % 2 == 0 } // Answer
	}

	/**
	 * 引数に渡されたコレクションcollectionに、引数elemが含まれているかどうかを返す。
	 * in演算子を使用。
	 */
	def method5(collection, elem) {
		elem in collection  // Answer
	}
}
