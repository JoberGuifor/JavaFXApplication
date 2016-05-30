package boundary;

/**
 * Created by lc on 30/05/16.
 */
public class Login {

    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("bob") && password.equals("secret")) {
            return true;
        }
        return false;
    }
}

