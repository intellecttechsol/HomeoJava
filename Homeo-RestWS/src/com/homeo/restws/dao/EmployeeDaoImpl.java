package com.homeo.restws.dao;

public class EmployeeDaoImpl
{}
/*
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.dineshonjava.sdnext.dao.EmpDao;
import com.dineshonjava.sdnext.domain.Employee;
import com.dineshonjava.sdnext.jdbc.utils.EmployeeMapper;

*//**
 * @author Dinesh Rajput
 *
 *//*
@Component
public class EmployeeDaoImpl implements EmpDao {
 @Autowired
 private DataSource dataSource;
 @Autowired
 private JdbcTemplate jdbcTemplateObject;
 private SimpleJdbcCall simpleJdbcCall;
 
 @Override
 public void create(String name, Integer age, Long salary) {
  String SQL = "INSERT INTO Employee (name, age, salary) VALUES (?, ?, ?)";
  jdbcTemplateObject.update(SQL, new Object[]{name, age, salary} );
     System.out.println("Created Record Name = " + name + " Age = " + age+ " Salary = " + salary);
 }

 *//**
  * @param jdbcTemplateObject the jdbcTemplateObject to set
  *//*
 public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
  this.jdbcTemplateObject = jdbcTemplateObject;
 }

 *//**
  * @param dataSource the dataSource to set
  *//*
 @Autowired
 public void setDataSource(DataSource dataSource) {
  this.dataSource = dataSource;
  this.simpleJdbcCall = new SimpleJdbcCall(this.dataSource).withProcedureName("getEmpRecord");
 }

@Override
public Employee getEmployee(Integer empid) {
 SqlParameterSource in = new MapSqlParameterSource().addValue("in_empid", empid);
   Map out = simpleJdbcCall.execute(in);
   Employee employee = new Employee();
   employee.setEmpid(empid);
   employee.setName((String)out.get("out_name"));
   employee.setAge((Integer)out.get("out_age"));
   employee.setSalary(Long.valueOf((String)out.get("out_salary")));
   return employee;
}

 @Override
 public List listEmployees() {
  String SQL = "SELECT * FROM Employee";
  List employees = (List) jdbcTemplateObject.query(SQL, new EmployeeMapper());
     return employees;
 }

 @Override
 public void delete(Integer empid) {
  String SQL = "DELETE FROM Employee WHERE empid = ?";
  jdbcTemplateObject.update(SQL, new Object[]{empid});
  System.out.println("Deleted Record with EMPID = " + empid );
 }

 @Override
 public void update(Integer empid, Integer age) {
   String SQL = "UPDATE Employee SET age = ? WHERE empid = ?";
   jdbcTemplateObject.update(SQL, new Object[]{age, empid});
   System.out.println("Updated Record with EMPID = " + empid );
 }
}*/