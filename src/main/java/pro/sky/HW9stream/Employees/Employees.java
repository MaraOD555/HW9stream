package pro.sky.HW9stream.Employees;

import java.util.Objects;

public class Employees {
        private final String fullName;
        private final String departmentId;
        private Integer salaryOfEmployee;


        public Employees(String fullName, String departmentId, Integer salaryOfEmployee) {
            this.fullName = fullName;
            this.departmentId = departmentId;
            this.salaryOfEmployee = salaryOfEmployee;

        }

        public String getFullName() {
            return fullName;
        }

        public String getDepartmentId() {
            return departmentId;
        }

        public int getSalaryOfEmployee() {
            return salaryOfEmployee;
        }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees employees = (Employees) o;
        return Objects.equals(getFullName(), employees.getFullName()) && Objects.equals(getDepartmentId(), employees.getDepartmentId()) && Objects.equals(getSalaryOfEmployee(), employees.getSalaryOfEmployee());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getDepartmentId(), getSalaryOfEmployee());
    }

    @Override
        public String toString() {
            return "ФИО сотрудника: " + fullName + ", "
                    + " Отдел: " + departmentId + ", " + " Заработанная плата: "
                    + salaryOfEmployee;

        }
}
