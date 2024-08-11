import java.io.*;

public class BaseConverter {
    public static void convert() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите температуру в градусах Цельсия");
        double degreesCelsius = Double.parseDouble(reader.readLine());

        System.out.println("Выберете в какую шкалу переводить (англ.):");
        System.out.println("K - Кельвина, F - Фаренгейта");
        String scale = reader.readLine();

        double result = 0.0;

        switch (scale) {
            case "K":
                result = convertCelsiusToKelvin(degreesCelsius);
                break;
            case "F":
                result = convertCelsiusToFahrenheit(degreesCelsius);
                break;
            default:
                result = degreesCelsius;
                System.out.println("Конвертация не удалась. Выбор шкалы некорректен.");
        }

        System.out.println(result + "  " + scale);

        reader.close();
    }

    private static double convertCelsiusToKelvin(double degrees) {
        return degrees + 273.15;
    }

    private static double convertCelsiusToFahrenheit(double degrees) {
        return (degrees * 9 / 5) + 32;
    }
}
