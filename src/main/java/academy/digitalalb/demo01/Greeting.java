package academy.digitalalb.demo01;

public class Greeting {

    private Long id;
    private String message;

    //constructor

    public Greeting(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    //getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
