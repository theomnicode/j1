package com.brytcode.bos;

import java.util.*;

public class BrytCafe {
    private Set<Customer> customers = new HashSet<>();
    private Map<Integer, Product> products = new LinkedHashMap<>();
    private OrdersAtDesk ordersAtDesk = new OrdersAtDesk();
    private Map<Integer, Barista> baristas = new HashMap<>();
    private Map<Barista, Order> servings = new HashMap<>();

    private Scanner sc = new Scanner(System.in);
    public BrytCafe(){
        products.put(1, new Product(1, "Black Coffee",20));
        products.put(2, new Product(2, "Filter Coffee",25));
        products.put(3, new Product(3, "Instant Coffee",30));
        products.put(4, new Product(4,"Milk",20));

        baristas.put(1, new Barista(1,"Kumar"));
        baristas.put(2, new Barista(2,"Prathap"));
    }

    public boolean addCustomer(String name, String mobileNumber){
        Customer customer = new Customer(mobileNumber);
        customer.setName(name);
        return this.customers.add(customer);
    }

    public Customer getCustomer(String mobileNumber){
        for(Customer customer:customers){
            if(customer.getMobileNumber().equals(mobileNumber)){
                return customer;
            }
        }
        return null;
    }

    public long takeOrder(){
        int choice = 0;
        Order ord = new Order();
        do {
            System.out.println("Chooce a product");
            for (Product prod : products.values()) {
                System.out.printf("%d)%s (%.2f)\n", prod.getId(), prod.getName(), prod.getPrice());
            }
            System.out.printf("%d)%s ", 0, "Exit");
            choice = Integer.parseInt(sc.nextLine());
            if(choice == 0) break;
            ord.addProduct(products.get(choice));
        }while(choice != 0);
        ordersAtDesk.getOrders().add(ord);
        System.out.println("Order #"+ord.getId()+" is successfully placed ");
        System.out.println("Products");
        for(Product prod:ord.getProducts()){
            System.out.println(prod.getName());
        }
        return ord.getId();
    }

    public Order prepareOrder(int baristaCode){
        Barista baristha = this.baristas.get(baristaCode);
        Order ord = this.ordersAtDesk.getOrders().remove();
        this.servings.put(baristha, ord);
        System.out.println("Order #"+ord.getId()+" is being prepared");
        return ord;
    }

    public Order annouseOrderCompletion(int baristaCode){
        Barista barista = this.baristas.get(baristaCode);
        Order ord = this.servings.get(barista);
        System.out.println("Order #"+ord.getId()+" is completed");
        return ord;
    }

    public void printBaristas(){
        Set<Barista> keys = servings.keySet();
        for(Barista barista:keys){
            System.out.println(barista.getId() + " is making "+ servings.get(barista).getId());
        }
    }

}
