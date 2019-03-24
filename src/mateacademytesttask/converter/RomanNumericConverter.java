package mateacademytesttask.converter;

import java.util.HashMap;
import java.util.Map;

public class RomanNumericConverter {
    
    Map<String, Integer> dictionery;

    public RomanNumericConverter() {
        dictionery = createDictionery();
    }

    private   Map<String, Integer> createDictionery() {
        Map<String, Integer> dictionery = new HashMap<>();
        dictionery.put("I", 1);
        dictionery.put("II", 2);
        dictionery.put("III", 3);
        dictionery.put("IV", 4);
        dictionery.put("V", 5);
        dictionery.put("VI", 6);
        dictionery.put("VII", 7);
        dictionery.put("VIII", 8);
        dictionery.put("IX", 9);
        dictionery.put("X", 10);

        return dictionery;
    }

    public boolean isRomanic(String romanic){
        dictionery = createDictionery();
        if (dictionery.containsKey(romanic)){
            return true;
        }

        return false;
    }

    public int convertRomanToInteger(String romanNumber){
        int number = 0;

            for (Map.Entry<String, Integer> n : dictionery.entrySet()
            ) {
                    String key = n.getKey();
                    int i = n.getValue();
                    if (key.equalsIgnoreCase(romanNumber)) {
                        number = i;
                    }
            }
        return number;
    }
}
