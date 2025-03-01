public class casting {
    // convert one type to another type 
    public static void main (String[] args){
         // this is implicit casting in whhich we add int in boolean 
        double price = 100.00;
        double finialprice = price + 18;
        System.out.println(finialprice);

        // explicit casting in which we add boolean in int with datatype change
        int price1 = 100;
        int pricefinial=price1 + (int) 18.89;
        System.out.println(pricefinial);
    }
}
