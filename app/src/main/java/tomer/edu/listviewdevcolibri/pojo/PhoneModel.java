package tomer.edu.listviewdevcolibri.pojo;

/**
 * Created by azubakov on 7/8/16.
 */
public class PhoneModel {
    private long id;
    private String name;
    private long price;

    public PhoneModel(long id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
