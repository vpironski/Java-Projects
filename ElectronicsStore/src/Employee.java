public class Employee extends User{

    public Employee(int id, String userName, String password, boolean isEmployee) {
        super(id, userName, password, isEmployee);
    }


    public Employee createEmployee(int id, String userName, String password, boolean isEmployee){
        Employee newEmployee = new Employee(id, userName, password, isEmployee);
        return newEmployee;
    }

    public void restock(){
        //TODO
    }

    public void createEMP(){
        //TODO
    }



}
