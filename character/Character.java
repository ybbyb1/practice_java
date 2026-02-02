package basic.character;

public class Character {//フィールドは基本private,外から触らせない
	private String name;
	private static int count; //クラス変数は定数と変わらない設定の時に使う。普通は使わない
	private String place;
//	Character(){
//		String name = "名無し";
//	}
	
	Character(String name){
		if(name == null || name.isEmpty()) {
			this.name = "名無し";
			count++;
		} else {
			this.name = name;
			count++;						
		}
	}
	
	void move() {
		System.out.println("<"+ name +">" + "moves");//ここのベストな書き方は？
	}
	
	void move(String place) {
		System.out.println("<" + name + ">" + "movbes to <" + place + ">");
	}
	
	static int getCount() { //わからん
		return count;
	}
	
	String getName() {//もし、Characterのnameを返したいとなったらこれ？
		return this.name;
	}
	
	private String setPlace(String place) {
		return this.place = place;
	}
	
	static void moveAll(Character[] characters) {
		for(Character character : characters) {
			character.move();
		}
	}
}
