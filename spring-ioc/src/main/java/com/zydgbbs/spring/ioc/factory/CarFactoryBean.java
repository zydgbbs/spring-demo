package com.zydgbbs.spring.ioc.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class CarFactoryBean implements FactoryBean<Car> {
    /**
     * 返回bean的对象
     * @return
     * @throws Exception
     */
    @Nullable
    public Car getObject() throws Exception {
        return new Car("BMO",500000);
    }

    /**
     * 返回bean的类型
     * @return
     */
    @Nullable
    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
