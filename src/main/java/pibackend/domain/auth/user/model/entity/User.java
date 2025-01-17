package pibackend.domain.auth.user.model.entity;

import lombok.Getter;
import lombok.Setter;
import pibackend.domain.auth.role.model.entity.Role;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "user_account")
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(name = "user_account_role",
            joinColumns = @JoinColumn(name = "user_account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;
}