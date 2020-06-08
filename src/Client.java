/**
 * @author srx
 * @date 2020/6/7 - 12:13
 */
abstract class AbstractClass {
    //模板方法
    final void  templateMethod(){
        search(); //查询用户信息
        type(); //判断用户类型
        compute(); //不同类型用户的利息计算方式
        getMoney(); //显示利息
    }
    UserInfo search(){
        return null;
    }
    UserType type(){
        return null;
    }
    double getMoney(){
        System.out.println(compute());
        return 0;
    }
    abstract double compute();
}
class UserInfo{

}
class UserType{

}
class CurrentAccount extends AbstractClass{
    double compute(){
        return 0;
    }
}
class SavingAccount extends AbstractClass{
    double compute(){
        return 1;
    }
}
public class Client {
    public static void main(String[] args) {
        AbstractClass ca = new CurrentAccount();
        ca.templateMethod();
        System.out.println("-----end-----");

        AbstractClass da = new SavingAccount();
        da.templateMethod();
        System.out.println("-----end-----");
    }
}
