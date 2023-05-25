package ru.gb.inventory.user.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;
    private String title;


 //   private List<UserDto> users;

//    public List<UserDto> getUsers() {
//        return users;
//    }

//    public void setUsers(List<UserDto> users) {
//        this.users = users;
//    }


}
