

public class Charactor {
    int level;
    double damage,defense,speed,baseSpeed,hp;
    float swordDamage,shieldDefense;
    Charactor(int level, int swordDamage,int shieldDefense,int baseSpeed){
        this.level = level;
        this.swordDamage = swordDamage;
        this.shieldDefense = shieldDefense;
        this.baseSpeed = baseSpeed;

        hp=100+10*level;
        damage = swordDamage*(1+0.1*level);
        defense = shieldDefense*(1+0.05*level);
        speed = baseSpeed*(0.1+0.08*level);
    }
    Charactor(int level, int swordDamage,int baseSpeed){
        this.level = level;
        this.swordDamage = swordDamage;
        this.baseSpeed = baseSpeed;
        hp=100+10*level;
        damage = swordDamage*(1+0.1*level);
        defense = shieldDefense*(1+0.05*level);
        speed = baseSpeed*(0.1+0.04*level);
    }

    Charactor(int level, int baseSpeed){
        this.level = level;
        this.baseSpeed = baseSpeed;
        hp=100+10*level;
        damage = swordDamage*(1+0.1*level);
        defense = shieldDefense*(1+0.05*level);
        speed = baseSpeed*(0.1+0.03*level);
    }


}
