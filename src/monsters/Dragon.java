package monsters;

import utils.Dice;

public class Dragon extends bases.Monster {
	//引数にnameとweaponをもつコンストラクタ
	public Dragon(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(270, 330);
		//攻撃力にも乱数を振って定義
		int Offensive = Dice.get(12, 18);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}