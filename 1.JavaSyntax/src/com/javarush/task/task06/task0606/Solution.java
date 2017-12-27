import java.io.*;
import java.util.Scanner;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        for(int i = 0; i < line.length(); i++) {
            char a = line.charAt(i);
            if(a%2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd );
        //напишите тут ваш код
    }
}