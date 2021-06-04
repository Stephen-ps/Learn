package JavaBasic.NetWork.TCP.Thread;

import org.jetbrains.annotations.Contract;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Stephen
 * @date 2021-05-14 01:55
 **/
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -1233845253365049179L;
    private String account;
    private String password;

    @SuppressWarnings("unused")
    @Contract(pure = true)
    public User() {
    }

    public String getAccount() {
        return account;
    }

    @SuppressWarnings("unused")
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    @SuppressWarnings("unused")
    public void setPassword(String password) {
        this.password = password;
    }

    @Contract(pure = true)
    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
}
