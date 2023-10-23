package za.co.protogen.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "reservations")
public class Reservation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "fromDate")
    private LocalDate fromDate;
    @Column(name = "toDate")
    private LocalDate toDate;
    @Column(name = "userId")
    private Long userId;
    @Column(name = "carId")
    private Long carId;
    @Column(name = "pickUpLocation")
    private String pickUpLocation;
    @Column(name = "dropOffLocation")
    private String dropOffLocation;


}
