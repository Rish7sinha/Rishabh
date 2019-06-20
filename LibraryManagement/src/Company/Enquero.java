package Company;

import java.util.Scanner;

public class Enquero {
    public int Id;
    public String products;
    public String services;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public static void main (String args[])
    {
        Enquero enq=new Enquero();

        Scanner input1=new Scanner(System.in);
        System.out.println("Enter ID: ");
        int name1=input1.nextInt();
        enq.setId(name1);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter  Product:  ");
        String prod = input2.nextLine();
        enq.setProducts(prod);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter  Service:  ");
        String ser = input2.nextLine();
        enq.setServices(ser);


        System.out.println(enq.getId());
        System.out.println(enq.getProducts());
        System.out.println(enq.getServices());



    }
}
