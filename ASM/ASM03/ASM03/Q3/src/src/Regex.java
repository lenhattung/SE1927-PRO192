/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Regex {

    public static boolean check(String s) {
        if (s == null || s.length() != 5) {
            return false;
        }
        if (!Character.isLetter(s.charAt(0))) {
            return false;
        }
        if (!Character.isLetter(s.charAt(1))) {
            return false;
        }
        if (!Character.isDigit(s.charAt(2))) {
            return false;
        }
        if (!Character.isDigit(s.charAt(3))) {
            return false;
        }
        if (!Character.isDigit(s.charAt(4))) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String regex = "[a-zA-Z][a-zA-Z]\\d\\d\\d";

        String text = "TN000";
        String text2 = "TNN000";
        System.out.println(text.matches(regex));
        System.out.println(text2.matches(regex));

        String sdt = "(+84)123456789"; // TRUE
        String sdt2 = "+84123456789"; // FALSE

        String regex1 = "\\(\\+84\\)\\d{9}";
        System.out.println(sdt.matches(regex1));
        System.out.println(sdt2.matches(regex1));

    }
}
