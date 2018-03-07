package simplefactory;

public class PhoneFactory {

    public String createFactory(String type) {
        if ("iphone".equals(type)) {
            return "iphone";
        } else if ("huawei".equals(type)) {
            return "huawei";
        } else {
            System.out.println("no type");
            return null;
        }
    }
}
