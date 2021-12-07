package ru.mirea.task24;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhone {
    public boolean checkPhone(String phone) {
        String regex = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
