import Models.*;
import Exceptions.*;
import View.*;
import Controller.*;
import java.util.*;
import java.time.*;


/***
 * @author: Axel
 * @version: 1.0
 * This is the Main app Class, Makes all the procces of the program
 */

public class App {
    public static void main(String[] args) throws Exception {
        List<Product>products=new ArrayList<>();
        Order order=new Order(products);
        Scanner ent=new Scanner(System.in);
        Menus menu=new Menus();

        boolean exit=false;
        while (!exit) {
            menu.MainMenu();
            int optn=ent.nextInt();

            switch (optn) {
                case 1:
                    ent.nextLine();
                    boolean Ex=false;
                        System.out.println("Please enter the Following data about your Food Product: ");
                        System.out.print("Name: ");
                        String name=ent.nextLine();

                        double price=0;
                        while (!Ex) {
                            try {
                                System.out.print("Price: ");
                                price=ent.nextDouble();
                                if (price<=0) {
                                    System.out.println("The Price Couldn't be Negative or Zero. Try again.");
                                    
                                }else{
                                    Ex=true;
                                    price=price;
                                }

                            } catch (InputMismatchException e) {
                                throw new InputMismatchException("Entrada Inválida.");
                            }
                        } 

                        Ex=false;
                        int stock=0;
                        while (!Ex) {
                            try {
                                System.out.print("Stock: ");
                                stock=ent.nextInt();
                                if (stock<=0) {
                                    System.out.println("The Stock Couldn't be Negative or Zero. Try again.");
                                    
                                }else{
                                    Ex=true;
                                    stock=stock;
                                }

                            } catch (InputMismatchException e) {
                                throw new InputMismatchException("Entrada Inválida.");
                            }
                        } 
                        Ex=false;
                            try {
                                System.out.print("Expiration Date: (First input year, the press enter to input month and finally press enter again to input day) ");
                                System.out.print("\nYear: ");int year=ent.nextInt();
                                System.out.print("Month: ");int month=ent.nextInt();
                                System.out.print("Day:");int day=ent.nextInt();
                                LocalDate expirDate=LocalDate.of(year, month, day);
                                LocalDate realexpirDate=LocalDate.now();
                                if (expirDate.isBefore(realexpirDate)) {
                                    Ex=false;
                                    String men="The Product expired.";
                                    throw new ExpiredProductException(men);
                        
                                }else{
                                    Ex=true;
                                }

                                System.out.println(expirDate);

                                Food food=new Food(name, price, stock, realexpirDate);
                                order.addProduct(food);
                                System.out.println("Food "+name+" added succesfully!");
                                order.calculateTotalOrderValue();

                                order.showOrderDetails();

                                System.out.println("Press 0 to back to menu-+-+-+-+-+-+-+-+-+");
                                int back=ent.nextInt();
                                if (back==0) {
                                    break;
                                }

                            } catch (DateTimeException e) {
                                throw new DateTimeException("Error with Month Input, it should be 1-12.");
                            } catch(ExpiredProductException e){
                                throw new ExpiredProductException("The Product expired. Choose another Product.");
                            }

                    break;

                case 2:
                    ent.nextLine();
                    Ex=false;
                        System.out.println("Please enter the Following data about your Tech Product: ");
                        System.out.print("Name: ");
                        name=ent.nextLine();

                        price=0;
                        while (!Ex) {
                            try {
                                System.out.print("Price: ");
                                price=ent.nextDouble();
                                if (price<=0) {
                                    System.out.println("The Price Couldn't be Negative or Zero. Try again.");
                                    
                                }else{
                                    Ex=true;
                                    price=price;
                                }

                            } catch (InputMismatchException e) {
                                throw new InputMismatchException("Entrada Inválida.");
                            }
                        } 

                        Ex=false;
                        stock=0;
                        while (!Ex) {
                            try {
                                System.out.print("Stock: ");
                                stock=ent.nextInt();
                                if (stock<=0) {
                                    System.out.println("The Stock Couldn't be Negative or Zero. Try again.");
                                    
                                }else{
                                    Ex=true;
                                    stock=stock;
                                }

                            } catch (InputMismatchException e) {
                                throw new InputMismatchException("Entrada Inválida.");
                            }
                        } 
                        Ex=false;
                            try {
                                System.out.println("Input Warranty Months");
                                int warranty=ent.nextInt();
                                if (warranty<=0) {
                                    
                                    String men="The Warranty Can't be negative or zero.";
                                    throw new InvalidWarrantyException(men);
                        
                                }else{
                                    Ex=true;
                                }

                                Tech tech=new Tech(name, price, stock, warranty);
                                order.addProduct(tech);
                                System.out.println("Tech "+name+" added succesfully!");
                                tech.calculateTotalPrice();

                                order.showOrderDetails();

                                System.out.println("Press 0 to back to menu-+-+-+-+-+-+-+-+-+");
                                int back=ent.nextInt();
                                if (back==0) {
                                    break;
                                }

                            } catch(InvalidWarrantyException e){
                                throw new InvalidWarrantyException("The Warranty Can't be negative or zero.");
                            }

                            

                    break;

                case 3:
                    ent.nextLine();
                    Ex=false;
                        System.out.println("Please enter the Following data about your Cloth Product: ");
                        System.out.print("Name: ");
                        name=ent.nextLine();

                        price=0;
                        while (!Ex) {
                            try {
                                System.out.print("Price: ");
                                price=ent.nextDouble();
                                if (price<=0) {
                                    System.out.println("The Price Couldn't be Negative or Zero. Try again.");
                                    
                                }else{
                                    Ex=true;
                                    price=price;
                                }

                            } catch (InputMismatchException e) {
                                throw new InputMismatchException("Entrada Inválida.");
                            }
                        } 

                        Ex=false;
                        stock=0;
                        while (!Ex) {
                            try {
                                System.out.print("Stock: ");
                                stock=ent.nextInt(); ent.nextLine();
                                if (stock<=0) {
                                    System.out.println("The Stock Couldn't be Negative or Zero. Try again.");
                                    
                                }else{
                                    Ex=true;
                                    stock=stock;
                                }

                            } catch (InputMismatchException e) {
                                throw new InputMismatchException("Entrada Inválida.");
                            }
                        } 
                        Ex=false;
                            try {
                                System.out.println("Input Size");
                                String size=ent.nextLine();
                                boolean test=size.equals("S")||!size.equals("M")||!size.equals("L")||!size.equals("XL");
                                if (test=false) {
                                    
                                    String men="Invalid Size Exception.";
                                    throw new InvalidSizeException(men);
                        
                                }else{
                                    Ex=true;
                                }

                                Cloth cloth=new Cloth(name, price, stock, size);
                                order.addProduct(cloth);
                                System.out.println("Tech "+name+" added succesfully!");
                                cloth.calculateTotalPrice();

                                order.showOrderDetails();

                                System.out.println("Press 0 to back to menu-+-+-+-+-+-+-+-+-+");
                                int back=ent.nextInt();
                                if (back==0) {
                                    break;
                                }

                            } catch(InvalidSizeException e){
                                throw new InvalidSizeException("Invalid Size Input.");
                            }

                            

                    break;

                case 4:
                    ent.nextLine();
                    order.showOrderDetails();

                    
                    break;

                case 5:
                ent.nextLine();
                    order.calculateTotalOrderValue();
                    System.out.println(order.calculateTotalOrderValue());
                
                break;

                case 6:
                ent.nextLine();
                System.out.println("Exit.....");
                exit=true;
               
                
                break;
            
                default:
                System.out.println("Input a valid Option. Try Again.");
                    break;
            }   
        }
    }
}

