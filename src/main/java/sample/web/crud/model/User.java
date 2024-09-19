package sample.web.crud.model;

import javax.validation.constraints.NotEmpty;

public class User {

    private Long id;

    @NotEmpty(message = "First name is required.")
    private String first_name;

    @NotEmpty(message = "Last name is required.")
    private String last_name;

    @NotEmpty(message = "Class is required.")
    private String classes;

    public User() {}

    public User(Long id, String first_name, String last_name, String classes) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
