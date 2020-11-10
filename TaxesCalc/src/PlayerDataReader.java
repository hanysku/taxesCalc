import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PlayerDataReader {
    static Player[] readFile(String fileName) throws FileNotFoundException {
        final int linesNumber = countLinesWithoutHeader(fileName);
        Player[] players = new Player[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            for (int i = 0; i < players.length; i++) {
                String csvLine = scanner.nextLine();
                players[i] = createPlayerFromCsV(csvLine);

            }
            return players;
        }
    }



    private static Player createPlayerFromCsV(String csvLine) {
        String[] data = csvLine.split(",");
        int Ranga = Integer.parseInt(data[0]);
        String Gracz = data[1];
        String RangaGildi = data[2];
        int Ilość = Integer.parseInt(data[3]);
        return new Player(Ranga, Gracz, RangaGildi, Ilość);


    }


    private static int countLinesWithoutHeader(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }

}
