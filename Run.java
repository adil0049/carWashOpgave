import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        ArrayList<WashCard> washCards = new ArrayList<WashCard>();
        ArrayList<WashType> washTypes = new ArrayList<WashType>();
    
        

        WashCard washCard1 = new WashCard("Per", 400);
        WashCard washCard2 = new WashCard("Ole", 1000);
        WashCard washCard3 = new WashCard("Lars", 500);
    
        WashType silverWash = new WashType("SilverWash", 100);
        WashType goldWash = new WashType("GoldWash", 200);
        WashType crystalWash = new WashType("CrystalWash", 500);

        washCards.add(washCard1);
        washCards.add(washCard2);
        washCards.add(washCard3);

        washTypes.add(silverWash);
        washTypes.add(goldWash);
        washTypes.add(crystalWash);

        System.out.print("What is your name:");
        String input = System.console().readLine();
        System.out.println("Welcome");
        
        
        
        
        System.out.print("Which WashType do you want to choose:");
        String input = System.console().readLine();
        System.out.println("You have choosen: " + input);
    }
}