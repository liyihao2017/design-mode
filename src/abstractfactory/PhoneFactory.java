package abstractfactory;

public class PhoneFactory extends AbstractFactory {
    @Override
    public String createIPhone() {
        return new Iphone().getType();
    }

    @Override
    public String createHuawei() {
        return new Huawei().getType();
    }
}
