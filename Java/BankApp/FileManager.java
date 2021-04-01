//Erik Hellman
//2021-03-30

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;


public class FileManager {

    public ArrayList<Account> readFile() {
        ArrayList<Account> incoming = new ArrayList<>();
        try (BufferedReader br = new BufferedReader((new FileReader(getPathToTxtFilesFolder())))) {
            while (br.ready()) {
                String nextLine = br.readLine();
                String[] splitLine = nextLine.split("/!DELIMITER!/");
                incoming.add(new Account(splitLine[0], splitLine[1]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return incoming;
    }

    public void writeToFile(ArrayList<Account> accounts) {
        String toSend = "";
        for(Account x : accounts){
            toSend = toSend + x.getUsername() + "/!DELIMITER!/" + x.getPassword() + "\n";
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(getPathToTxtFilesFolder())));
            writer.write(toSend);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getPathToTxtFilesFolder() {
        String standardPath = System.getProperty("user.dir");
        String completePath = standardPath + "\\databas.txt";
        return completePath;
    }
}
