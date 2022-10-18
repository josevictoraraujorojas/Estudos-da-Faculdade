package Java.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {
    public static void main(String[] args) {
        //\d{1,}\w{2,}
        String oi="1ab";
        Pattern pattern = Pattern.compile("1ab");
        Matcher matcher = pattern.matcher(oi);

        boolean found = matcher.find();
        System.out.printf("Padrão encontrado -> %s",found ? "sim":"nao");

    }
}
