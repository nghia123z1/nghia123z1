import java.util.ArrayList;
public class App16{
    
    public static void main (String [] args){
    ArrayList<String> arrListString = new ArrayList<>();
    arrListString.add(1,"JAVA");
    arrListString.add(2,"PHP");
    arrListString.add(3,"C#");
    arrListString.add(4,"C++");

    System.out.println("Các phần tử có trong ArrayList là:");
    for(int i = 0; i < arrListString.size () ; i++ ){
        System.out.print(arrListString.get(i) +"\t");
    }
}
}
