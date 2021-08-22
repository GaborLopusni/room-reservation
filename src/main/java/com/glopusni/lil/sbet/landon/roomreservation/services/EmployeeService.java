package com.glopusni.lil.sbet.landon.roomreservation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.glopusni.lil.sbet.landon.roomreservation.models.Employee;
import com.glopusni.lil.sbet.landon.roomreservation.models.Position;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private static final List<Employee> staff = new ArrayList<>();   

    static {        
        staff.add(new Employee(UUID.randomUUID().toString(), "Jack", "Sparrow", Position.HOUSEKEEPING));
        staff.add(new Employee(UUID.randomUUID().toString(), "Gabor", "Lopusni", Position.SECURITY));
        staff.add(new Employee(UUID.randomUUID().toString(), "Mike", "Ross", Position.FRONT_DESK));
        staff.add(new Employee(UUID.randomUUID().toString(), "Feri", "Joska", Position.CONCIERGE));
    }

    public List<Employee> getStaff(){
        return staff;
    }
}

