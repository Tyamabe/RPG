package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {
	//引数にnameとweaponをもつコンストラクタ
	public Fighter(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(240, 300);
		//攻撃力にも乱数を振って定義
		int offensive = Dice.get(17, 23);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}
