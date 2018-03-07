package abstractfactory;

import factoryfunction.Factory;

public class Huawei implements Phone {
    @Override
    public String getType() {
        return "huawei";
    }
}
