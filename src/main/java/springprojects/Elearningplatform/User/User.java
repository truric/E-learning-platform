package springprojects.Elearningplatform.User;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 1)
    private int roleId;
    @Column(nullable = false, length = 45)

    private String name;
    @Column(nullable = false, length = 45)
    private String password;
    @Column(nullable = false, length = 45)

    private String email;

    public User(int roleId, String name, String email, String password) {
        this.roleId = roleId;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                ", roleId=" + roleId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
