package sample;

import java.util.Random;
        

/**
 * Monster生成用クラスです。
 */
public class Monster {
	
	/**
	 * monsterの名前
	 */
	public String name;
	public String species;
	public int hitpoint;
	public int lowattack;
	public int highattack;
	public int defence;
	public int speed;
	
	public Monster(String name,String species,int hitpoint, int lowattack,int highattack, int defence,int speed) {
		//これから使うフィールドを作ってます。
		this.name = name;
		this.species=species;
		this.hitpoint=hitpoint;
		this.lowattack=lowattack;
		this.highattack=highattack;
		this.defence=defence;
		this.speed=speed;
		
	}
	
    /**
     * monsterがmonsterを攻撃します
     * @param monster 攻撃対象のモンスター
     * 
     */
    void attack(Monster monster) {
	// attackのランダム性を作るため、ランダムオブジェクトを生成しています。
	Random random = new Random();
	// 弱攻撃と強攻撃をランダムにしたいので、ランダムの候補を二個にしてます。
	int flag = random.nextInt(2);
	if(flag == 0) {
		// --弱攻撃の場合--
			
		// hitpointから弱攻撃分のダメージを与える。
		monster.hitpoint -= this.lowattack;
		// hitpointが0以下になると、monsterのhitpointは均一で0になります。
		if(monster.hitpoint<=0) monster.hitpoint=0;
			
		System.out.println(monster.name+"に"+this.lowattack+"のダメージ");
	} else if (flag == 1) {
		// --強攻撃の場合--
		
		// hitpointから強攻撃分のダメージを与える.
		monster.hitpoint -= highattack;
			
		if(monster.hitpoint<=0) { 
		// hitpointが0以下になると、monsterのhitpointは均一で0になります。	
			monster.hitpoint=0;
		}
			
		System.out.println(monster.name+"に"+this.highattack+"のダメージ");
	}
		
		System.out.println(monster.name+"の残りHPは"+monster.hitpoint);
	}
    
    
    /**
     * monsterが倒されたか判別する。
     * @return monsterが倒されたらtrue 
     */
    boolean isDead() {
    	
    	// monsterの戦いの勝敗を付けるため
		if(this.hitpoint<=0) {
			
			System.out.println(this.name+"が倒されました");	
			// 倒された場合はtrue
			return true;
			
		}
	    // 倒されていない場合はfalse
		return false;
		  
	}

}
