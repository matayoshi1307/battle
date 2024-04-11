package sample;
    
/**
 *monsterを戦わせるクラスです。 
 */
public class Battle {	
    	
    public static void main(String[] args) {
    	
	    // monsterを戦わせる闘技場を作成する
	    Colosseum colosseum=new Colosseum();
	    
	    // 各monsterの情報を書いてます。	
        Monster monster1=new Monster("ヴァイス", "キメラ", 750, 450, 230, 350, 58);
        Monster monster2=new Monster ("ヴァレンタイン", "ヘルバウンド", 750, 460, 240, 360,62);
        
        // monster1とmonster2を戦わせる。
        colosseum.start(monster1, monster2);
    }			
}