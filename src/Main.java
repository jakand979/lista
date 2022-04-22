import java.util.HashMap;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.lang.Character;

public class Main {
    public static void readList(HashSet<String> categories, HashMap<String, Integer> shoppingList) {

    }
    public static void main(String[] args) {
        HashSet<String> categories = new HashSet<>();
        HashMap<String, Integer> shoppingList = new HashMap<>();
        try {
            File readingObj = new File("C:\\Users\\jakan\\OneDrive\\Desktop\\studia\\src");
            System.out.println(readingObj.exists());
            Scanner myReader = new Scanner(readingObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                if(Character.isUpperCase(data.charAt(0))){
                    categories.add(data);
                }
                else{
                    shoppingList.put(data,0);
                }
            }
            myReader.close();
        }
        catch(FileNotFoundException except){
            System.out.println("File not found!");
            except.printStackTrace();
        }
        System.out.println(categories);
        System.out.println(shoppingList);

    }

    public void writeList(){};
}
