package hu.uni.eku.team3.dao.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String employeeName;
    @Column
    private String employeeEmail;
    @Column
    private String pwd;
    @Column
    private int positionID;
}
