public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        Notebook oldNotebook = new Notebook(1600, 500, 2002);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
    }
    private static void notebookParameters(Notebook notebook) {
        System.out.println("Waga: " + notebook.weight + " " + "Cena: " + notebook.price + " " + "Rok produkcji: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();
    }
}