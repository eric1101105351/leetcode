package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23").toString());
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return Collections.emptyList();
        }
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> resultList = new ArrayList<>();
        resultList.add("");
        for (int i = 0; i < digits.length(); i++) {
            String alphas = map[digits.charAt(i) - '0'];
            int size = resultList.size();
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                StringBuilder resultBuilder = new StringBuilder(resultList.get(j));
                for (int k = 0; k < alphas.length(); k++) {
                    resultBuilder.append(alphas.charAt(k));
                    temp.add(resultBuilder.toString());
                    resultBuilder.deleteCharAt(resultBuilder.length() - 1);
                }
            }
            resultList = temp;
        }
        return resultList;
    }


//    public List<String> letterCombinations(String digits) {
//        if (digits == null || digits.isEmpty()) {
//            return Collections.emptyList();
//        }
//        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        List<String> resultList = new ArrayList<>();
//        resultList.add("");
//        for (int i = 0; i < digits.length(); i++) {
//            List<String> temp = new ArrayList<>();
//            for (char c : map[digits.charAt(i) - '0'].toCharArray()) {
//                for (String s : resultList) {
//                    temp.add(s + c);
//                }
//            }
//            resultList = temp;
//        }
//
//        return resultList;
//    }

}
