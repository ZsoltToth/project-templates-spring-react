package hu.uni.eku.tzs.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CampingSlotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int coordinateX;
    @Column
    private int coordinateY;
    @Column
    private int price;
    @Column
    private Boolean status;
    @Column
    private String description;
}
