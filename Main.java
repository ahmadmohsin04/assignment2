// Question 1

//Write a code in java to take string input from user and find if the string is palindrome or
//not. For this task you can use built-in methods of string class?
//import java.util.*;
//public class Main {
//
//    public static boolean isPalindrome (String st){
//        StringBuilder reversed = new StringBuilder(st).reverse();
//        return st.equals(reversed.toString());
//    }
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a word : ");
//        String input = s.nextLine();
//        if (isPalindrome(input)){
//            System.out.println("The string is palindrome.");
//        } else {
//            System.out.println("The string is not a palindrome.");
//        }
//    }
//}

// Question 2

//  Write a program to take input from user a string. Find the given string is a valid umt
//email id or not. Deign a generic regular expression for umt faculty and student email id?

//F2023065101@gmail.com valid
//101620093@gmail.com invalid
//bilalarif@gmail.com valid
//bilal.arif@gmail.com valid

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter student mail : ");
//        String s_mail = s.nextLine();
//        System.out.println("Enter faculty mail : ");
//        String f_mail = s.nextLine();
//        Pattern pattern = Pattern.compile("[a-zA-Z]+@gmail\\.com");
//        Pattern pattern1 = Pattern.compile("F\\d{10}@gmail\\.com");
//        Matcher matcher = pattern.matcher(f_mail);
//        Matcher matcher1 = pattern1.matcher(s_mail);
//        boolean b = matcher.matches();
//        boolean b1 = matcher1.matches();
//        if (b){
//            System.out.println("Valid");
//        } else {
//            System.out.println("Invalid");
//        }
//        if (b1){
//            System.out.println("Valid");
//        } else  {
//            System.out.println("Invalid");
//        }
//    }
//}

// Question 3

//Take a input date 2024-7-24 from LocalDate.now() and convert this date into 24-7-2024
//format with the help of LocalDateFormater.format method?

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class Main {
//    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy");
//        String formattedDate = date.format(formatter);
//        System.out.println("Date before formatting : " + date);
//        System.out.println("The formatted date is : " + formattedDate);
//    }
//}


// Question 4

// Take a date input from string and add 30 days on that date and print new date in dd-mm-yyyy this format?

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class Main {
//    public static void main(String[] args) {
//        String date = "2024-07-24";
//        // Parsing the date
//        LocalDate l1 = LocalDate.parse(date);
//        LocalDate newDate = l1.plusDays(30);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy");
//        String formattedDate = newDate.format(formatter);
//
//        System.out.println("Original Date : " + date);
//        System.out.println("Date after adding 30 days : " + formattedDate);
//    }
//}

// Question 5

// Take a number string like 123 from user and represent them into roman numbers

//import java.util.Scanner;
//
//public class Main {
//
//    public static String intToRoman(int num){
//        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//
//        StringBuilder roman = new StringBuilder();
//
//        for (int i = 0 ; i <values.length ; i++){
//
//            while(num >= values[i]){
//
//                roman.append(romanSymbols[i]);
//                num -= values[i];
//
//            }
//        }
//    return roman.toString();
//    }
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number : ");
//
//        int number = scanner.nextInt();
//
//        String romanNumber = intToRoman(number);
//
//        System.out.println("Roman number : " + romanNumber);
//
//    }
//}

// Question 6

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
//string is valid.

//import java.util.Stack;
//
//public class Main {
//
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char ch : s.toCharArray()) {
//
//            if (ch == '(' || ch == '{' || ch == '[') {
//
//                stack.push(ch);
//            } else {
//                if (stack.isEmpty()) {
//
//                    return false;
//                }
//                char openBracket = stack.pop();
//                if (!isMatchingPair(openBracket, ch)) {
//
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }
//
//    private static boolean isMatchingPair(char open, char close) {
//        return (open == '(' && close == ')') ||
//                (open == '{' && close == '}') ||
//                (open == '[' && close == ']');
//    }
//
//    public static void main(String[] args) {
//        String s1 = "()";
//        String s2 = "()[]{}";
//        String s3 = "(]";
//
//        System.out.println("Example 1: " + isValid(s1));
//        System.out.println("Example 2: " + isValid(s2));
//        System.out.println("Example 3: " + isValid(s3));
//        System.out.println("Example 4: " + isValid("({[()]})"));
//        System.out.println("Example 5: " + isValid("({[([)]]})"));
//    }
//}


// Question 7

//Find the longest common prefix string amongst an array of strings. If there is no common
//prefix, return an empty string ""?


//public class Main {
//
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//
//        String prefix = strs[0];
//
//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//
//                if (prefix.isEmpty()) {
//                    return "";
//                }
//            }
//        }
//
//        return prefix;
//    }
//
//    public static void main(String[] args) {
//        String[] strs1 = {"flower", "flow", "flight"};
//        System.out.println("Longest common prefix: " + longestCommonPrefix(strs1));
//        String[] strs2 = {"dog", "racecar", "car"};
//        System.out.println("Longest common prefix: " + longestCommonPrefix(strs2));
//        String[] strs3 = {"interstellar", "interstate", "interval"};
//        System.out.println("Longest common prefix: " + longestCommonPrefix(strs3));
//    }
//}


// Question 8

//Given a string s, remove duplicate letters so that every letter appears once and only once?

//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        System.out.println(random.nextInt(6));
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String str = input.nextLine();
//        String newStr = "";
//        char[] arr = str.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            int j;
//            for (j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    break;
//                }
//            }
//            if (i == j) {
//                newStr += arr[i];
//            }
//        }
//        System.out.println(newStr);
//        char[] arr1 = newStr.toCharArray();
//        Arrays.sort(arr1);
//        newStr = String.valueOf(arr1);
//        System.out.println(newStr);
//    }
//}














