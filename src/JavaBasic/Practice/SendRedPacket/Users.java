package JavaBasic.Practice.SendRedPacket;

import java.util.Objects;

public class Users {

    private String name = "";
    private int balance = 0;

    public Users(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showsStatus() {
        System.out.println("My name is: " + getName() + "\n" + "My Balance is:" + getBalance());
    }

    /**
     * 重写比较方法，查看两个对象是否相同
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return balance == users.balance && Objects.equals(name, users.name);
    }
}
