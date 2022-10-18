package Java.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher("");

        boolean found = matcher.find();
        System.out.printf("Padrão encontrado -> %s",found ? "sim":"nao");
    }
}
