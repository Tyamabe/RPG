package humans;

import utils.Dice;

public class Fighter extends bases.Human {
	//引数にnameとweaponをもつコンストラクタ
	public Fighter(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(170, 230);
		//攻撃力にも乱数を振って定義
		int Offensive = Dice.get(7, 13);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}
