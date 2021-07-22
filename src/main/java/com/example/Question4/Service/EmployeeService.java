package com.example.Question4.Service;

import com.example.Question4.Domain.Employee;
import com.example.Question4.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll() {
        return repo.findAll();
    }

    public Optional<Employee> findById(long id) {
        return repo.findById(id);
    }

    public List<Employee> findByDepartment(int department) {
        return repo.findByDepartment(department);
    }

}
