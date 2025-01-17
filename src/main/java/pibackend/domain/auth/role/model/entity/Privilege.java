package pibackend.domain.auth.role.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "privilege")
public class Privilege {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "privilege_name", nullable = false)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "roles_privilege",
            joinColumns = {@JoinColumn(name = "privilege_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;
}
