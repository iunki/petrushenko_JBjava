package ru.kpfu.itis;

public class MyServiceImpl implements MyService{

    private MyModel model = new MyModel();

    @Override
    public String getMyModelValue() {
        model.setValue("Hello, world!");
        return model.getValue();
    }
}
