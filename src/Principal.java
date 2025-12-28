import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        System.out.println("++++++++++++++++++++++++++++++++++++++++ ");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEspisodio(50);
        casaDragon.setEspisodioPorTemeporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tempo necesario para ver tus peliculas:"+ calculadora.getTiempoTotal() + "min") ;

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(400);
        filtroRecomendacion.filtra(episodio);





    }










        //Cuando no usamos set , las varibles no usan encapsulamiento
        // Pelicula otraPelicula = new Pelicula();
        // otraPelicula.nombre = "Matrix";
        // otraPelicula.fechaDeLanzamiento = 1999;
        // otraPelicula.duracionEnMinutos = 180;
        // otraPelicula.muestraFichaTecnica();

        /* ++++++++++++++++++++++++++++++++++++++++   */

    }

