import java.util.ArrayList;

public class CarWash {

ArrayList<WashCard> washCards = new ArrayList<WashCard>();

public void addWashCard(WashCard w) {
    washCards.add(w);
}

ArrayList<WashType> washTypes = new ArrayList<WashType>();

public void addWashType(WashType wt) {
    washTypes.add(wt);
}

}