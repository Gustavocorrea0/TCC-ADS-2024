package validacoes;

public class ValidarCPF {

    public static boolean validaCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
            }
            int firstCheckDigit = 11 - (sum % 11);
            if (firstCheckDigit == 10 || firstCheckDigit == 11) {
                firstCheckDigit = 0;
            }

            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
            }
            int secondCheckDigit = 11 - (sum % 11);
            if (secondCheckDigit == 10 || secondCheckDigit == 11) {
                secondCheckDigit = 0;
            }

            return (firstCheckDigit == Character.getNumericValue(cpf.charAt(9))
                    && secondCheckDigit == Character.getNumericValue(cpf.charAt(10)));
        } catch (Exception e) {
            return false;
        }
    }
}
