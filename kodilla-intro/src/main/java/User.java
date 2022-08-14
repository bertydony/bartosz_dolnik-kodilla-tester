public class User {
    public String name;
    public int age;

        public User(String name, int age){
            this.name=name;
            this.age=age;
    }
        public static void main(String []args) {
            User bartek = new User("Bartek", 24);
            User marcin = new User("Marcin", 50);
            User kasia = new User("Kasia", 37);
            User krzysio = new User("Krzysio", 45);
            User rafal = new User("Rafal", 35);

            User[] users = {bartek, marcin, kasia, krzysio, rafal};
        }



}
