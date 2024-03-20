package bases;

import utils.Dice;

public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
		}
	
	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		//引数でもらったLiving型のtargetインスタンスを攻撃する相手のインスタンスとします(←？)
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする 
		int diceResult = Dice.get(1, 10);
		int damage = diceResult * getOffensive();
		// 相手のHPをダメージ値だけ減らす ※ターゲットの表現方法がわからず後回し
		int damagedHp = target.getHp() - damage;
        if (damagedHp <= 0) {
            damagedHp = 0; // HPが0未満にならないように調整
            System.out.println("★" +target.getName() + "は倒れた！");
        }
        target.setHp(damagedHp);
		// 自分の攻撃力を1だけ減らす ※自分の攻撃力の表現方法がわからず後回し
		this.setOffensive(this.getOffensive() - 1);
		// コンソールにステータスを表示
		System.out.println("「" + this.name + "」が「" + this.weapon + "」 で攻撃！「" + target.name + "」に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}
