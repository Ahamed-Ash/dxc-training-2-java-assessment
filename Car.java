class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}

class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}
class MonsterTruck extends Truck{
    public static void main(String[] args){
        MonsterTruck m = new MonsterTruck();
        m.m1();
        m.m2();
        System.out.println(m.toString());
    }
    public void m1(){
        System.out.println("monster 1");
    }
    public void m2(){
        super.m1();
        super.m2();
    }
    public String toString(){
        return "\"monster" +
        super.toString().substring(0,5)+""+
        super.toString().substring(5)+"\"";
    }

    

    
}

    

