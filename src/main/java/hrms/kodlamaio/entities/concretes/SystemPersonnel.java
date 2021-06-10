package hrms.kodlamaio.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="system_personnel")
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonnel extends User{
    @Column(name="department_id")
    private int departmentId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
}
