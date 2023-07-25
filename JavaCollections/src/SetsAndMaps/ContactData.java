package SetsAndMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String phoneData = """
            Kiril Romanski, 1234567891,
            Stiliyan Nikolov, 5214537851
            Peter Gerdjikov, 1224564814
            """;

    private static final String emailData = """
            Kiril Romanski, kiro@abv.bg,
            Stiliyan Nikolov, stili@abv.bg
            Peter Gerdjikov, pepi.@abv.bg
            """;

    public static List<Contact> getData(String type){
        List<Contact> dataList = new ArrayList<>();
        Scanner scanner = new Scanner(type.equals("phone")
                ? phoneData
                : emailData);

        while(scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);

            if (type.equals("phone")){
                dataList.add(new Contact(data[0], Long.parseLong(data[1])));
            }
        }
        return dataList;
    }
}
