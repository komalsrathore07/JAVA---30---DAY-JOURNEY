import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Product>products = new ArrayList<>();
		ArrayList<Cartitem>cart =  new ArrayList<>();

		products.add(new Product(101,"keyboard",800,10));
		products.add(new Product(102,"mouse",400,15));
		products.add(new Product(103,"headphone",1200,5));
		products.add(new Product(104, "monitor", 7500, 8));
        products.add(new Product(105, "webcam", 1500, 12));
        products.add(new Product(106, "speaker", 2000, 7));
        products.add(new Product(107, "printer", 5500, 4));
        products.add(new Product(108, "USB cable", 250, 20));
        products.add(new Product(109, "microphone", 1800, 6));
        products.add(new Product(110, "gaming chair", 9000, 3));


		int choice ;
		do {
			System.out.println("==========SHOPPING CART==========");
			System.out.println("1. VIEW PRODUCTS ");
			System.out.println("2. ADD TO CART ");
			System.out.println("3. VIEW CART ");
			System.out.println("4. REMOVE PRODUCT ");
			System.out.println("5. CHECKOUT ");
			System.out.println("0. EXIT");

			System.out.println("ENTER YOUR CHOICE - ");
			if(sc.hasNextInt()){
				choice=sc.nextInt();
			} else{
				System.out.println("INVALID INPUT ! PLEASE ENTER A NUMBER.");
				sc.next();
				choice=-1;
			}

			switch(choice){
				case 1:
					System.out.println("----AVAILABLE PRODUCTS-----");
					for(Product p:products){
						System.out.println("ID - " + p.id +
            " | " + p.name +
            " | Price: $" + p.price +
            " | Stock: " + p.stock);
					}
				break;

				case 2:
					System.out.println("-------ADD PRODUCT TO CART-------");
					System.out.println("ENTER THE PRODUCT ID TO SEARCH : ");
					if(!sc.hasNextInt()){
						System.out.println("INVALID PRODUCT ID ! PLEASE ENTER A NUMBER");
						sc.next();
						break;
					}
		int search_id=sc.nextInt();

		boolean found = false;
		for(Product p:products){
		if(p.id==search_id){
			System.out.println("ENTER THE QUANTITY : ");
			if(!sc.hasNextInt()){
						System.out.println("INVALID QUANTITY! PLEASE ENTER A NUMBER");
						sc.next();
						break;
			}
			int quantity = sc.nextInt();
			if(quantity<=0){
				System.out.println("Quantity must be greater than 0 ");
			} else if(quantity>p.stock){
				System.out.println("INSUFFICIENT STOCK! AVAILABLE STOCK " + p.stock);
			} else{
				boolean Alreadyincart=false;
				for(Cartitem item:cart){
					if(item.product.id ==p.id){
						Alreadyincart=true;
						break;
					}
				}
				if(Alreadyincart){
					for(Cartitem item:cart){
						if(item.product.id ==p.id){
							item.quantity=item.quantity+quantity;
							break;
						}
					}
				}else{
			cart.add(new Cartitem(p,quantity));
				}
			p.stock = p.stock-quantity;
			System.out.println("PRODUCT ADDED SUCCESSFULLY");
			System.out.println(" PRODUCT FOUND - " + p.name);
			System.out.println(" PRICE - " + p.price);
			System.out.println(" STOCK - " + p.stock);
			}
			found=true;
			break;
		}
	}
	if(!found){
		System.out.println("PRODUCT NOT FOUND");
	}
				break;
				
				case 3:
					System.out.println("------YOUR CART-------");
					if(cart.isEmpty()){
						System.out.println("CART IS EMPTY");
					}else {
					double total=0;
	for(Cartitem  item:cart){
		double subtotal=item.product.price*item.quantity;
		System.out.println(item.product.name + "---> $" + item.product.price + "| QUANTITY - " + item.quantity + "| SUBTOTAL - $" + subtotal);
		total += subtotal;
	}
	System.out.println("TOTAL BILL : $" + total);
                    }
				break;

				case 4:
					System.out.println("---------REMOVE PRODUCT--------");
					if(cart.isEmpty()){
						System.out.println("YOUR CART IS EMPTY");
					} else{
						System.out.println("ENTER THE PRODUCT ID TO REMOVE : ");
						if(!sc.hasNextInt()){
						System.out.println("INVALID PRODUCT ID ! PLEASE ENTER A NUMBER");
						sc.next();
						break;
						}
		int removeid=sc.nextInt();

		Cartitem removeitem=null;
		for(Cartitem item:cart){
			if(item.product.id==removeid){
				removeitem=item;
				break;
			}
		}
		if(removeitem==null){
			System.out.println("PRODUCT NOT FOUND IN CART ");
		} else {
			removeitem.product.stock +=removeitem.quantity;
			cart.remove(removeitem);
			System.out.println("PRODUCT REMOVED SUCCESSFULLY");
		}
					}
				break;

				case 5:
					System.out.println("---------CHECKOUT---------");
					if(cart.isEmpty()){
						System.out.println("YOUR CART IS EMPTY");
					} else{
					double total=0;
	for(Cartitem  item:cart){
		double subtotal=item.product.price*item.quantity;
		System.out.println(item.product.name + "---> $" + item.product.price + "| QUANTITY - " + item.quantity + "| SUBTOTAL - $" + subtotal);
		total += subtotal;
	}

	double discount =  0;
	if (total>=3000){
		discount = 10;
	} else if(total >=1000 && total<3000){
		discount = 5;
	} else {
		discount =0;
	}
	double DiscountAmount = total*discount/100;
	double Finalbill = total - DiscountAmount;
	 System.out.println("ORIGINAL BILL : $" + total);
	 System.out.println("DISCOUNT RATE - " + discount + "%");
	 System.out.println("DISCOUNT AMOUNT : $" + DiscountAmount);
	 System.out.println("FINAL BILL : $" + Finalbill);

	 cart.clear();
	 choice=0;
	 System.out.println("SHOPPING COMPLETED SUCCESSFULLY");
	 System.out.println("THANK YOU FOR SHOPPING!");

					}
				break;

				case 0:
					System.out.println("THANK YOU!");
				break;
				
				default:
					System.out.println("INVALID CHOICE");
			}
		} while (choice!=0);

	 sc.close();
	}
}
class Product{
	int id;
	String name;
	double price;
	int stock;

	Product(int id,String name,double price,int stock){
		this.id=id;
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
}
class Cartitem{
	Product product;
	int quantity;

	Cartitem(Product product,int quantity){
		this.product=product;
		this.quantity=quantity;
	}
}