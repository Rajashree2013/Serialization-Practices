package se.lexicon.rajashree;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Car implements Serializable {

    public String brand;
    public String model;
    public String regnumber;

    public Car() {

    }

    public Car(String brand, String model, String regnumber) {
        this.brand = brand;
        this.model = model;
        this.regnumber = regnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public static void main(String args[]) throws IOException {
        Car car1 = new Car();
        car1.setBrand("AUDI");
        car1.setModel("X12");
        car1.setRegnumber("A124");
        Car car2 = new Car("AUDI", "X12", "A124");
        Car car3 = new Car("FORD", "X32", "R67");
        Car car4 = new Car("AUDI", "X19", "W124");
        Car car5 = new Car("VOLVo", "X32", "R68");
        Car car6 = new Car("PORSCHE", "X19", "W134");
        ArrayList<Car> car = new ArrayList<>();
        car.add(car1);
        car.add(car2);
        car.add(car3);
        car.add(car4);
        car.add(car5);
        car.add(car6);

        System.out.println(car);

        Car carObject = new Car();
        carObject.writeFile(car);
        carObject.readFile();



    }



    public void writeFile(List car) {

        try {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Lexicon_JavaTraining\\Exercise\\File_Output\\Car.txt"))) {
                out.writeObject(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Lexicon_JavaTraining\\Exercise\\File_Output\\Car.txt"))){


            List<Car> cars = (List<Car>) in.readObject();

            System.out.println(cars.size());

            Iterator itr = cars.iterator();
            while (itr.hasNext()) {
                Car car = (Car) itr.next();
                System.out.println("Car Brand : "+car.getBrand()+" Car Model : " +car.getModel()+ "Car Reg Number: "+ car.getRegnumber());
            }

              //Password null
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }

    }
}
/*
5. In Java create a class called Car with properties like regnumber, brand and model etc... The
   Car class must implement Serializable. To also fulfil the contract make a default constructor.
        a. Create a List of Cars and add some objects into it.
        b. Save the List of Cars to a file using ObjectOutputStream.
        c. Read the List of Cars from file using ObjectInputStream.
 */
