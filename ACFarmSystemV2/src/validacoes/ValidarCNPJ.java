package validacoes;

public class ValidarCNPJ {

    public static boolean validaCNPJ(String cnpj) {
        cnpj = cnpj.replace(".", "").replace("/", "").replace("-", "");

        if (cnpj.length() != 14) {
            return false;
        }

        try {
            Long.parseLong(cnpj);
        } catch (NumberFormatException e) {
            return false;
        }

        int[] weights = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        int firstDigit = calculateDigit(cnpj.substring(0, 12), weights);
        int secondDigit = calculateDigit(cnpj.substring(0, 12) + firstDigit, weights);

        return cnpj.equals(cnpj.substring(0, 12) + firstDigit + secondDigit);
    }

    private static int calculateDigit(String str, int[] weights) {
        int sum = 0;

        for (int i = str.length() - 1, digit; i >= 0; i--) {
            digit = Integer.parseInt(str.substring(i, i + 1));
            sum += digit * weights[weights.length - str.length() + i];
        }

        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }
}
