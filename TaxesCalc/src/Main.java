import java.io.FileNotFoundException;


class Main {

    public static void main(String[] args) {

        final String fileName = "listapodatkow.csv";
        try {
            Player[] players = PlayerDataReader.readFile(fileName);
            //         printTaxesDifference(players);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + fileName);
        }


    }





        }



