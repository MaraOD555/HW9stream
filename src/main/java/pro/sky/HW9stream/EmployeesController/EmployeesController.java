package pro.sky.HW9stream.EmployeesController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HW9stream.Employees.Employees;
import pro.sky.HW9stream.EmployeesService.EmployeesService;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeesController {
    private static EmployeesService employeesService;
    public EmployeesController(EmployeesService employeesService) {
        EmployeesController.employeesService = employeesService;
    }

    @GetMapping
    public List<Employees> getAll(){ // список с методом
        return employeesService.getAll(); // вызываем метод контроллера
    }
}
