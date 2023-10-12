package com.pluralsight;
import java.util.Arrays;
public class TestStatistics {
    public static void main(String[] args) {
        int totalTestScores = 0;
        int [] testScores = {100, 65, 54, 32, 59, 14, 34, 87, 45, 98};
        Arrays.sort(testScores);
        System.out.println("Here are the test scores : ");
        for(int i = 0; i < testScores.length; i++){
            System.out.println(testScores[i] + " ");
            totalTestScores += testScores[i];
        }
        int averageTestScores = totalTestScores / testScores.length;
        System.out.println("The average test score is : " + averageTestScores);
        int highTestScores = testScores[testScores.length -1];
        System.out.println("The highest score is : " + highTestScores);
        int lowTestScores = testScores[0];
        System.out.println("The lowest score is : " + lowTestScores);
    }

}
