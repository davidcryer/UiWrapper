package com.davidc.uiwrapper;

public interface UiWrapperRepositoryFactory<R extends UiWrapperRepository> {
    R create();
}