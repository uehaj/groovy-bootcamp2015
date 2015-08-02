package jp.co.ntts.dojo
import groovy.transform.*

@EqualsAndHashCode
class Person {
	Integer age
	String name

	// Groovyでは、明示的にコンストラクタを定義しない場合、
	// 暗黙にMapを引数として取る以下のようなコンストラクタが
	// 内部的に生成される。(ただし以下のコードはイメージであり、正確に同じではない)
	// Person(Map m) {
	//  this.age = m.age
	//  this.name = m.name
	// }
}

/**
 * 「フィールド初期化をマップ引数を使って行うコンストラクタ」の呼び出し、
 * および名前引数でのメソッド呼び出し。
 * 参考: プログラミングGroovy p49
 */
class OtherOperation {

	/**
	 * 暗黙のコンストラクタを使ってインスタンスを作成する。
	 * Personのインスタンス作成(コンストラクタの呼び出し)はJava同様
	 * new Person() なので、これに引数としてMapを与えてやればよい。
	 * プログラミングGroovy p49
	 */
	def method1(name, age){
		// [Question]穴埋め問題: ここを埋めて下さい。
		new Person( name:name, age:age )
	}

	/**
	 * 名前引数でのメソッドの呼び出し。
	 * namedArgMethodを、名前引数hogeにaを、名前引数fugaに
	 * bを与えて呼び出す。
	 */
	def namedArgMethod(Map m) {
		m.hoge + m.fuga
	}

	def method2(a, b){
		// [Question]穴埋め問題: ここを埋めて下さい。
		namedArgMethod( hoge:a, fuga:b )
	}
}
