package com.example.NextTrail;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class PMF {
    private final PersistenceManagerFactory pmfInstance =
            JDOHelper.getPersistenceManagerFactory("transactions-optional");

    PMF() {}

    public PersistenceManagerFactory get() {
        return pmfInstance;
    }
}
