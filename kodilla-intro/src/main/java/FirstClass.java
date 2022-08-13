public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2000, 2020);
        System.out.println("Waga: " + notebook.weight + " " + "Cena: " +  notebook.price + " " + "Rok produkcji: " +  notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook (2000, 1500, 2015);
        System.out.println("Waga: " + heavyNotebook.weight + " " + "Cena: " +  heavyNotebook.price + " " + "Rok produkcji: " +  heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook (1600, 500,2002);
        System.out.println("Waga: " + oldNotebook.weight + " " + "Cena: " +  oldNotebook.price + " " + "Rok produkcji: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();


        }
    }
