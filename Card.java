package Homework_Java_016;

public class Card {
    private CardValue m_value;
    private CardType m_type;
    public Card(CardType t,CardValue v){
        m_value=v;
        m_type=t;
    }
    public Card(String name){
        setName(name);
    }
    public String getName(){
        return m_type.getName()+"-"+m_value.getName();
    }

    public void setName(String name){
        m_value=CardValue.valueOf(name.substring(0,name.indexOf("-")));
        m_type=CardType.valueOf(name.substring(name.indexOf("-")+1));
    }
    public String toString(){
        return String.format("%s-%s",m_type.getName(),m_value.getName());
    }
    public static Card[] getShuffledDeck(){
        Card[] deck = new Card[52];
        return deck;
    }
}
enum CardType {
    SPADE("Maça"), CLUB("Sinek"), DIAMOND("Karo"), HEART("Kupa");
    private String m_value=null;
    CardType(String name){
        m_value=name;
    }
    public String getName(){
        return m_value;
    }
}
enum CardValue{
    TWO("İki"), THREE("Üç"), FOUR("Dört"), FIVE("Beş"), SIX("Altı"), SEVEN("Yedi"), EIGHT("Sekiz"), NINE("Dokuz"), TEN("On"), KNAVE("Vale"), QUEEN("Kız"), KING("Papaz"), ACE("As");
    private String m_value=null;
    CardValue(String name){
        m_value=name;
    }
    public String getName(){
        return m_value;
    }
}
