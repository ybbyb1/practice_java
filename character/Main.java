package basic.character;

public class Main {

	public static void main(String[] args) {
//		Character yoshida = new Character();
		//前提
		//•	外部（Main）からキャラを動かしたい
		//•	名前は取得できるようにしたい
		//•	count は外から読めてもいい
		Character yoshida = new Character();//名無し形式、何でエラー？
		String charaName = yoshida.getName();
		System.out.println(yoshida.getCount());
		//•	内部処理は隠したい→実装側隠せてなくね？protectとかパッケージprivateにする？
		
		
		
	}

}
