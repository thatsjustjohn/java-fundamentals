/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

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

    public String analyzeWeatherData(int[][] valuesArray){
        HashSet<Integer> weatherSet = new HashSet<Integer>();
        System.out.println(valuesArray.length);
        // Check for empty array <-- since this is 2d instantiating like I did before might not resolve all cases.
        // For this I think first pass would be the best though, its a conditional that gets evaluated n^2
        // EG
        // int minTemp = valuesArray[i][j];
        // int maxTemp = valuesArray[i][j];
        if(valuesArray.length == 0) return "";
        if(valuesArray[0].length == 0) return "";

        int minTemp = 0;
        int maxTemp = 0;
        boolean firstPass = true;
        for(int i = 0; i < valuesArray.length; i++){
            for(int j = 0; j < valuesArray[i].length; j++){
                if(firstPass == true){
                    minTemp = valuesArray[i][j];
                    maxTemp = valuesArray[i][j];
                    firstPass = false;
                }
                weatherSet.add(valuesArray[i][j]);
                if(maxTemp < valuesArray[i][j]) maxTemp = valuesArray[i][j];
                if(minTemp > valuesArray[i][j]) minTemp = valuesArray[i][j];
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(String.format("High: %d\nLow: %d",maxTemp, minTemp));
        for(int i = minTemp + 1; i < maxTemp; i++){
            if(!weatherSet.contains(i)) result.append(String.format("\nNever saw temperature: %d", i));
        }
        return result.toString();
    }

    public String tally(List<String> votes){
        int highVotes = 0;
        String winner = "";
        Map<String, Integer> candidateFrequency = new HashMap<>();
        for(String candidate : votes){
            int freq = 1;
            if(candidateFrequency.containsKey(candidate)){
                freq = candidateFrequency.get(candidate) + 1;
                candidateFrequency.put(candidate, freq);
            }
            else{
                candidateFrequency.put(candidate,freq);
            }
            if(highVotes < freq){
                highVotes = freq;
                winner = candidate;
            }
        }
        return winner;
    }
}
