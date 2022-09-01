package za.co.discovery.security.security;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dxp_generator")
    @SequenceGenerator(name = "dxp_generator", sequenceName = "crmprt_seq", allocationSize = 1)
    private Long id;
    String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
