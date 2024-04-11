package sample;

public class Colosseum {

	/**
	 * 対戦を開始する
	 * @param monster1 １匹目のモンスター
	 * @param monster2 ２匹目のモンスター
	 */
	public void start(Monster monster1, Monster monster2) {
        // monsterどちらかがたおれるまで戦う。
	    for(;!monster1.isDead() && !monster2.isDead();) {
		         
	        if(monster1.speed>monster2.speed) {
	        	// --monste1がmonster2より速い場合--
	        	
		        // monster1から攻撃する。
		        monster1.attack(monster2);
	          
	            if(!monster2.isDead()) {
	                // monster2が攻撃で倒れていなければ、 反撃する。
		            monster2.attack(monster1);
	            } else {  
                    // monster2が倒れたなら、戦いは終わり。
	                return;
	            }
	          
	        } else if(monster1.speed<monster2.speed) {
	            // --monste2がmonster1より速い場合--
	        	
		        // monster2から攻撃する。
		        monster2.attack(monster1);
		  
	                if(!monster1.isDead()) {
	                    // monster1が攻撃で倒れていなければ、反撃する。   
	    	            monster1.attack(monster2);
	    	        } else {
	                // monster1が倒れたなら、戦いは終わり。  
	    	        return; 
	            }
	        }
        }  	
    }	
}