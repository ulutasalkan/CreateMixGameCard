import java.util.Random;

public class AppCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card[] c = Card.getShuffledDeck();
		for(Card c1: c)
			System.out.println(c1);
	}

}
class Card {
    private CardValue m_value;
    private CardType m_type;
    public Card(CardType t,CardValue v){
    	m_type=t;
    	m_value=v;        
    }
    public Card(String name){
    	setName(name);
    }
    public String getName(){
    	return String.format("%s-%s",m_type.getType(),m_value.getValue());
    }

    public void setName(String name){
    	String sType=name.substring(0,name.indexOf("-"));
    	String sValue=name.substring(name.indexOf("-")+1);
    	switch (sType){
	    	case "Maça":
	    		m_type=CardType.SPADE;
	    		break;
	    	case "Sinek":
	    		m_type=CardType.CLUB;
	    		break;
	    	case "Karo":
	    		m_type=CardType.DIAMOND;
	    		break;
	    	case "Kupa":
	    		m_type=CardType.HEART;
	    		break; 
	    	default:
    			throw new IllegalArgumentException("Geçersiz değer "+sType);
    	}   
    	switch(sValue){
    		case "İki":
    			m_value=CardValue.TWO;
    			break;
    		case "Üç":
    			m_value=CardValue.THREE;
    			break;
    		case "Dört":
    			m_value=CardValue.FOUR;
    			break;
    		case "Beş":
    			m_value=CardValue.FIVE;
    			break;
    		case "Yedi":
    			m_value=CardValue.SIX;
    			break;
    		case "Sekiz":
    			m_value=CardValue.EIGHT;
    			break;
    		case "Dokuz":
    			m_value=CardValue.NINE;
    			break;
    		case "On":
    			m_value=CardValue.TEN;
    			break;
    		case "Vale":
    			m_value=CardValue.KNAVE;
    			break;
    		case "Kız":
    			m_value=CardValue.QUEEN;
    			break;
    		case "Papaz":
    			m_value=CardValue.KING;
    			break;
    		case "As":
    			m_value=CardValue.ACE;
    			break;
    		default:
    			throw new IllegalArgumentException("Geçersiz değer "+sValue);
    	}
    }    
    public static Card[] getShuffledDeck(){
        Card[] deck = new Card[52];
        int k=0;
        for(int i=0;i<CardType.values().length;i++,k+=13)       	
        	for(int j=0;j<CardValue.values().length;j++)      		
        		deck[k+j]=new Card(CardType.values()[i],CardValue.values()[j]);
        int turn=100;
        mixCards(deck, turn);
        return deck;
    }
    private static Card[] mixCards(Card[] deck,int turn){
    	Random r=new Random();     
    	
    	Card cTemp=null;
    	for(int i=0;i<turn;i++){
    		int c1=r.nextInt(52);
    		int c2=r.nextInt(52);
    		//if c1 is equal then create another c2
    		while(c1==c2)
    			c2=r.nextInt(52);
    		cTemp=deck[c1];
    		deck[c1]=deck[c2];
    		deck[c2]=cTemp;
    	}
    	return deck;
    }
    public String toString(){
        return getName();
    }
}
enum CardType {
    SPADE("Maça"), CLUB("Sinek"), DIAMOND("Karo"), HEART("Kupa");
    private String m_type=null;
    CardType(String name){
        m_type=name;
    }
    public String getType(){
        return m_type;
    }   
}
enum CardValue{
    TWO("İki"), THREE("Üç"), FOUR("Dört"), FIVE("Beş"), SIX("Altı"), SEVEN("Yedi"), EIGHT("Sekiz"), NINE("Dokuz"), TEN("On"), KNAVE("Vale"), QUEEN("Kız"), KING("Papaz"), ACE("As");
    private String m_value=null;
    CardValue(String name){
        m_value=name;
    }
    public String getValue(){
        return m_value;
    }
}
