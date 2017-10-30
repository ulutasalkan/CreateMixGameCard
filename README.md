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
DKVLGM3Y4O-

eyJsaWNlbnNlSWQiOiJES1ZMR00zWTRPIiwibGljZW5zZWVOYW1lIjoiWmlyYWF0IFRla25vbG9qaSBBLlMuIiwiYXNzaWduZWVOYW1lIjoiZXJnaW4gdMO8emV

yIiwiYXNzaWduZWVFbWFpbCI6ImV0dXplckB6aXJhYXRiYW5rLmNvbS50ciIsImxpY2Vuc2VSZXN0cmljdGlvbiI6IiIsImNoZWNrQ29uY3VycmVudFVzZSI6dH

J1ZSwicHJvZHVjdHMiOlt7ImNvZGUiOiJSTSIsImZhbGxiYWNrRGF0ZSI6IjIwMTYtMTItMTYiLCJwYWlkVXBUbyI6IjIwMTctMTItMTUifV0sImhhc2giOiI1M

TQ2NjM5LzE3NjQzNTAiLCJncmFjZVBlcmlvZERheXMiOjcsImF1dG9Qcm9sb25nYXRlZCI6dHJ1ZSwiaXNBdXRvUHJvbG9uZ2F0ZWQiOnRydWV9-

Hqc4f60ZAZUo82LSVVYS0AansNN7vzZZh8zBbr5hDkmjXxSCA4yLctxvJF8iCHo+V0MfYwZHm5NXo6xUHikGQ1zEKVVQeC+rgnjxh0W3b8gA

+rWgQbBQ/O/0RsheSIf62ny

+ZRCJVxDQkxydKjXuwrzr/EeoOz6//EpGbBR2CmpALquFkMgR9Yv4EdMi5medJSuc/mr6SgEuUjiDChxdC1nC/V5XdawScgZobFexBe6jaltYwd0mMgPaXic0PI

Aw36Nj6jJJoOcUYFv6EOcxET13gXDV3pmGSEznpymJsYiDGV8G+ZdZT6PJ90GujOIe1KIPW3PAiKy1KiRoMHffcQ==-

MIIEPjCCAiagAwIBAgIBBTANBgkqhkiG9w0BAQsFADAYMRYwFAYDVQQDDA1KZXRQcm9maWxlIENBMB4XDTE1MTEwMjA4MjE0OFoXDTE4MTEwMTA4MjE0OFowETE

PMA0GA1UEAwwGcHJvZDN5MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxcQkq

+zdxlR2mmRYBPzGbUNdMN6OaXiXzxIWtMEkrJMO/5oUfQJbLLuMSMK0QHFmaI37WShyxZcfRCidwXjot4zmNBKnlyHodDij/78TmVqFl8nOeD5+07B8VEaIu7c3

E1N+e1doC6wht4I4+IEmtsPAdoaj5WCQVQbrI8KeT8M9VcBIWX7fD0fhexfg3ZRt0xqwMcXGNp3DdJHiO0rCdU

+Itv7EmtnSVq9jBG1usMSFvMowR25mju2JcPFp1+I4ZI

+FqgR8gyG8oiNDyNEoAbsR3lOpI7grUYSvkB/xVy/VoklPCK2h0f0GJxFjnye8NT1PAywoyl7RmiAVRE/EKwIDAQABo4GZMIGWMAkGA1UdEwQCMAAwHQYDVR0OB

BYEFGEpG9oZGcfLMGNBkY7SgHiMGgTcMEgGA1UdIwRBMD

+AFKOetkhnQhI2Qb1t4Lm0oFKLl/GzoRykGjAYMRYwFAYDVQQDDA1KZXRQcm9maWxlIENBggkA0myxg7KDeeEwEwYDVR0lBAwwCgYIKwYBBQUHAwEwCwYDVR0PB

AQDAgWgMA0GCSqGSIb3DQEBCwUAA4ICAQC9WZuYgQedSuOc5TOUSrRigMw4/+wuC5EtZBfvdl4HT/8vzMW/oUlIP4YCvA0XKyBaCJ2iX+ZCDKoPfiYXiaSiH

+HxAPV6J79vvouxKrWg2XV6ShFtPLP+0gPdGq3x9R3+kJbmAm8w+FOdlWqAfJrLvpzMGNeDU14YGXiZ9bVzmIQbwrBA

+c/F4tlK/DV07dsNExihqFoibnqDiVNTGombaU2dDup2gwKdL81ua8EIcGNExHe82kjF4zwfadHk3bQVvbfdAwxcDy4xBjs3L4raPLU3yenSzr/OEur1+jfOxnQ

SmEcMXKXgrAQ9U55gwjcOFKrgOxEdek/Sk1VfOjvS+nuM4eyEruFMfaZHzoQiuw4IqgGc45ohFH0UUyjYcuFxxDSU9lMCv8qdHKm

+wnPRb0l9l5vXsCBDuhAGYD6ss+Ga+aDY6f/qXZuUCEUOH3QUNbbCUlviSz6+GiRnt1kA9N2Qachl

+2yBfaqUqr8h7Z2gsx5LcIf5kYNsqJ0GavXTVyWh7PYiKX4bs354ZQLUwwa/cG++2+wNWP+HtBhVxMRNTdVhSm38AknZlD

+PTAsWGu9GyLmhti2EnVwGybSD2Dxmhxk3IPCkhKAK+pl0eWYGZWG3tJ9mZ7SowcXLWDFAk0lRJnKGFMTggrWjV8GYpw5bq23VmIqqDLgkNzuoog==
