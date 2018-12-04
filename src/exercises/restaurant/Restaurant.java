package exercises.restaurant;

public class Restaurant {
    public static void main(String[] args){

        MenuItem burger = new MenuItem("Burger", 8.99,"1lb patty", Category.MainCourse, false);
        MenuItem salad = new MenuItem("Burger", 8.99,"1lb patty", Category.MainCourse, false);
        Menu menu = new Menu();
        menu.addItem(burger);
        //menu.removeItem(burger);
        //boolean test = burger.equals(salad);

        //System.out.println(test);
        System.out.println(menu);
        System.out.println(burger);

        }
        }
