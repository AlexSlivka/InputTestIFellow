import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Задача 1");
        createRandomArray(11);

        System.out.println("+===========+");

        System.out.println("Задача 2");
        findFrequentSymbol("Hello");

        System.out.println("+===========+");

        System.out.println("Задача 3");
        BaseConverter converter = new BaseConverter();
        converter.convert();

        System.out.println("+===========+");

        System.out.println("Задача 4");
        calculateAngleOfTime(3, 45);

        System.out.println("+===========+");
    }

    static void createRandomArray(int sizeArray) {
        int[] ans = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            ans[i] = (int) (Math.random() * sizeArray);
        }
        printArray(ans);

        int max = ans[0];
        int min = ans[0];
        int sum = 0;

        for (int i = 1; i < sizeArray; i++) {
            if (ans[i] > max) {
                max = ans[i];
            } else if (ans[i] < min) {
                min = ans[i];
            }
            sum += ans[i];
        }

        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        System.out.println("Среднее = " + (sum / sizeArray));
    }

    static void printArray(int[] ares) {
        System.out.println("Массив");
        for (int arr : ares) {
            System.out.print(arr);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    static void findFrequentSymbol(String inputWord) {
        Map<Character, Integer> symbolMap = new HashMap<>();
        for (char symbol : inputWord.toCharArray()) {
            if (symbolMap.containsKey(symbol)) {
                symbolMap.put(symbol, symbolMap.get(symbol) + 1);
            } else {
                symbolMap.put(symbol, 1);
            }
        }

        char frequentSymbol = ' ';
        int maxFrequent = 0;
        for (Map.Entry<Character, Integer> elem : symbolMap.entrySet()) {
            if (elem.getValue() > maxFrequent) {
                frequentSymbol = elem.getKey();
                maxFrequent = elem.getValue();
            }
        }
        System.out.println("Самый повторяющийся символ в слове " + inputWord + " это " + frequentSymbol);
    }

    static void calculateAngleOfTime(int hours, int minutes) {
        double angle;
        if (hours >= 12) {
            angle = (hours - 12) * 30 + minutes * ((double) 30 / 60) - minutes * 6;
        } else {
            angle = hours * 30 + minutes * ((double) 30 / 60) - minutes * 6;
        }

        System.out.println("Угол между " + hours + " часами и " + minutes + " минутами = " + angle);
    }
}

