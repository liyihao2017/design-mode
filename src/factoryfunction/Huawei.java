package factoryfunction;

public class Huawei implements Factory {
    @Override
    public String createPhone() {
        return "Huawei";
    }
}
