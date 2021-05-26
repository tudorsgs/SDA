package Laborator_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CnpValidator {
    private Pattern pattern;
    private Matcher matcher;
    private static final String CNP_pattern= "^[1-9]\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])(0[1-9]|[1-4]\\d|5[0-2]|99)(00[1-9]|0[1-9]\\d|[1-9]\\d\\d)\\d$";

    public CnpValidator(){
        pattern = Pattern.compile(CNP_pattern);
    }

    public boolean validate(final String cnpValid){
        matcher = pattern.matcher(cnpValid);
        return matcher.matches();
    }
}
