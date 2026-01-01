import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        System.out.println("++++++++++++++++++++++++++++++++++++++++ ");

        Serie casaDragon = new Serie("La casa del Dragon",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEspisodio(50);
        casaDragon.setEspisodioPorTemeporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1999);
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


        var peliculaDeBruno= new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de lista:"+ listaDePeliculas.size());
        System.out.println("La primera pelicula es:"+listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);
        System.out.println("toString de la Pelicula:"+listaDePeliculas.get(0).toString());


    }










        //Cuando no usamos set , las varibles no usan encapsulamiento
        // Pelicula otraPelicula = new Pelicula();
        // otraPelicula.nombre = "Matrix";
        // otraPelicula.fechaDeLanzamiento = 1999;
        // otraPelicula.duracionEnMinutos = 180;
        // otraPelicula.muestraFichaTecnica();

        /* ++++++++++++++++++++++++++++++++++++++++   */

    }

