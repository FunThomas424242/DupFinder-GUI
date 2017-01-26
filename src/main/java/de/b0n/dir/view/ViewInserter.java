package de.b0n.dir.view;

import java.io.File;
import java.util.Queue;

/**
 * Created by huluvu424242 on 16.01.17.
 */
public abstract class ViewInserter implements Runnable {

    protected final Queue<File> files;

    public ViewInserter(final Queue<File> files) {
        this.files = files;
    }

    public void run() {
        doInsert();
    }

    abstract void doInsert();


}
