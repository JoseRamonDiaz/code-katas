package com.jrda.design_patterns.factory_method;

public abstract class Logistic {
    private Config config;

    public String doDelivery(){
        Transport transport = createTransport();
        //return transport.delivery();
        return config.getConfig();
    }

    public void setConfig(Config config){
        this.config = config;
    }

    protected abstract Transport createTransport();
}
