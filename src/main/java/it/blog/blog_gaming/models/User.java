// PER POTER CORRISPONDERE ALLA TABELLA, LO USER DEVE AVERE GLI STESSI CAMPI ID, USERNAME, EMAIL, PASSWWORD E ROLES
// ROLES DESCRIVERA' UNA RELAZIONE MANY-TO-MANY TRA UTENTI E RUOLI

package it.blog.blog_gaming.models;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "users_roles",
        joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
        inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")})
    private List<Role> roles = new ArrayList<>();
}
