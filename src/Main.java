new package tema;


        import com.tema.entity.Meniu;
        import com.tema.entity.Salate;
        import com.tema.entity.Desert;

public class Main {
    public static void main(String[] args) {

        Meniu menu1 = new Meniu();
        Salate salad1 = new Salate("Salata Caesar", salad1);
        System.out.println(salad1);

        Meniu menu2 = new Meniu();
        Salate salad2 = new Salate("Salata Bulgareasca", salad2);
        System.out.println(salad2);

        Desert desert1 = new Desert();
        Desert desert1_salad1 = (Desert) new Salate(desert1.getId()),
                desert1.getName();
                desert1.getPret();
        char desert1_salate1;
        System.out.println(desert1_salate1);


        desert1_salad1.setPretProdus(34);
        System.out.println(desert1_salad1);

        desert1_salad1.comandaMancarea();


    }

}