package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private int student_id;
	
	@Column(name="student_name")
	@Getter
	@Setter
	private String student_name;
	
	@Column(name="student_email")
	@Getter
	@Setter
	private String student_email;
	
	@Column(name="student_branch")
	@Getter
	@Setter
	private String student_branch;
	
	@Column(name="student_sem")
	@Getter
	@Setter
	private String student_sem;
	
	@Column(name="status")
	private int status = 1;
	
}
