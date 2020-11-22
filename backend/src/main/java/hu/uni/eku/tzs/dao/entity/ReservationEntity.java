package hu.uni.eku.tzs.dao.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationEntity {
    @Id
    private int id;
    @Column
    private String customerEmail;
    @Column
    private String customerName;
    @Column
    private String phoneNumber;
    @Column
    private String customerAddress;
    @Column
    private int slotId;
    @Column
    private Date start;
    @Column
    private Date end;


}
