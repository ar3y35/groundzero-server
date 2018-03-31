package org.rawdoughnuts.server;

public interface FactoryResourceService<T> {
    ResourceService newResourceService (T t);
}
