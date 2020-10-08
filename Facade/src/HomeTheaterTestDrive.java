import submodules.DvdPlayer;
import submodules.PopcornPopper;
import submodules.Screen;
import submodules.TheaterLights;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new DvdPlayer(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );

        homeTheater.watchMovie("The Dark Knight");
        homeTheater.endMovie();
    }
}
