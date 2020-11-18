package hu.uni.eku.team3.dao.entity;

import java.util.Date;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String identityNumber;
    @Column
    private String name;
    @Column
    private Date dateOfBirth;
    @Column
    private Date arrivalDate;
    @Column
    private Date departureDate;
}
