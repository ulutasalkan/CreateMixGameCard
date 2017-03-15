# CreateMixGameCard

Soru: Bir oyun kartını temsil eden Card isimli sınıfı aşağıda belirtildiği gibi csd.games.cardgames paketi
içerisinde yazınız:
Bir kartın iki özelliği vardır: türü ve değeri. Bu iki özellik Card sınıfının private veri elemanlarıyla ifade
edilebilir:
public class Card
{
private CardValue m_value;
private CardType m_type;
//...
public Card(CardValue v, CardType t)
{
//...
}
public Card(String name)
{
//...
}
public String getName()
{
//...
}
public void setName(String name)
{
//...
}
//...
public String toString()
{
//...
}
public static Card[] getShuffledDeck()
{
Card[] deck = new Card[52];
//...
return deck;
}
//…
}
Card sınıfına başlangıç, get ve set metotları yerleştirilmelidir. Ayrıca Card sınıfının aşağıdaki parametrik yapıya
sahip bir toString() metodu bulunmalıdır.
public String toString()
{
//...
}
Bir kart nesnesinin yaratılması ve yazdırılması şöyle yapılabilir:
Card c = new Card(CardValue.ACE, CardType.DIAMOND); // Karo As
System.out.println(c.toString());
Bu başlangıç metodunun iki tane enum türünden argüman aldığına dikkat ediniz. Ayrıca sınıfa String parametreli
bir başlangıç metodu yerleştiriniz. Bu metot kartı sayıyla değil yazıyla alıp oluşturmalıdır. Örneğin:
Card c = new Card(“Kupa-Papaz”);
Sınıfın ayrıca getName ve setName metotları da bulunmalıdır.
c.setName(“Kupa-Papaz”);
Kart isimlerinin önce tür sonra değeri ile belirtildiğine ve arada ‘-‘ karakterinin bulunduğuna dikkat ediniz.
setName metodu yazıyı ayrıştırarak sınıfın m_type ve m_value veri elemanlarını set edecektir.
Sınıfın static getShuffledDeck isimli metodu bize karıştırılmış bir deste (52 tane) kart verir. Karıştırma için
dizinin iki elemanını belli miktarda yer değiştirebilirsiniz. Test işlemini aşağıdaki örnek kodla yapabilirsiniz:
public static void main(String [] args)
{
Card[] deck;
deck = Card.getShuffledDeck();
for (Card c : deck)
System.out.println(c.toString());
}
Card sınıfına ve aşağıda bildirimleri bulunan enum türlerine istediğiniz başka elemanları ekleyebilirsiniz.
enum CardType
{
SPADE, CLUB, DIAMOND, HEART
}
enum CardValue
{
TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNAVE, QUEEN, KING, ACE
}
