// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static void PlayerData(String name,Charactor player){
        System.out.println(player+" - status");
        System.out.println("Hp : "+player.hp);
        System.out.println("Damage : "+player.damage);
        System.out.println("Defense : "+player.defense);
        System.out.println("Speed : "+player.speed);
    }
    public static void main(String[] args)
    {
        String name1 = "Bob";
        String name2 = "Alice";

        Charactor p1 = new Charactor(10, 20, 15, 8);
        Charactor p2 = new Charactor(10, 18, 12, 10);

        PlayerData(name1, p1);
        PlayerData(name2, p2);

        Fight(name1,name2,p1,p2);

    }
    static void Attack(String attackerName,String defenderName,Charactor attacker, Charactor defender){
        double attack = attacker.damage - defender.defense;
        defender.hp -= attack;
        System.out.println(attackerName + " attacks " + defenderName + " and deals " + attack + " damage.");

    }


    static void Fight(String player1Name,String player2Name,Charactor player1, Charactor player2) {
        System.out.println(player1Name + " vs " + player2Name);
        // Player 1 faster than Player 2
        if(player1.speed>player2.speed) {
            while (player1.hp > 0 && player2.hp > 0) {
                Attack(player1Name,player2Name,player1,player2);
                if (player2.hp <= 0) {
                    System.out.println(player2Name + " is defeated!");
                    break;
                }

                Attack(player2Name,player1Name,player2,player1);
                if (player1.hp <= 0) {
                    System.out.println(player1Name + " is defeated!");
                    break;
                }
            }
        }

        // Player 2 faster than Player 1
        else if(player2.speed>player1.speed) {
            while (player1.hp > 0 && player2.hp > 0) {
                Attack(player2Name,player1Name,player2,player1);
                if (player1.hp <= 0) {
                    System.out.println(player1Name + " is defeated!");
                    break;
                }

                Attack(player1Name,player2Name,player1,player2);
                if (player2.hp <= 0) {
                    System.out.println(player2Name  + " is defeated!");
                    break;
                }
            }
        }

        // Player 2 speed same as Player 1
        else{
            while (player1.hp > 0 && player2.hp > 0) {
                Attack(player1Name,player2Name,player1,player2);
                Attack(player2Name,player1Name,player2,player1);
                // Draw
                if(player1.hp <= 0 && player2.hp<=0) {
                    System.out.println("It a draw!");
                    break;
                }
                // Check if Player 1 is defeated
                else if (player1.hp <= 0) {
                    System.out.println(player1Name + " is defeated!");
                    break;
                }
                // Check if Player 2 is defeated
                else {
                    System.out.println(player2Name + " is defeated!");
                    break;
                }
            }
        }

        System.out.println("Fight Ended.");
    }
}