public class Person {
    private String name;
    private String phoneNumber; // variabler

    public Person(){  // konstruktör
        this.name = "---";
        this.phoneNumber = "---";
    }

    public Person(String name, String phoneNumber){ // konstruktör
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void print(){
        System.out.println("name: " + this.name + " Phone: " + this.phoneNumber);
    }

    public String toString(){  //gör System.out.println möjlig och omvandlar den till string
       return "name: " + this.name + " Phone: " + this.phoneNumber;
    }

}
