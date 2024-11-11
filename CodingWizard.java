import java.util.Random;
import java.util.Scanner;

public class CodingWizard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Enemy enemy1 = new Enemy(35, 10, new Weapon("Sword", 2), "Guard Danny");
		Enemy enemy2 = new Enemy(25, 10, new Weapon("Big Stick", 1.75), "Guard Noob");
		TheWizard wiz = new TheWizard();
//		Enemy enemy2 = new Enemy (50, 10, new Weapon(""))
		startingCell(wiz);
		System.out.println("You encounter a guard right outside of your cell!");
		fight(enemy2, wiz);
		ozzyRiddle(wiz, 1);
		hallway(wiz);
//		System.out.println("You encounter a guard named Danny! Prepare to fight.");
//		fight(enemy1, wiz);
//		System.out.println("After defeating Danny, ");
//		fight(enemy2, wiz)
//		startingCell();
//		hallway();
//		courtyard();
//		bossfight();
	}

	public static void startingCell(TheWizard wiz) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Adventures of Coding Wizard!");
		System.out.println("                    ____ \r\n"
				+ "                  .'* *.'\r\n"
				+ "               __/_*_*(_\r\n"
				+ "              / _______ \\\r\n"
				+ "             _\\_)/___\\(_/_ \r\n"
				+ "            / _((\\- -/))_ \\\r\n"
				+ "            \\ \\())(-)(()/ /\r\n"
				+ "             ' \\(((()))/ '\r\n"
				+ "            / ' \\)).))/ ' \\\r\n"
				+ "           / _ \\ - | - /_  \\\r\n"
				+ "          (   ( .;''';. .'  )\r\n"
				+ "          _\\\"__ /    )\\ __\"/_\r\n"
				+ "            \\/  \\   ' /  \\/\r\n"
				+ "             .'  '...' ' )\r\n"
				+ "              / /  |  \\ \\\r\n"
				+ "             / .   .   . \\\r\n"
				+ "            /   .     .   \\\r\n"
				+ "           /   /   |   \\   \\\r\n"
				+ "         .'   /    b    '.  '.\r\n"
				+ "     _.-'    /     Bb     '-. '-._ \r\n"
				+ " _.-'       |      BBb       '-.  '-. \r\n"
				+ "(________mrf\\____.dBBBb.________)____)");
		System.out.println("Hit enter to begin.");
		input.nextLine();
		
		System.out.println("You have awoken in a dark cell. "
				+ "\nEnter to continue.");
		input.nextLine();	
		System.out.println("You look around and realize the walls are made of chocolate!");
		input.nextLine();
		System.out.println("You're imprisoned in the king's chocolate castle!");
		System.out.println("                           o                    \r\n"
				+ "                       _---|         _ _ _ _ _ \r\n"
				+ "                    o   ---|     o   ]-I-I-I-[ \r\n"
				+ "   _ _ _ _ _ _  _---|      | _---|    \\ ` ' / \r\n"
				+ "   ]-I-I-I-I-[   ---|      |  ---|    |.   | \r\n"
				+ "    \\ `   '_/       |     / \\    |    | /^\\| \r\n"
				+ "     [*]  __|       ^    / ^ \\   ^    | |*|| \r\n"
				+ "     |__   ,|      / \\  /    `\\ / \\   | ===| \r\n"
				+ "  ___| ___ ,|__   /    /=_=_=_=\\   \\  |,  _|\r\n"
				+ "  I_I__I_I__I_I  (====(_________)___|_|____|____\r\n"
				+ "  \\-\\--|-|--/-/  |     I  [ ]__I I_I__|____I_I_| \r\n"
				+ "   |[]      '|   | []  |`__  . [  \\-\\--|-|--/-/  \r\n"
				+ "   |.   | |' |___|_____I___|___I___|---------| \r\n"
				+ "  / \\| []   .|_|-|_|-|-|_|-|_|-|_|-| []   [] | \r\n"
				+ " <===>  |   .|-=-=-=-=-=-=-=-=-=-=-|   |    / \\  \r\n"
				+ " ] []|`   [] ||.|.|.|.|.|.|.|.|.|.||-      <===> \r\n"
				+ " ] []| ` |   |/////////\\\\\\\\\\\\\\\\\\\\.||__.  | |[] [ \r\n"
				+ " <===>     ' ||||| |   |   | ||||.||  []   <===>\r\n"
				+ "  \\T/  | |-- ||||| | O | O | ||||.|| . |'   \\T/ \r\n"
				+ "   |      . _||||| |   |   | ||||.|| |     | |\r\n"
				+ "../|' v . | .|||||/____|____\\|||| /|. . | . ./\r\n"
				+ ".|//\\............/...........\\........../../\\\\\\");
		input.nextLine();
		System.out.println("You look to your right and see no other than Ozzy Osbourne in the bed next to you.");
		input.nextLine();
		System.out.println("                   ___.-----------.___\r\n"
				+ "               _.-'                   `-.\r\n"
				+ "             .'                          `.\r\n"
				+ "            /                              \\\r\n"
				+ "           /           `  ._        .       `\r\n"
				+ "         .'         )   `   `------' `---    |\r\n"
				+ "        |           |    `._  `-----..       |\r\n"
				+ "        | `         `-  ____.----' '   `.   '|\r\n"
				+ "        |   .         .'                 `--'|\r\n"
				+ "        |`   `-.  `._/                  .|--'|\r\n"
				+ "        | `      -. /   .=====._     .===| _.|\r\n"
				+ "        |   `   |  '   \" <(@)>  ,  (/(@)>|  /\r\n"
				+ "        \\ `     \\               '  |     |_/\r\n"
				+ "         \\  `    %>                |    |\r\n"
				+ "          \\      |   |      . . .  |    |\r\n"
				+ "           `._   |       ..'  `.__.'   /\r\n"
				+ "              `-| \\      ``---------  /\r\n"
				+ "               /|  `.      `..___..' /\r\n"
				+ "              / `-   `-_     `---'  /\r\n"
				+ "            _.    `-.   `-._      .'\r\n"
				+ "         _.'         `-.    `----'_\r\n"
				+ "     __.'               `-._    .'|\r\n"
				+ "__.-'                       `-.'  |\r\n"
				+ "                              |   `.\r\n"
				+ "                              |     `-.\r\n"
				+ "                              |        `-._\r\n"
				+ "                              |            `-._\r\n"
				+ "                              |                `\r\n"
				+ "                              |");
		System.out.println("Ozzy says, 'Hey, you. You're finally awake.'"
				+ "\n'That's an ugly ass hat man, what's up with that?'");
		input.nextLine();
		System.out.println("Ozzy seems to have challenged you!"
				+ "\nType 1 to fight. \nType 2 to offer him a bat head.");
		int choice1 = input.nextInt();
		if (choice1 == 1) {
			Enemy ozzy = new Enemy(50, 10, new Weapon("Guitar Axe", 10), "Ozzy Osbourne");
			ozzy.setName("Ozzy");
		//	ozzy.setWeapon("Guitar Axe");
			ozzy.setDoubloons(40);
			while (wiz.getHp() > 0 && ozzy.getHp() > 0) {
				fight(ozzy, wiz);
			}
			System.out.println("Ozzy's ghost appears. He says, 'Since you proved yourself, I have a gift for you.'");
		}
		else {
			System.out.println("Ozzy graciously accepts the bat head and stashes it under his pillow."
					+ "\nOzzy says, 'Thanks, man. I take it back, that hat's dope.'");
		}
		System.out.println("Ozzy hands you a piece of paper. It says, 'The answer is within the walls.'");
		System.out.println("_|_1_|___|___|___|___|___|___|___|___|_3_|___|___|___|___|___|___|___|\r\n"
				+ "___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__\r\n"
				+ "_|___|___|___|___|___|_2_|___|___|___|___|___|___|___|___|___|_7_|___|\r\n"
				+ "___|___|_6_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|__\r\n"
				+ "_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|\r\n"
				+ "___|___|___|___|_5_|___|___|___|___|___|___|___|___|_4_|___|___|___|__\r\n"
				+ "_|___|_10_|___|___|___|___|_9_|___|___|___|___|___|___|___|___|_8_|___|");
		int brick;
		boolean brickSolve = false;
		while (brickSolve == false) {
			brick = input.nextInt();
			if (brick == 4) {
				brickSolve = true;
			}
			else {
				System.out.println("You chisel away at the brick to reveal nothing. Try again.");
			}
		}
		System.out.println("You find a key to unlock the cell door!");
		
	}
	
	public static void ozzyRiddle(TheWizard wiz, int riddleNum) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ozzy appears out of thin air! Here's Ozzy!!!!");
		System.out.println("                   ___.-----------.___\r\n"
				+ "               _.-'                   `-.\r\n"
				+ "             .'                          `.\r\n"
				+ "            /                              \\\r\n"
				+ "           /           `  ._        .       `\r\n"
				+ "         .'         )   `   `------' `---    |\r\n"
				+ "        |           |    `._  `-----..       |\r\n"
				+ "        | `         `-  ____.----' '   `.   '|\r\n"
				+ "        |   .         .'                 `--'|\r\n"
				+ "        |`   `-.  `._/                  .|--'|\r\n"
				+ "        | `      -. /   .=====._     .===| _.|\r\n"
				+ "        |   `   |  '   \" <(@)>  ,  (/(@)>|  /\r\n"
				+ "        \\ `     \\               '  |     |_/\r\n"
				+ "         \\  `    %>                |    |\r\n"
				+ "          \\      |   |      . . .  |    |\r\n"
				+ "           `._   |       ..'  `.__.'   /\r\n"
				+ "              `-| \\      ``---------  /\r\n"
				+ "               /|  `.      `..___..' /\r\n"
				+ "              / `-   `-_     `---'  /\r\n"
				+ "            _.    `-.   `-._      .'\r\n"
				+ "         _.'         `-.    `----'_\r\n"
				+ "     __.'               `-._    .'|\r\n"
				+ "__.-'                       `-.'  |\r\n"
				+ "                              |   `.\r\n"
				+ "                              |     `-.\r\n"
				+ "                              |        `-._\r\n"
				+ "                              |            `-._\r\n"
				+ "                              |                `\r\n"
				+ "                              |");
		System.out.println("Ozzy asks, 'I see you could use a hand, young wiz."
				+ "\nWould you like to solve a riddle for a prize?"
				+ "\nType 1 for 'Yes.' Type 2 for 'No.'");
		int riddleChoice = input.nextInt();
		String riddleAnswer;
		boolean correct = false;
		if (riddleChoice == 1) {
			if (riddleNum == 1) {
				System.out.println("Ozzy slurs, " + "\nWhat always runs but never walks.\r\n" + "\r\n"
						+ "Often murmurs, never talks.\r\n" + "\r\n" + "Has a bed but never sleeps.\r\n" + "\r\n"
						+ "An open mouth that never eats?");
				riddleAnswer = input.next();
				if (riddleAnswer.equalsIgnoreCase("river") | riddleAnswer.equalsIgnoreCase("a river")) {
					correct = true;
				}
			}
			else if (riddleNum == 2) {
				System.out.println(" Ozzy slurs, \nI don't have eyes,\r\n"
						+ "\r\n"
						+ "But once I did see.\r\n"
						+ "\r\n"
						+ "I once had thoughts,\r\n"
						+ "\r\n"
						+ "Now white and empty.\"");
				riddleAnswer = input.next();
				if (riddleAnswer.equalsIgnoreCase("skull") | riddleAnswer.equalsIgnoreCase("a skull")) {
					correct = true;
				}
			}
			
			if (correct == true) {
				Random rand = new Random();
				int prize = rand.nextInt(5)+1;
				Weapon prizeStr;
				if (prize == 1) {
					prizeStr =  new Weapon ("Shank", 1.5);
				}
				else if (prize == 2) {
					prizeStr = new Weapon ("Big Stick", 1.75);
				}
				else if (prize == 3) {
					prizeStr = new Weapon ("Sword", 2);
				}
				else if (prize == 4) {
					prizeStr = new Weapon ("Axe Guitar", 10);
				}
				else {
					prizeStr = new Weapon ("Sword Of A Thousand Truths", 1000);
				}
				System.out.println("Ozzy says, 'Your wits are as impressive as your beard!"
						+ "\nYou win a " + prizeStr + "!");
				wiz.setWeapon(prizeStr);
			}
			else {
				System.out.println("Ozzy says, You failed to answer the riddle correctly :(. You may receive another chance later.");
			}
		}
		System.out.println("Ozzy stumbles away in a drunken stupor.");
		
	}
	public static void hallway(TheWizard wiz) {
        Enemy mc = new Enemy(30, 10, new Weapon("shank", 1.5), "Michael Cera" );
        Enemy guard = new Enemy(25, 10, new Weapon("fists", 1), "Guard Danny");
        wiz.setHp(100);
        System.out.println("Ozzy appears and heals you" + "\n HP: " + wiz.getHp() + "\n");
        System.out.println("you have now entered a long hallway. \n"
                + "At the end, there is a guard named Danny with a key to the exit door \n"
                + "You must defeat Danny to continue");
//        System.out.println("From the shadows appears a guard! He challenges you...");
        fight(guard, wiz);
        ozzyRiddle(wiz, 2);
        if(wiz.getHp() > 0) {
            wiz.setHp(100);
            System.out.println("Ozzy heals you" + "\n HP: " + wiz.getHp() + "\n");
            System.out.println("Now you must defeat Michael Cera to exit the hallway, \n"
                    + "and escape the hellish chocolate prison forever!");
            fight(mc, wiz);
            System.out.println("You have defeated Michael Cera and successfully escaped! You Win!!");
        }
    }

	public static void fight(Enemy enemy, TheWizard wiz) {
		
		
		Scanner input = new Scanner(System.in); 
//		Weapon wizWeapon = wiz.getWeapon();
//        Weapon enemyWeapon = enemy.getWeapon();
		while (enemy.getHp() > 0 && wiz.getHp() > 0) {// added for multiple actions in fight
			System.out.println("Roll to see who strikes.");
			boolean win;
			input.nextLine();
			
			int roll = diceRoller();
			double damage = 0;
			if (roll > 5) {
				System.out.println("You rolled a " + roll + ". Coding Wizard lands a strike! Roll for damage.");
				input.nextLine();
				win = true;
				// roll = diceRoller();
				// System.out.println("You rolled a " + roll + "!");
				damage = wiz.getWeapon().damage();
				enemy.damageDone(damage);
				System.out.println("Coding Wizard " + wiz.getWeapon().attackString(damage));
				
				if (enemy.getHp() > 0) {
					System.out.println(enemy.getName() + " HP is now " + enemy.getHp() + ". "
							+ "Coding wizard HP is " + wiz.getHp()
					);
				}
				if (enemy.getHp() < 0) {
					System.out.println("You have vanquished " + enemy.getName() + "!");
					dropLoot(enemy, wiz);
				}
			} else {
				System.out.println("You rolled a " + roll + ", so " + enemy.getName() +" has landed a strike!");
				win = false;
				// roll = diceRoller();
				// System.out.println(enemy.getName() + " rolled a " + roll + "!");
				damage = enemy.getWeapon().damage();
				wiz.damageDone(damage);
				System.out.println(enemy.getName() + enemy.getWeapon().attackString(damage));
				System.out.println("Your HP is now " + wiz.getHp() + ", " + enemy.getName() + " has " + enemy.getHp() + " hit points.");
			}
		} // added for while end
		if (enemy.getHp() < 1) { // 46 through 51 added
			System.out.println("You killed " + enemy);
			
		
		
		}if (wiz.getHp() < 1) {
			System.out.println("You died!");
		}

//            you do damage

	}

	public static int diceRoller() {
		Random dice = new Random();
		int diceRoll = dice.nextInt(10) + 1;
		return diceRoll;
	}

	public static void dropLoot(Enemy enemy, TheWizard wiz) {
//		String weapon = wiz.getWeapon();
		if (enemy.getWeapon().getDamageMult() > wiz.getWeapon().getDamageMult()) {
			wiz.setWeapon(enemy.getWeapon());
			enemy.setWeapon(null);
			System.out.println("You loot your enemy's corpse and see that he has dropped a " + enemy.getWeapon()
			+ ". It is more powerful as your " + wiz.getWeapon() + " so you pick it up.");
		}
		System.out.println("You loot your enemy's corpse and see that he has dropped a " + enemy.getWeapon()
				+ ". It is not as powerful as your " + wiz.getWeapon() + " so you leave it.");
	}
}
