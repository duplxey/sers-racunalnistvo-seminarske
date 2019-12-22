package com.yourname.projectname.letnik_4.auto_2;

import java.io.File;

public class Ferrari485 extends Avto {

    public Ferrari485() {
        super("Ferrari485", "je športni avto narejen v Italiji", "MB-PERKO", 320, 13.3, 23952.4);
    }

    public Ferrari485(File file) {
        super(file);
    }
}
