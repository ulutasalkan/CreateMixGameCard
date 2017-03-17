package Homework_Java_016;

/**
 * Created by aulutas on 16.03.2017.
 */
public class Card {
    private CardValue m_value;
    private CardType m_type;
    public Card(CardType t,CardValue v){
        m_value=v;
        m_type=t;
    }
    public Card(String name){
        m_value.setValue(null);
        m_type.setType(null);
    }
    public String getName(){
        return m_type.getType()+"-"+m_value.getName();
    }

    public void setName(String name){
        m_value=CardValue.valueOf(name);
    }
    public String toString(){
        return String.format("%s-%s",m_type.getType(),m_value.getName());
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
    public String getType(){
        return m_value;
    }
    public void setType(String type){

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
    public void setValue(String value){

    }
}
