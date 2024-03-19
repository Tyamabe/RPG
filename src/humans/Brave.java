package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {
	//引数にnameとweaponをもつコンストラクタ
	public Brave(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(170, 230);
		//攻撃力にも乱数を振って定義
		int offensive = Dice.get(7, 13);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}
