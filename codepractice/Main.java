package basic.codepractice;

import java.util.Scanner;

public class Main {
	private int num = 11;
	private String name;
	
	int getScore() {
		return num;
	}
//	・配列型の宣言、多次元配列
//	・クラス周り
//		・配列型の使い方、ArrayListとの違い、使い方
//		・スキャナーの使い方(標準受け取り)、argsの使い方
//		・フィールド、ローカル変数など各用語
//		・eclipseでのパッケージの話
//	　・型変換（プリミティブ型（小→大、大→小、ラッパークラス、オートボクシング））、
//	　　型変換(参照型（小→大、大→小、フィールド,メソッド、オーバーライド、static）)
//	　　多態性（ポリモーフィズム）
//	　・メソッド（戻り値あり、なし、引数あり、なし。配列で受け取るやつ）
//	・メソッドできること
//	　・戻り値なし、処理、フィールドに渡す、計算、別メソッド呼び出しとかインスタンスに値渡すとか（移譲）
//	 　・戻り値あり、戻り値があることと上と同じ
//	  　・設計的には内部処理メソッドと受け渡し窓口メソッドで分けた方がいいっぽい、があとででいい
	void hogeHoge() {
		System.out.println("hogehoge");
	}
	
	void setScore(int newScore) {
		this.num = newScore;
	}
	
	String getHobby(String name) {
		String gattaiName = name + "さん";
		System.out.println(gattaiName);
	}
	
	String getName() {
		return name;
	}
	
	String hogehoge(String name, int hoge) {
		System.out.println(name + hoge +"さん");
	}
	//戻り値２つは？２つの引数の場合
		//→元コードは訳分からんけど配列、クラス、Mapにしなきゃダメ（型重視でクラス）
	String, Integer hogefuga(String name, int age) {
		this.name = name;
		this.age    = age;
		return name + "さん";
	}
	
//もやってること
//・メソッドの修飾子の話
//　・実行メソッドと呼び出しめそっどで分けた方がいいらしい（リスクと拡張性）
// 	→設計の順番
// 		・日本語で流れを書く、名詞（クラス）を書く、動詞（メソッド）をかく、部屋（パッケージ）を決める
//・アクセス修飾子それぞれの効能、フィールド、メソッド、クラス、コンストラクタそれぞれに何つけるか問題

	
//	　・それぞれのアクセス修飾子（フィールド、メソッド、クラス、継承前提の親と子（要件によるかもだけど）、インターフェース（実装側、使う側）、抽象クラス（実装側、使う側）その他）
//	　・コンストラクタ
//	　・アクセサメソッド
//	　・this,super（コンストラクタ連鎖）、コンストラクタとメンバーそれぞれ
//	  ・継承（抽象クラス、staticが絡むとどうなるか）、インターフェース。オーバーライド、オーバーロード
//	  ・値渡しと参照渡しの考え方、Stringクラス、StringBuilderクラス
//	  ・可変長引数
//	  ・例外（非検査例外、検査例外。try-catch-finally,throw,throws、
//	  それぞれが絡んだ例外の書き方全般やJavaAPIの見方。独自例外クラス、）
	
	public static void main(String[] args) {
		//TODO:eclipse含め命名規則
//		TODO:デバック
//		・プリミティブ型の変換（アップとダウン）
		int number = 10;//TODO:プリミティブ型の逆になる変換と何が小数か、小数型に整数入れた時と小数から整数型に入れた時
		int num;
		num = 10;
		
		byte hoge;
		hoge = 1;
		
		
//		・基礎構文まわり（ループ系、インクリメント、break,continue,parseIntなど）
		if(num > hoge) {
			num += 1;
		} else if(num < hoge) {
			num += 2;
		} else {
			num += 3;
		}
		
//		・for文の使い所、拡張for文の使い所
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
//			System.out.println( i + "かいめ:" + sum);
		}
		
		int[] checkNums = {1,3,4,5,6};
		for(Integer checkNum : checkNums) {
			System.out.println(checkNum);		
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("パスワードを入力してください");
		String str = in.nextLine();
		
		while(!str.equals("abc")) {
			str = in.nextLine();
		}
		
		
  
	}

}
