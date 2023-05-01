package constants;

import java.awt.Image;
import java.util.Random;

import javax.swing.JLabel;

import inventory.Storage;

public class Enemies {

	private int hp;
	private int maxHP;
	private int strength;
	private int expValue;
	private int coinValue;
	private int currentStage;
	private static boolean bossActive, strongEnemyActive;
	private String enemyName;
	private Image enemyIdle, enemyAttack;
	protected JLabel lblEnemyHP;
	private Random rand = new Random();
	private Storage s = Storage.getInstance();
	
	public void enemyShowHP(JLabel lblEnemyHP) {
		lblEnemyHP.setText("HP: " + String.valueOf(getHp()));
	}
	
	public void enemyLoseHP(int dmg) {
		setHp(getHp() - dmg);
	}
	
	public void enemyOne() {
		switch(currentStage) {
		case 1:
			enemyName = "Baby spider";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSpoder.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSpoder.gif");
			maxHP = 20;
			hp = maxHP;
			strength = 2;
			expValue = 2;
			coinValue = 3;
			break;
		case 2:
			enemyName = "Wolf";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleWolf.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackWolf.gif");
			maxHP = 30;
			hp = maxHP;
			strength = 4;
			expValue = 5;
			coinValue = 6;
			break;
		case 3:
			if(rand.nextInt(2) == 0) {
				enemyName = "Baby spider";
				enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSpoder.gif");
				enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSpoder.gif");
				maxHP = 30;
				hp = maxHP;
				strength = 4;
				expValue = 7;
				coinValue = 8;
			}
			else {
				enemyName = "Wolf";
				enemyIdle = s.setAnimation("res/EnemyAnimations/IdleWolf.gif");
				enemyAttack = s.setAnimation("res/EnemyAnimations/AttackWolf.gif");
				maxHP = 40;
				hp = maxHP;
				strength = 6;
				expValue = 10;
				coinValue = 12;
			}
			break;
		}
	}
	
	public void enemyTwo() {
		switch(currentStage) {
		case 1:
			enemyName = "Goblin";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleGoblin.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackGoblin.gif");
			maxHP = 30;
			hp = maxHP;
			strength = 4;
			expValue = 4;
			coinValue = 5;
			break;
		case 2:
			enemyName = "Skeleton";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSkelly.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSkelly.gif");
			maxHP = 40;
			hp = maxHP;
			strength = 6;
			expValue = 8;
			coinValue = 10;
			break;
		case 3:
			if(rand.nextInt(2) == 0) {
				enemyName = "Goblin";
				enemyIdle = s.setAnimation("res/EnemyAnimations/IdleGoblin.gif");
				enemyAttack = s.setAnimation("res/EnemyAnimations/AttackGoblin.gif");
				maxHP = 40;
				hp = maxHP;
				strength = 6;
				expValue = 10;
				coinValue = 12;
			}
			else {
				enemyName = "Skeleton";
				enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSkelly.gif");
				enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSkelly.gif");
				maxHP = 50;
				hp = maxHP;
				strength = 8;
				expValue = 14;
				coinValue = 16;
			}
			break;
		}
	}
	
	public void strongEnemy() {
		if(currentStage == 1 || currentStage == 2 || currentStage == 3) {
			enemyName = "Fatlin";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleFatlin.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackFatlin.gif");
			maxHP = 50;
			hp = maxHP;
			strength = 6;
			expValue = 15;
			coinValue = 15;
		}
	}
	
	public void boss() {
		switch(currentStage) {
		case 1:
			enemyName = "Basic Sbeve";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSteve.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSteve.gif");
			maxHP = 80;
			hp = maxHP;
			strength = 8;
			expValue = 25;
			coinValue = 30;
			break;
		case 2:
			enemyName = "Stronger Sbeve";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSteve2.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSteve2.gif");
			maxHP = 110;
			hp = maxHP;
			strength = 10;
			expValue = 40;
			coinValue = 50;
			break;
		case 3:
			enemyName = "Angry Sbeve";
			enemyIdle = s.setAnimation("res/EnemyAnimations/IdleSteve3.gif");
			enemyAttack = s.setAnimation("res/EnemyAnimations/AttackSteve3.gif");
			maxHP = 150;
			hp = maxHP;
			strength = 14;
			expValue = 100;
			coinValue = 100;
			break;
		}
	}
	
	public boolean enemyAttack() {
		int x = rand.nextInt(10);
		if(x != 0 || x != 1 || x != 2)
			return true;
		else
			return false;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int enemyHP) {
		this.hp = enemyHP;
	}


	public int getStrength() {
		return strength;
	}

	public void setStrength(int enemyStrength) {
		this.strength = enemyStrength;
	}

	public int getExpValue() {
		return expValue;
	}

	public void setExpValue(int expValue) {
		this.expValue = expValue;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int enemyMaxHP) {
		this.maxHP = enemyMaxHP;
	}

	public int getCoinValue() {
		return coinValue;
	}

	public void setCoinValue(int coinValue) {
		this.coinValue = coinValue;
	}

	public Image getEnemyIdle() {
		return enemyIdle;
	}
	public Image getEnemyAttack() {
		return enemyAttack;
	}

	public void setCurrentStage(int currentStage) {
		this.currentStage = currentStage;
	}

	public String getEnemyName() {
		return enemyName;
	}

	public boolean isBossActive() {
		return bossActive;
	}

	public void setBossActive(boolean bossActive) {
		Enemies.bossActive = bossActive;
	}

	public boolean isStrongEnemyActive() {
		return strongEnemyActive;
	}

	public void setStrongEnemyActive(boolean strongEnemyActive) {
		Enemies.strongEnemyActive = strongEnemyActive;
	}
	
}
