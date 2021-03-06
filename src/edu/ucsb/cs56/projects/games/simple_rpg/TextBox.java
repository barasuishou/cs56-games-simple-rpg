package edu.ucsb.cs56.projects.games.simple_rpg;

/**Handles output for CLI implementation.
 * @author Alvin Tan
 *
 */
public class TextBox {
	public void printDefaultOptions(){
		System.out.println("1: Move Left");
		System.out.println("2: Move Right");
		System.out.println("3: Move Up");
		System.out.println("4: Move Down");
		System.out.println("5: Quit Game");
		System.out.println("***End Output***");
	}
	public void printBattleOptions(){
		System.out.println("1: Attack");
		System.out.println("2: Run Away");
		System.out.println("***End Output***");
	}
	public void printMCStatus(MainCharacter mc){
		System.out.println("~~~Info~~~");
		System.out.println("MainCharacter LV: "+mc.getLvl());
		System.out.println("HP: "+mc.getHp()+"/"+mc.getMaxHP()+" MP: "+mc.getMp()+"/"
							+mc.getMaxMP()+" XP: "+mc.getXp()+"/"+mc.getNeedXP());
		System.out.println("Gold: "+mc.getGold());
		System.out.println("Current Location: ("+mc.getX()+","+mc.getY()+")");
		System.out.println();
	}
	public void printEStatus(Enemy e){
		System.out.println(e.getName()+" LV: "+e.getLvl());
		System.out.println("HP: "+e.getHp()+"/"+e.getMaxHP()+" MP: "+e.getMp()+"/"
							+e.getMaxMP());
		System.out.println();
	}
	public void printReward(Enemy e){
		System.out.println("You gained "+e.giveReward().getXp()+" XP!");
		System.out.println("You got "+e.giveReward().getGold()+" gold!");
		System.out.println("~~~End Results~~~");
		System.out.println();
	}
	public void printStatOptions(){
		System.out.println("1: Add 1 Agility");
		System.out.println("2: Add 1 Inteligence");
		System.out.println("3: Add 1 Stamina");
		System.out.println("4: Add 1 Strength");
		System.out.println("***End Output***");
	}
}
