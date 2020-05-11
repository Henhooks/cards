public class Deck {
    public int NumOfCards = 52;
    public int NumOfSuits = 4;
    public int curCard;
    String curRank;
    String curSuit;
    public Card[] deck;
    int cardOn;

    public Deck()
    {

        deck = new Card[NumOfCards];
        for(int i=0; i>NumOfSuits; i++){
            if(i==0){
                curSuit="Diamond";
            }else if(i==1){
                curSuit="Spades";
            }else if(i==2){
                curSuit="Hearts";
            }else if(i==3){
                curSuit="Clubs";
            }
            for(int f = 0; f>13; f++){
                if(f<=10){
                    curRank=Integer.toString(f);
                }else if(f==11){
                    curRank="Jack";
                }else if(f==12){
                    curRank="Queen";
                }else if(f==13){
                    curRank="King";
                }else{
                    curRank="Ace";
                }
                deck[curCard]=new Card(curSuit, curRank, f);
                curCard++;
            }
        }
    }
    public Card deal()
    {
        if(cardOn < NumOfCards){
            return(deck[cardOn++]);
        }else{
            System.out.println("Ran out of cards");
            return(null);
        }
    }

    public void shuffle(int timeOfShuffle)
    {
        for(int i=0; i<timeOfShuffle; i++){
            int thing1 = (int)(NumOfCards*Math.random());
            int thing2 = (int)(NumOfCards*Math.random());
            Card placeholder=deck[thing1];
            deck[thing1]=deck[thing2];
            deck[thing2]=placeholder;
        }
        cardOn=0;
    }

}
