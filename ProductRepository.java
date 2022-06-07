package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
List<Product> pr=new ArrayList<>();
public List<Product> getList(){
Product p1=new Product(1,"T-Shirt",500,"Clothing");
Product p2=new Product(2,"Shirt",1000,"Clothing");
Product p3=new Product(3,"Jeans",2000,"Clothing");
Product p4=new Product(4,"Cap",100,"Clothing");
Product p5=new Product(5,"Shoes",1000,"Footwear");
pr.add(p1);
pr.add(p2);
pr.add(p3);
pr.add(p4);
pr.add(p5);
return pr;
}


}