public class Main {
    public static void main(String[] args)
    {
        Car car = new Car("red", "xe 4 banh", "100km");
        car.XuatCar();
        car.methodCar();
        System.out.println("<--------------------------------------------->");
        Bicycle bicycle = new Bicycle("Blue", "xe 2 banh", "20km");
        bicycle.xuatBicycle();
        bicycle.methodBicycle();
    }
}