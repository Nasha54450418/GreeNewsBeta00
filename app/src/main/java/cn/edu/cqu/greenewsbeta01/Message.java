package cn.edu.cqu.greenewsbeta01;

public class Message {
    private String name;
    private int imageId;
    public Message(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}