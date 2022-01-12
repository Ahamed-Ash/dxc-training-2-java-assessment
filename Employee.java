package Javademos;

class Employee {

        private int baseHours = 40;
        private double baseSalary = 40000.0;
        private int baseVacationDays = 10;
        private String baseVacationForm = "yellow";
            
        public int getHours() {
            return baseHours;                
        }
    
        public double getSalary() {
            return baseSalary;              
        }
    
        public int getVacationDays() {
            return baseVacationDays;        
        }
    
        public String getVacationForm() {
            return baseVacationForm;         
        }
            
            
        public final void setBaseHours(int hours) {
            baseHours = hours;
        }
        public final void setBaseSalary(double salary) {
            baseSalary = salary;
        }
        public final void setBaseVacationDays(int days) {
            baseVacationDays = days;
        }
        public final void setBaseVacationForm(String form) {
            baseVacationForm = form;
        }
    }
    
    class Janitor extends Employee {
        public static void main (String[] args) {
            Janitor j = new Janitor();
            j.setBaseHours(j.getHours() * 2);
            j.setBaseSalary(j.getSalary() - 10000);
            j.setBaseVacationDays(j.getVacationDays() / 2);
            System.out.println(j.getHours());
            System.out.println(j.getSalary());
            System.out.println(j.getVacationDays());
            j.clean();
        }
        
        public void clean() {
            System.out.println("Workin' for the man.");
        }
    }

