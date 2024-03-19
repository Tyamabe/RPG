package humans;

import utils.Dice;

public class Wizard extends bases.Human {
	//引数にnameとweaponをもつコンストラクタ
	public Wizard(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(120, 180);
		//攻撃力にも乱数を振って定義
		int Offensive = Dice.get(12, 18);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}
