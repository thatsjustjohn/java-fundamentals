/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] roll(int numberOfRolls){
        Random random = new Random();
        int[] rollsArray = new int[numberOfRolls];
        for(int i = 0; i < numberOfRolls; i++){
            int nextInt = random.nextInt((6 - 1) + 1) + 1;
            rollsArray[i] = nextInt;
        }
        return rollsArray;
    }

    public boolean containsDuplicates(int[] valuesArray){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < valuesArray.length; i++){
            if(map.containsKey(valuesArray[i])){
                return true;
            }else{
                map.put(valuesArray[i],1);
            }
        }
        return false;
    }

    public float arrayAverage(int[] valuesArray){
        if(valuesArray.length == 0) return 0;
        float total = 0;
        for(int i = 0; i < valuesArray.length; i++){
            total += valuesArray[i];
        }
        return (total / valuesArray.length);
    }

    public int[] twoDArrayAverage(int[][] valuesArray){
        if(valuesArray.length == 0) return null;
        int[] lowAverageArray = valuesArray[0];
        double lowAverage = arrayAverage(valuesArray[0]);
        for(int i = 1; i < valuesArray.length; i++){
            double curLowAverage = arrayAverage(valuesArray[i]);
            if(curLowAverage< lowAverage){
                lowAverage = curLowAverage;
                lowAverageArray = valuesArray[i];
            }
        }
        return lowAverageArray;
    }
}
