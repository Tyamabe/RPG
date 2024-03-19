package monsters;
import utils.Dice;

public class Oak extends bases.Monster {
	//引数にnameとweaponをもつコンストラクタ
	public Oak(String name, String weapon) {
		super(name, weapon);
		//ヒットポイントには乱数を振って定義
		int hp = Dice.get(170, 230);
		//攻撃力にも乱数を振って定義
		int Offensive = Dice.get(9, 15);
		//定義した乱数をフィールドに設定
		this.setHp(hp);
		this.setOffensive(offensive);
	}
}