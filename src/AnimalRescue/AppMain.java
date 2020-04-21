package AnimalRescue;

public class    AppMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println(myDog.nume);

        MancareDeAnimale food= new MancareDeAnimale();
        System.out.println(food.Pret);

        MedicVeterinar veterinar = new MedicVeterinar();

        System.out.println(veterinar.Specialiare);

        Adoptator Adoptator = new Adoptator();
        System.out.println(Adoptator.Name);

        ActivitateDeRecreere ActRecr =new ActivitateDeRecreere();

        System.out.println(ActRecr.Nume);

    }



}
