// ROLE DEVE AVERE ID, NAME, UNA LISTA DI USER A CUI COLLEGARSI PER POTER DESCRIVERE LA RELAZIONE MANY-TO-MANY

package it.blog.blog_gaming.models;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
