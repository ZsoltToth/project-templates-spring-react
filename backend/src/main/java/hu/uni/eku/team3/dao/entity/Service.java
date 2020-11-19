package hu.uni.eku.team3.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column
    private String name;
    @Column
    private int price;
}
