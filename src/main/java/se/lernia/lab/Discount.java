package se.lernia.lab;

public interface Discount {

  double apply(Product product);
  String getDescription(Product product);
}
