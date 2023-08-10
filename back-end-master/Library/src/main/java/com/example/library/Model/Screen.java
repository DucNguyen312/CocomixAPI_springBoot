package com.example.library.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idscreen")
    private Long id;
    private String name;

    @Lob
    private String images;
    private String description;

    @OneToMany(mappedBy = "screens")
    private Collection<Role_screen_permission> roleScreenPermissions;
}
