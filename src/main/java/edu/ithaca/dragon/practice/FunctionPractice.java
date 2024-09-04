package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (second < 0 ){
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (third < 0 ){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        
        
        int largestNum = first;
        if (largestNum < second){
            largestNum = second;
        } else if (largestNum < third){
            largestNum = third;
        }

        return largestNum;
    }
    
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     * @throws IllegalArgumentException if any of the numbers are negative
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if (originalPrice < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (discountPercent < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (salesTax < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        discountPercent = discountPercent / 100;
        double discountNum = originalPrice * discountPercent;
        originalPrice = originalPrice - discountNum;
        return originalPrice + salesTax;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     * @throws IllegalArugmentException if any of the numbers are negative 
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (daysSinceShoesChewed < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }
        boolean bOrGDog = true;
        if (yearsOld > 1 && daysSinceShoesChewed > 0 && fetchedThePaperToday == true){
            bOrGDog = true;
        } else if (fetchedThePaperToday == false){
            bOrGDog  = false;
        } else if (daysSinceShoesChewed == 0){
            bOrGDog = false;
        }

        return bOrGDog;

        
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int largestNumber = 0;
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > largestNumber){
                largestNumber = numbers.get(i);
            } 
            
        }
        return numbers.indexOf(largestNumber);
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        int largestNum = 0;
        for(int i = 0; i <numbers.size(); i++){
            if(numbers.get(i) > largestNum){
                largestNum = numbers.get(i);
            } else if (numbers.get(i) == largestNum){
                largestNum = numbers.get(i);
            }
        }
        return numbers.indexOf(largestNum);
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws IllegalArgumentException if the letter is not in any of the words
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        String wordOfMost = null;
        int maxCount = 0;
        for(String aString : words){
            int count = 0;
        
            for(char aChar : aString.toCharArray()){
                if (aChar == letter){
                    count++;
                }
                if (count > maxCount){
                    maxCount = count;
                    wordOfMost = aString;
                }

            }
        }

        return wordOfMost;
    }


}
