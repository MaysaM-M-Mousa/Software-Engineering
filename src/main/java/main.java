import javax.swing.*;
import java.util.ArrayList;
import javax.swing.*;
public class main {
    public static void main(String[] args) {

        ArrayList<Fruit> myList = getData();
        String report=getReport(myList);
        JTextArea area=new JTextArea(report);

        JOptionPane.showMessageDialog(null,new JScrollPane(area),"Purchases Report",
                JOptionPane.INFORMATION_MESSAGE);

    }

    // to get a copy of report
    public static String getReport(ArrayList<Fruit>list){
        String result="";
        result+="You Bought The Following Fruits!\n\n";
        result+=String.format("%s %40s %n","Fruit:","price:");
        result+="---------------------------------------------\n";

        for(Fruit fruit:list)
            result+=rightPad(fruit.getName(),13)+"\t"+leftPad(String.valueOf(fruit.getPrice()),20)+"\n";

        return result;
    }

    // to get a data list
    public static ArrayList<Fruit> getData(){

        Fruit f1=new Fruit("Banana",40);
        Fruit f2=new Fruit("Apple",20);
        Fruit f3=new Fruit("Mango",50);
        Fruit f4=new Fruit("Tangerine",10);
        Fruit f5=new Fruit("cherry",60);

        ArrayList<Fruit>list =new ArrayList<Fruit>();

        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);

        return list;

    }
    // left padding for the string
    public static String leftPad(String text, int length) {
        return String.format("%" + length + "." + length + "s", text);
    }
    // right padding for the string
    public static String rightPad(String text, int length) {
        return String.format("%-" + length + "." + length + "s", text);
    }
}
