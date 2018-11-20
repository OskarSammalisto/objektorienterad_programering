public class Main {

    public static void main(String[] args) {
// Måste kunna dom här!!!!
// Klass, Instans, Objekt, Instansvariabel, Klassvariabel(static), Konstruktör, this,


        Account savings = new Account(3000);
        Account salary = new Account();

        savings.deposit(300);
        salary.deposit(1000);

        System.out.println(savings.getBalance());
        System.out.println(salary.getBalance());

        System.out.println(Account.nrAccounts);

    //Person person1 = new Person();
	//Person person2 = new Person("susan", "12345");

	//System.out.println(person1);
    //System.out.println(person1); // skriver ut Klassens plats i minnet och inte dess innehåll innan en klass omvandlar den till streng
	//person1.print();
	//person2.print();


	//System.out.println(person1.name);
	//person1.name = "david";


    }
}
