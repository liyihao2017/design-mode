package factoryfunction;

public class IphoneFactory implements Factory {
    @Override
    public String createPhone() {
        return "iphone";
    }
}
