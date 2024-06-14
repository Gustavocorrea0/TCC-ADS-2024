package validacoes;

public class ValidarData {

    public static boolean validaData(String dateStr) {
        String[] dateParts = dateStr.split("/");
        if (dateParts.length != 3) {
            return false;
        }
        try {
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            if (year < 1900 || year > 2100) {
                return false;
            }

            if (month < 1 || month > 12) {
                return false;
            }

            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            // Verifica ano bissexto
            if (month == 2 && eAnoBissexto(year)) {
                daysInMonth[1] = 29;
            }

            if (day < 1 || day > daysInMonth[month - 1]) {
                return false;
            }

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean eAnoBissexto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
