package com.stackroute.PE3;
import java.util.*;
import java.io.*;
public class StudentMarks {


      public String checkRange(int number, int[] marksArray) {

          for(int i=0;i<number;++i) {
              String marks = String.valueOf(marksArray[i]);
              if(marksArray[i] < 0 || marksArray[i] > 100 || !isNumber(marks)){
                  return "Invalid Marks";
              }
          }

          return "Valid marks";

      }


        static boolean isNumber(String s)
        {
            for (int i = 0; i < s.length(); i++)
                if (Character.isDigit(s.charAt(i))
                        == false)
                    return false;

            return true;
        }

}
