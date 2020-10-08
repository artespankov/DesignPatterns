import submodules.DvdPlayer;
import submodules.PopcornPopper;
import submodules.Screen;
import submodules.TheaterLights;

public class HomeTheaterFacade {
    DvdPlayer dvd;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    // Union all required subsystems
    public HomeTheaterFacade(DvdPlayer dvd, TheaterLights lights, Screen screen, PopcornPopper popper){
        this.dvd = dvd;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    // Define simplified high-level functionality
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a Movie");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        // anything need to finish the movie night
    }
}
