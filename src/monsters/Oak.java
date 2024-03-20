package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	//引数にnameとweaponをもつコンストラクタ
	public Oak(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(170, 230);
		//攻撃力にも乱数を振って定義
		int offensive = Dice.get(9, 15);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}