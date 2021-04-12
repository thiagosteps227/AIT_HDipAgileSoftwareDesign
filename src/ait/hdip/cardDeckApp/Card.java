package ait.hdip.cardDeckApp;

class Card{
    private String theSuitValue;
    
    Card(String aSuitValue){
        theSuitValue = aSuitValue;
    }

    public String getTheSuit() {
        return theSuitValue;
    }

    @Override
    public String toString() {
        return theSuitValue;
    }
}

