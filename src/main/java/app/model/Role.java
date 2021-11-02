package app.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


// Этот класс реализует интерфейс GrantedAuthority, в котором необходимо переопределить только один метод getAuthority() (возвращает имя роли).
// Имя роли должно соответствовать шаблону: «ROLE_ИМЯ», например, ROLE_USER.
@Entity
@Table(name = "role")

public class Role implements GrantedAuthority {
    @Id
    private Long id;
    @Column
    private String role;
    @ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
    private User user;

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Role() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
