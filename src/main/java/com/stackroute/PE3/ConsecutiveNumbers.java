package com.stackroute.PE3;

public class ConsecutiveNumbers {

    public boolean checkConsecutive(String values) {
            boolean result = false;
            String[] integerArray = values.split(",");
            for (int i = 0; i < integerArray.length - 1; i++) {
                int difference = Integer.parseInt(integerArray[i + 1]) - Integer.parseInt(integerArray[i]);

                if (difference == 1 || difference == -1) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result;
        }
}
