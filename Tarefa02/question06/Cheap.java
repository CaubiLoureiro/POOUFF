package introducaoaoo.question06;

public class Cheap {

    private Cards[] cards;

    public Cheap(){
        int counter = 0;
        String name[] = {"Às", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String suit[] = {"Ouros", "Paus", "Espadas", "Copas"};
        cards = new Cards[52];

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                cards[counter] = new Cards(name[i], suit[j]);
                counter ++;
            }
        }
    }
    public void printCheap(){
        for (int i=0; i < cards.length; i ++){
            System.out.println(cards[i].getName() + " " + cards[i].getSuit());
        }
    }

}
