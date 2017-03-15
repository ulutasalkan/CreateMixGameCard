package Homework_Java_016;

public class Card {
	private CardValue m_value;
	private CardType m_type;
	public Card(CardValue v, CardType t){
		m_value=v;
		m_type=t;
	}
	public Card(String name){
		setName(name);
	}
	public String getName(){
		return m_value.getName()+"-"+m_type.getName();
	}
	
	public void setName(String name){
		m_value=CardValue.valueOf(name.substring(0,name.indexOf("-")));
		m_type=CardType.valueOf(name.substring(name.indexOf("-")+1));
	}
	public String toString(){
		return null;
	}
	public static Card[] getShuffledDeck(){
		Card[] deck = new Card[52];
		return deck;
	}
}
enum CardType {
	SPADE("Ma�a"), CLUB("Sinek"), DIAMOND("Karo"), HEART("Kupa");
	private String m_value=null;	
	CardType(String name){
		m_value=name;
	}
	public String getName(){
		return m_value;
	}
}
enum CardValue{
	TWO("�ki"), THREE("��"), FOUR("D�rt"), FIVE("Be�"), SIX("Alt�"), SEVEN("Yedi"), EIGHT("Sekiz"), NINE("Dokuz"), TEN("On"), KNAVE("Vale"), QUEEN("K�z"), KING("Papaz"), ACE("As");
	private String m_value=null;	
	CardValue(String name){
		m_value=name;
	}
	public String getName(){
		return m_value;
	}
}