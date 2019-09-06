import java.util.Scanner;
public class Main {
    // Week 1 Challenge
    // Haunted House Adventure game
    public static Scanner keyboard = new Scanner(System.in);
    public static String userResp = "";
    public static String status = "You are Still Alive! \n";

    public static void main(String[] args) {
        // Greet User to Game
        System.out.println("Are you ready to begin a Haunted House Adventure?(Y/N)");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("y")){
            System.out.println("Welcome to the Haunted House");
            System.out.println("You have entered the front door");
            System.out.println("Would you like to enter: ");
            System.out.println("    Kitchen");
            System.out.println("    Upstairs");
            System.out.println("    Patio");
            System.out.println("    Living Room");
            System.out.println("    Dungeon");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("kitchen")){
                status = gtoKitchen();
            }
            else if (userResp.equalsIgnoreCase("upstairs")){
                status = gtoUpstairs();
            }
            else if (userResp.equalsIgnoreCase("patio")){
                status = gtoPatio();
            }
            else if (userResp.equalsIgnoreCase("living room")){
                status = gtoLivingRm();
            }
            else if (userResp.equalsIgnoreCase("dungeon")){
                status = gtoDungeon();
            }
            else {
                status = "No valid response. Thank You for Playing";
            }
        }
        System.out.println(status);
    }

    public static String gtoKitchen(){
        String localStatus = status;
        System.out.println("Would you like to Open the Refrigerator or Cabinet (R or C)");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("r")){
            System.out.println("Would you like to drink some strange (Milk) or eat some questionable looking (Leftovers)");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("milk")){
                localStatus += "You drank the strange milk found in the refrigerator and are feeling woozy";
            } else if (userResp.equalsIgnoreCase("leftovers")){
                localStatus += "You ate some dubious leftovers.";
            }
            else {
                localStatus = "You have died in the kitchen of Starvation.";
            }
            return localStatus;
        }
        else if (userResp.equalsIgnoreCase("c")){
            System.out.println("You see a can of (beans) and a (plate) in the cabinet - which would you like to choose or (both)?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("beans")){
                localStatus = "Eating the beans without a plate was a messy undertaking";
            } else if (userResp.equalsIgnoreCase("plate")){
                localStatus = "You only have a plate with nothing to eat. You have died from starvation.";
            }
            else if (userResp.equalsIgnoreCase("both")){
                localStatus += "You feel nourished after eating a can of beans on your plate.";
            }
            else {
                localStatus = "You have not obtained any food and have died of Starvation.";
            }
        }
        else {
            localStatus = "You have lingered too long in the kitchen died of starvation.";
        }
        return localStatus;
    }

    public static String gtoUpstairs(){
        String localStatus = status;
        System.out.println("Would you like to the (bedroom) or the (bathroom)");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("bedroom")){
            System.out.println("Would you like to lay on a (bed) or open the (drawer)?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("bed")){
                localStatus += "You have taken a nice nap in the bed in the bedroom";
            } else if (userResp.equalsIgnoreCase("drawer")){
                localStatus = "A zombie bat flies out of the drawer and bites you on the neck.\n Oh no! You are dead.";
            }
            else {
                localStatus = "You have lingered too long in the bedroom died of Starvation.";
            }
            return localStatus;
        }
        else if (userResp.equalsIgnoreCase("bathroom")){
            System.out.println("In the bathroom you see a (mirror) and (toilet) - which would you like to choose or (both)?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("mirror")){
                localStatus += "You look in the decrepit bathroom mirror and notice that you look Good!";
            } else if (userResp.equalsIgnoreCase("toilet")){
                localStatus = "You decided to use the toilet and a rat with bubonic plague has bitten you in the butt./n Oops you have died.";
            }
            else if (userResp.equalsIgnoreCase("both")){
                localStatus = "After noticing how good you look in the mirror you decide to use the toilet.\n";
                localStatus += "You feel a sharp pain and see that a rat with bubonic plague has bitten you in the butt. \n Oops you have died.";
            }
            else {
                localStatus = "You have lingered too long in the bathroom and have been bitten from a rat with bubonic plague.\n";
                localStatus += "Oh no! You have died";
            }
        }
        else {
            localStatus = "You have lingered too long in the Upstairs and have been killed by a Wraith.";
        }
        return localStatus;
    }

    public static String gtoPatio(){
        String localStatus = status;
        System.out.println("On the patio you have the options to go to the (pool), open the (shed) or take a (hammer)");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("pool")){
            System.out.println("Would you like to (clean) or (swim) in the pool?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("clean")){
                localStatus += "You have nicely cleaned the pool.";
            } else if (userResp.equalsIgnoreCase("swim")){
                localStatus = "You feel a sharp pain in your neck from a sharp metal protrusion under the water.\n Oh no! You are dead.";
            }
            else {
                localStatus = "You have lingered too long on the patio and have been attacked by a malevolent spirit.\n Oh no! You are dead";
            }
        } else if (userResp.equalsIgnoreCase("shed")){
            System.out.println("While in the shed you take an (ax) or a (hammer).");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("ax")) {
                System.out.println("Would you like to (throw) the ax or (chop) a tree with it.");
                userResp = keyboard.nextLine();
                if (userResp.equalsIgnoreCase("throw")) {
                    localStatus += "You throw the ax and it kills a demon.";
                } else if (userResp.equalsIgnoreCase("chop")) {
                    localStatus = "While you are chopping a tree a demon attacks you from behind. Oh no! You are dead.";
                } else {
                    localStatus = "You have lingered too long in the shed and a demon attacks you from behind. Oh no! You are dead.";
                }
            }
        } else if (userResp.equalsIgnoreCase("hammer")){
            System.out.println("While on the patio you have taken a hammer.\n Would you like to hammer a (nail) or (break) the hammer?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("nail")){
                localStatus += "You hammer a nail on the patio and are attacked by a demon beast.\n You defend yourself with the hammer.";
            } else if (userResp.equalsIgnoreCase("break")){
                localStatus = "You broke your hammer on the patio and are attcked by a demon beast.\n Oh no! You are dead.";
            }
            else {
                localStatus = "You have lingered too long on the patio and have died from an attack by a demon beast.\n Oh no! You are dead";
            }
        }
        return localStatus;
    }

    public static String gtoLivingRm(){
        String localStatus = status;
        System.out.println("You go to the Living Room. Do you choose to turn on the (tv), or sit on the (couch)");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("tv")){
            System.out.println("Would you like to (change) the channel or (stay) on the first chanmel?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("change")){
                localStatus += "You have found an interesting channel to watch. \n";
                System.out.println("Would you like to (increase) or (decrease) the volume of the tv?");
                userResp = keyboard.nextLine();
                if (userResp.equalsIgnoreCase("increase")){
                    localStatus += "You have increased the tv volume to a suitable level.\n";
                } else if (userResp.equalsIgnoreCase("decrease")){
                    localStatus += "You have decreased the tv volume to a suitable level.\n";
                }
            } else if (userResp.equalsIgnoreCase("stay")){
                System.out.println("You have decided to stay on the first channel.\n Would you like to (open) or (ignore) the door?");
                userResp = keyboard.nextLine();
                if (userResp.equalsIgnoreCase("open")){
                    localStatus = "A monster hits you with an ax./n Oh no! You are dead";
                } else if (userResp.equalsIgnoreCase("ignore")){
                    localStatus += "You ignore the door and continue enjoying watching the first channel.\n";
                }
            } else {
                localStatus = "You have lingered too long in the Living Room and have passed out and hit your head.\n Oh no! You are dead";
            }
        } else if (userResp.equalsIgnoreCase("couch")){
            System.out.println("You have decided to sit on the couch./n Would you like to (look) out the window or (eat) some popcorn?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("look")){
                localStatus += "As you look out of the window you see some interesting views of the neighborhood. \n";
            } else if (userResp.equalsIgnoreCase("eat")){
                localStatus = "You choke on some stale food.\n Oh no! You are dead.";
            } else {
                localStatus = "You have lingered too long in the Living Room and are starving.\n Oh no! You are dead";
            }
        }
        return localStatus;
    }

    public static String gtoDungeon(){
        String localStatus = status;
        System.out.println("You go to the Dungeon and chose to turn on the (lights), or walk in the (dark)");
        userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("lights")){
            System.out.println("In the Dungeon would you like to enter the fighting(ring) or turn the lights (off)?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("ring")){
                localStatus = "A powerful demon enters the ring and defeats you. On no! You are dead.\n";
            } else if (userResp.equalsIgnoreCase("off")){
                localStatus += "You turned the lights off in the Dungeon and left.";
            } else {
                localStatus = "You have lingered in the Dungeon too long and have been killed by a powerful demon.\n Oh no! You are dead";
            }
        } else if (userResp.equalsIgnoreCase("dark")){
            System.out.println("You see a chest and a closet in the Dungeon.\nWould you like to open the (chest) or (closet)?");
            userResp = keyboard.nextLine();
            if (userResp.equalsIgnoreCase("chest")) {
                localStatus += "You have found Treasure.";
            }
            else if (userResp.equalsIgnoreCase("closet")) {
                localStatus = "A Zombie jumps out of the closet and attacks you.\n Oh no! You are dead";
            }
        }
        return localStatus;
    }
}
