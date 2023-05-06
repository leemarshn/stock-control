package com.lenhac.stockcontrol.model;

import java.io.Serializable;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

    private static final Long INITIAL_VALUE = 10000L;
    private static Long currentValue = INITIAL_VALUE - 1;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        currentValue++;
        return currentValue;
    }
}

