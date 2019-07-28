package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
    public   List<EmployeeDTO>  fetchAllEmployees();
}
