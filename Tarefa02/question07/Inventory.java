package introducaoaoo.question07;

public class Inventory {
    private Product[] products;
    private int[] amount;


    public Inventory(){
        products = new Product[100];
        amount = new int[100];
        for (int i=0; i<100; i++){
            this.products[i] = null;
            this.amount[i] = 0;
        }

    }



    public void addProduct(String name, double price, int amount1){
        for (int i=0; i < products.length; i++){
            if(products[i] == null){
                products[i] = new Product(name, price);
                amount[i]+=amount1;
                break;
            }
            else if ((products[i].getName()).equals(name)){
                amount[i]+=amount1;
                break;
            }else if (i == (products.length-1)){
                System.out.println("Full inventory");
            }
        }
    }

    public void productSold(String name, int amount1){
        for (int i=0; i< products.length; i++){
            if (products[i] == null){
                continue;
            }
            else if (products[i].getName().equals(name)){
                if (amount[i] < amount1){
                    System.out.println("We don't have the desired quantity");
                    break;
                }else if(amount[i] == 0){
                    System.out.println("Missing product");
                    break;
                }else{
                    amount[i] -= amount1;
                    System.out.println("Updated inventory");
                    break;
                }
            }else if(i==(products.length-1)){
                System.out.println("Product not registered in the inventory");
            }
        }
    }
}
