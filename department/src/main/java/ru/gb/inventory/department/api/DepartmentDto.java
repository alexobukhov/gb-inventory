package ru.gb.inventory.department.api;

public class DepartmentDto {
    private Long id;
    private String title;
 //   private List<UserDto> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public List<UserDto> getUsers() {
//        return users;
//    }

//    public void setUsers(List<UserDto> users) {
//        this.users = users;
//    }

    public DepartmentDto(Long id, String title /*, List<UserDto> users*/) {
        this.id = id;
        this.title = title;
//        this.users = users;
    }

    public DepartmentDto() {
    }
}
