package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String[] contents;
    private String discType;
    private String readType;
    

    public BaseDisc(String name, int capacity, String[] contents, String discType, String readType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.readType = readType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String[] getContents() {
        return contents;
    }

    public void setContents(String[] contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getReadType() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType = readType;
    }
}