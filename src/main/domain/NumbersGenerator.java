package main.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersGenerator {
    public static List<Integer> generateNumbers(int startNumber, int endNumber){
        Random random = new Random();
        int randomNumber = random.nextInt(endNumber - startNumber + 1) + startNumber;
        List<Integer> Numbers = new ArrayList<>();
        while(isInvalidSize(Numbers,startNumber,endNumber)){
            if(!Numbers.contains(randomNumber)){
                Numbers.add(randomNumber);
            }
        }
        return Numbers;
    }
    private static boolean isInvalidSize(List<Integer> Numbers, int startNumber, int endNumber){
        return Numbers.size() != endNumber - startNumber + 1;
    }
}
