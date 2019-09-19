import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    static HashMap<String, Integer> alphabetWithValues = new HashMap<String, Integer>() {{
        int control = 0;
        for(int i = 0; i < 26; i++){
            put(String.valueOf((char)(65 + i)), control);
            control++;
        }
    }};

    static HashMap<String, Integer> scoreTBD = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (!(str.length() % 2 == 0)) return;

        String firstHalf = str.substring(0, str.length()/2).toUpperCase();
        String secondHalf = str.substring(str.length()/2).toUpperCase();

        int totalFirst = 0;
        int totalSecond = 0;

        scoreTBD.forEach((s, integer) -> System.out.println(s + " " + integer));


        for (int i = 0; i < firstHalf.length(); i++) {

            String s = Character.toString(firstHalf.charAt(i));

            totalFirst = totalFirst + alphabetWithValues.get(Character.toString(firstHalf.charAt(i)));
            totalSecond += alphabetWithValues.get(Character.toString(firstHalf.charAt(i)));
        }

        scoreTBD.put(firstHalf, totalFirst);
        scoreTBD.put(secondHalf, totalSecond);

        scoreTBD.forEach((s, integer) -> System.out.println(s + " " + integer));

    }

}
