package com.davidcryer.uiwrapperlibraryexample.framework.uiwrappers.exampledialog;

public interface ExampleDialogUi {
    void showTimeOfLastStateRecovery(final long time);
    void showResourceListenersCount(final int count);

    interface Listener {

    }
}
