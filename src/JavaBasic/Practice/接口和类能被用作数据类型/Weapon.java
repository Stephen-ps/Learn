package JavaBasic.Practice.接口和类能被用作数据类型;

/**
 * 这是定义Weapon的类型
 */
public class Weapon {

    private String 代号 = "";

    public Weapon(String 代号) {
        this.代号 = 代号;
    }

    public Weapon() {
    }

    public String getCode() {
        return 代号;
    }

    public void setCode(String 代号) {
        this.代号 = 代号;
    }
}
