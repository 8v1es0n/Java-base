package day03.homework;

public class VipUser extends User{
    private int vipLevel;

    public VipUser(String userName, String passWord, int vipLevel) {
        super(userName, passWord);
        this.vipLevel = vipLevel;
    }

    @Override
    public String toString() {
        return
                "用户名为: " + getUserName()
                + "密码为: " + getPassWord()
                + "会员等级: " + this.vipLevel;
    }
}
