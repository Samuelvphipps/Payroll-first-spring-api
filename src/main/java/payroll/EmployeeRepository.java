package payroll;

//this interface/repository will allow us to interact with Employee object through Get, Post, Delete etc.

import org.springframework.data.jpa.repository.JpaRepository;

//We extend the JpaRepository which INHERITS it (YAY inheritance)
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}