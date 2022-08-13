public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight=weight;
        this.price=price;
        this.year=year;
    }
    public void checkPrice(){
        if(this.price < 600){
            System.out.println("This notebook is very cheap");
        } else if(this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        }else{
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight(){
        if(this.weight <= 600){
            System.out.println("This notebook is light");
        } else if(this.weight > 600 && this.weight <= 2000) {
            System.out.println("This notebook is not too heavy");
        }else{
            System.out.println("This notebook is heavy");
        }
    }
    public void checkPriceAndYear() {
        if (this.price > 1800 && this.year >= 2020) {
            System.out.println("This notebook is a newer generation");
        } else if (this.price <= 1000 && this.year <= 2015) {
            System.out.println("This notebook is probably old");
        } else {
            System.out.println("This notebook is very old");
        }
    }
}
