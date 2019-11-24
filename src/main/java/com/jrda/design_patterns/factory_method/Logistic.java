package com.jrda.design_patterns.factory_method;

public abstract class Logistic {
    public String doDelivery(){
        Transport transport = createTransport();
        return transport.delivery();
    }

    protected abstract Transport createTransport();
}
