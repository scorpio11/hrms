package hrms.kodlamaio.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="confirm_by_system_employees")
public class ConfirmBySystemEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "is_confirm")
    private Boolean isConfirm;
}
