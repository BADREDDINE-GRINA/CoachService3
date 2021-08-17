package com.transformation.coachservice3.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
@Data
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Code;
    private String photo;
    private String description;
    private String first_name;
    private String last_name;
    private Date birthday;
    private String email;
    private String phonenumber;
    private String address;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Sport> SportsList;
}
