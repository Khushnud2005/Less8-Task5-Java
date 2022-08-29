package uz.exemple.less8_task5_java.models;

public class PostModel {
    private String title;
    private int image;

    public PostModel(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
