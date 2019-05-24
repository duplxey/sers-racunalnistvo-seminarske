package com.yourname.projectname.core.computer;

public class GPU {

    private String name;

    public GPU(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering...");
    }

    public String getName() {
        return name;
    }
}
