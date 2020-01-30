package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD movie = new DVD("Gone with the Wind");
        CD song = new CD("Bohemian Rhapsody");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        movie.scratchDisc();
        movie.getNumScratches();

        System.out.println();
        System.out.println(movie.readCapacity(650));
        movie.spinDisc();
        System.out.println(movie.readCapacity(650));

        song.spinDisc();
        System.out.println(song.writeData("Mama, just killed a man\n" +
                "Put a gun against his head\n" +
                "Pulled my trigger, now he's dead\n" +
                "Mama, life had just begun\n" +
                "But now I've gone and thrown it all away\n" +
                "Mama, ooh\n" +
                "Didn't mean to make you cry\n" +
                "If I'm not back again this time tomorrow\n" +
                "Carry on, carry on\n" +
                "As if nothing really matters\n" +
                "Too late, my time has come\n" +
                "Sends shivers down my spine\n" +
                "Body's aching all the time\n" +
                "Goodbye everybody, I've got to go\n" +
                "Gotta leave you all behind and face the truth\n" +
                "Mama, ooh\n" +
                "I don't want to die\n" +
                "I sometimes wish I'd never been born at all", 780, 36000));
        System.out.println(song.readData(780));
        System.out.println(song.writeData("That's the end of the song.", 540, 200));
        System.out.println(song.readData(780));
        song.stopDisc();
    }
}
