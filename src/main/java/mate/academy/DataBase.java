package mate.academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class DataBase {
    public static final ArrayList<User> dataBase = new ArrayList<>();
    private static final Logger logger = LogManager.getLogger(DataBase.class);

    public User getUseByLogin(String login) {
        logger.info("login method was called");
        for (User user:dataBase) {
            if(user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new RuntimeException("Can not fined User by this login: " + login);
    }
}
