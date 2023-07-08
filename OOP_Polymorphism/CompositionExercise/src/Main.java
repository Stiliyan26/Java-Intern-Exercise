public class Main {
    public static void main(String[] args) {
        Refrigerator refregiratior = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(false);

        SmartKitchen smartKitchen = new SmartKitchen(refregiratior, dishWasher, coffeeMaker);

        if (!smartKitchen.getRefrigerator().isHasWorkToDo()){
            smartKitchen.pourMilk();
        }
        if (!smartKitchen.getCoffeeMaker().isHasWorkToDo()){
            smartKitchen.addWater();
        }
        if (!smartKitchen.getDishWasher().isHasWorkToDo()){
            smartKitchen.loadDishwasher();
        }

        System.out.println(refregiratior.isHasWorkToDo());
        System.out.println(smartKitchen.getRefrigerator().isHasWorkToDo());
    }
}