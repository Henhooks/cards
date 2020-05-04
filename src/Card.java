public class Card {
    String currentSuit;
    String currentRank;
    int currentValue;
    Suit aSuit;
    Rank aRank;
    public Card(String suitName, String rankName, int rankValue){
       currentRank=rankName;
       currentSuit=suitName;
       currentValue=rankValue;
        aSuit = new Suit(currentSuit,0);
        aRank = new Rank(currentRank,currentValue);
    }
    public String toString(){
        return(aRank.toString()+" of "+aSuit.toString());
    }
    public int getValue(){
        return aRank.getValue();
    }
}
