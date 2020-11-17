package hu.uni.eku.tzs.dao.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CampingSlotEntity {
    @Id
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
