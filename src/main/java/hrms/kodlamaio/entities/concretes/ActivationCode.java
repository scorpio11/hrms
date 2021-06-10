package hrms.kodlamaio.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="activation_codes")
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="activation_code")
    private String activationCode;

    @Column(name="is_activated")
    private boolean isActivated;

}
