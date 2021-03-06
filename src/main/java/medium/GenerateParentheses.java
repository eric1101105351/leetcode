package medium;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> list1 = new GenerateParentheses().generateParenthesis(3);
        PrintUtils.printList(list1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(n, n, "", result);
        return result;
    }

    private void backTrack(int leftCount, int rightCount, String current, List<String> result) {
        if (leftCount > rightCount || leftCount < 0 || rightCount < 0) {
            return;
        } else if (rightCount == 0 && leftCount == 0) {
            result.add(current);
        } else {
            backTrack(leftCount - 1, rightCount, current + "(", result);
            backTrack(leftCount, rightCount - 1, current + ")", result);
        }
    }


//    public List<String> generateParenthesis(int n) {
//        List<String> result = new ArrayList<>();
//        backTrack("", n, n, result);
//        return result;
//    }
//
//    private void backTrack(String current, int leftCount, int rightCount, List<String> result) {
//        if (leftCount < 0 || rightCount < 0 || leftCount > rightCount) {
//            return;
//        } else if (leftCount == 0 && rightCount == 0) {
//            result.add(current);
//            return;
//        } else {
//            backTrack(current + "(", leftCount - 1, rightCount, result);
//            backTrack(current + ")", leftCount, rightCount - 1, result);
//        }
//    }

}
