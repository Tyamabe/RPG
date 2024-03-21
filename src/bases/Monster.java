package bases;

import utils.Dice;

//モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド　※Humanと全く同様にオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする 
		int diceResult = Dice.get(1, 10);
		int damage = diceResult * getOffensive();
		// ターゲットに与えるダメージを算出(ダメージを与えられた後のターゲットのHPを算出)
		int damagedHp = target.getHp() - damage;
        target.setHp(damagedHp);
		// モンスターは攻撃力が減らない！！
		// コンソールにステータスを表示
		System.out.println("「" + this.name + "」が「" + this.weapon + "」 で攻撃！「" + target.name + "」に" + damage + "のダメージを与えた。");
	}
}
