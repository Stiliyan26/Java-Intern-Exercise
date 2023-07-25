package dev.lpa.poker;

import dev.lpa.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerGame {
    private final List<Card> deck = Card.getStandartDeck();
    private int playerCount;
    private int cardsInHands;
    private List<PokerHand> pokerHand;
    private List<Card> remaining;

    public PokerGame(int playerCount, int cardsInHands){
        this.playerCount = playerCount;
        this.cardsInHands = cardsInHands;
        pokerHand = new ArrayList<>(cardsInHands);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int randomMiddle = new Random().nextInt(15, 35);
        Collections.rotate(deck, randomMiddle);
        Card.printDeck(deck);
    }
}
