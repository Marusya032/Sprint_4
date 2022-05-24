import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {

        Pattern pattern = Pattern.compile("^[^\\s].{1,16}[^\\s]$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }}

//        if (name == null) {
//            return false;
//        } else if (name.length() <= 3 || name.length() >= 19) {
//            return false;
//        } else if (name.length() - name.replace(" ", "").length() != 1) {
//            return false;
//        } else if (name.startsWith(" ") || name.endsWith(" ")) {
//            return false;
//        } else
//            return true;
//    }


