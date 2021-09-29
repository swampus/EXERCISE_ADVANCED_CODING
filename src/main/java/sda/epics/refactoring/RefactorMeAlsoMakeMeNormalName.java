package sda.epics.refactoring;


import sda.misc.objects.BankProcessor;
import sda.misc.objects.CardProcessor;

import java.beans.Transient;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class RefactorMeAlsoMakeMeNormalName {

    private static Card oldCard;

    public RefactorMeAlsoMakeMeNormalName(CardProcessor cardProcessor) {
    }

    //Free to change return object. (What class we should use for wrap ?
    public Card toCardProcessed(String name, String num, String type) {

        //WHAT pettern to use there ?
        Card card = new Card();
        card.setCardNumber(num);
        card.setName(name);
        card.setType(type);

        boolean validationResult = false;
        if (card.getName() == "") {
            validationResult = true;
        }

        if (card.getType() == "") {
            validationResult = true;
        }

        if (card.getCardNumber() == "") {
            validationResult = true;
        }
        if (!validationResult) {
            System.out.println("validation Failed!");
            return null;
        } else {
            try {
                CardProcessor bankProcessor = new CardProcessor();
                BankProcessor cardProcessor = new BankProcessor();
                cardProcessor.processBank(card);
                bankProcessor.processCard(card);
                cardProcessor = null;
                bankProcessor = null;
                System.gc();

            } catch (ExecutionException e) {
                System.out.println("ERROR HAPPEND");
            }
        }


        return card;
    }

    @Transient
    public String cardWithName(List<Card> card, String number) {

        for (int i = 0; i < card.size(); i++) {
            if (card.get(i).getCardNumber().equals(number)) {
                if (card.get(i) != null) {
                    String nameSearch = card.get(i).getName();
                    if (!nameSearch.isEmpty()) {
                        return nameSearch.substring(0, 4);
                    }
                }
            }
        }
        System.gc();
        System.out.println("NO NAME FOUND");
        return null;
    }
}

