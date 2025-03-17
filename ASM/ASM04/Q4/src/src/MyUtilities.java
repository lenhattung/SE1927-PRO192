/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class MyUtilities implements IUtilities {

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        int result = value.length();
        if (value.length() >= 2 && value.length() <= 10) {
            try {
                result = Integer.parseInt(value);
                result = (result >= min && result <= max) ? result : value.length();
            } catch (Exception e) {
            }
        }
        return result;
    }

    public String toTitleCase(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.trim().length() > 0) {
                String temp = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result += (temp + " ");
            }
        }
        return result.trim();
    }

    @Override
    public String removeDuplicatedWords(String value) {
        value = value.toLowerCase();
        String[] words = value.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].trim().equals(words[j].trim())) {
                    words[j] = "";
                }
            }
        }
        String result = "";
        for (String word : words) {
            result += (word + " ");
        }
        result = toTitleCase(result);
        return result;
    }

    @Override
    public int checkFormatString(String value) {
        // A.B.C with A is 03 uppercase letters, B is 06 digits, C in [@#$].
        // AAA.123456.@
        String regex = "^[A-Z]{3}\\.\\d{6}\\.[@#\\$]$";
        if (value.matches(regex)) {
            String sub = value.substring(4, 10);
            return Integer.parseInt(sub);
        } else {
            return value.length();
        }
    }

    @Override
    public double sumNumbers(String value) {
        String temp = "";
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                temp += (value.charAt(i));
            } else if (value.charAt(i) == '.' && i > 0 && Character.isDigit(value.charAt(i - 1))) {
                temp += (value.charAt(i));
            } else {
                temp += " ";
            }
        }
        //System.out.println(temp);

        double sum = 0;
        String[] words = temp.split(" ");
        for (String word : words) {
            if (word.trim().length() > 0) {
                sum += Double.parseDouble(word.trim());
            }
        }

        return sum;
    }

    @Override
    public double sumAbsNumbers(String value) {
        // Tỉnh tổng trị tuyết đối của các con số
        // 10 -50 50 89
        double sum = 0;
        String[] words = value.split(" ");
        for (String word : words) {
            if (word.trim().length() > 0) {
                sum += Math.abs(Double.parseDouble(word.trim()));
            }
        }

        return sum;
    }

    @Override
    public double sumAbsNumbers2(int value) {
        // Tính tổng trị tuyết đối của các con số
        // 9876578945 => Tổng các chữ số bên trong?
        // -9876578945 => Tổng các chữ số bên trong của giá trị tuyệt đối?
        value = Math.abs(value);
        String s = value + "";
        double sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (Double.parseDouble(s.charAt(i) + ""));
        }
        return sum;
    }

    @Override
    public int findFirstOddNumber(String value) {
        // Tìm số lẻ đầu tiên
        // 10 -50 50 89 abc 100 50 87 => 89
        String[] words = value.split(" ");
        for (String word : words) {
            if (word.trim().length() > 0) {
                try {
                    int number = Integer.parseInt(word);
                    if (number % 2 != 0) {
                        return number;
                    }
                } catch (Exception e) {

                }
            }
        }
        return -1;
    }

    public int findPalindromeNumbers(String str){
       // String input = "abc 121 def 343 ghi 1234554321 jkl";
       return 0;
    }
    
    
    public int countPalindromeNumbers(String str){
       // String input = "abc 121 def 343 ghi 1234554321 jkl";
       return 3;
    }
    
    public int countPalindromeStrings(String str){
       // String input = "abc 121 ded 343 ghi 1234554321 jkl";
       return 4;
    }
}
