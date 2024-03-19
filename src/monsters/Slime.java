package monsters;

import utils.Dice;

public class Slime extends bases.Monster {
	//引数にnameとweaponをもつコンストラクタ
	public Slime(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(70, 130);
		//攻撃力にも乱数を振って定義
		int Offensive = Dice.get(5, 11);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}
