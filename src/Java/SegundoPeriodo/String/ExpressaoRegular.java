package Java.SegundoPeriodo.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {
    public static void main(String[] args) {
        //\d{1,}\w{2,}
        String oi="ab";
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,16}$");
        Matcher matcher = pattern.matcher(oi);

        boolean found = matcher.find();
        System.out.printf("Padrão encontrado -> %s",found ? "sim":"nao");

    }
}
