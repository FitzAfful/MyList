public class App {

    public static void main(String[] args){
        MyList myList = new MyList();
        myList.add("Gerald");
        myList.add("Lash");
        myList.add("Saeed");
        myList.add("Saeed");
        myList.add("Saeed");
        myList.add("Saeed");

        System.out.println(myList.toString());
        System.out.println(myList.get(0));
    }
}
