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
@Table(name="customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phoneNumber;
    @Column
    private String email;

    @OneToOne(mappedBy = "customer")
    private ReservationEntity reservation;
}
