package pro.sky.HW9stream.EmployeesService;

import org.springframework.stereotype.Service;
import pro.sky.HW9stream.Employees.Employees;
import pro.sky.HW9stream.Exceptions.EmployeeAlreadyAddedException;
import pro.sky.HW9stream.Exceptions.EmployeeNotFoundException;
import pro.sky.HW9stream.Exceptions.EmployeeStorageIsFullException;

import java.util.*;

@Service
public class EmployeesService {


    List<Employees> employees = new ArrayList<>(List.of(

            new Employees("Иванов Иван Иванович", "1", 105_000),
            new Employees("Иванов Иван Петрович", "2", 100_000),
            new Employees("Сидоров Иван Иванович", "1", 84_000),
            new Employees("Зверев Михаил Иванович", "3", 300_000),
            new Employees("Клюева Людмила Петровна", "5", 250_000),
            new Employees("Иванов Егор Александрович", "3", 150_000),
            new Employees("Кузнецов Сергей Сергеевич", "3", 100_000),
            new Employees("Клоков Сергей Валерьевич", "4", 90_000),
            new Employees("Куркова Светлана Игоревна", "2", 95_000),
            new Employees("Михалева Елена Александровна", "1", 100_000)
    ));

    public List<Employees> getAll() {
        return new ArrayList<>(employees);
    }
}
