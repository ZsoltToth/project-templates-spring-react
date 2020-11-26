package hu.uni.eku.tzs.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="camping_slot")
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

    @OneToMany(
            cascade = CascadeType.ALL
    )
    private Collection<ReservationEntity> reservations;

}
