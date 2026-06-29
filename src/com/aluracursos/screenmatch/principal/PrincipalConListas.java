package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
  public   static void main(String[] args) {


      Pelicula miPelicula = new Pelicula("Encanto",2021);
      miPelicula.evalua(9);

      Pelicula otraPelicula = new Pelicula("Matrix",1999);
      otraPelicula.evalua(7);

      var peliculaDeBruno= new Pelicula("El señor de los anillos",2001);
      peliculaDeBruno.evalua(10);

      Serie casaDragon = new Serie("La casa del Dragon 2",2022);


      ArrayList<Titulo> lista = new ArrayList<>();
      lista.add(miPelicula);
      lista.add(otraPelicula);
      lista.add(peliculaDeBruno);
      lista.add(casaDragon);

      for (Titulo item:lista){
          System.out.println(item.getNombre());

          if(item instanceof Pelicula pelicula && pelicula.getClasificacion()>2 ){
              System.out.println(pelicula.getClasificacion());
          }

      }

      List<String> listaDeArtistas = new ArrayList<>();
      listaDeArtistas.add("Penelope Cruz");
      listaDeArtistas.add("Antonio Banderas");
      listaDeArtistas.add("Ricardo Darin");
      System.out.println("Lista no ordenada de Artistas:"+listaDeArtistas);

      Collections.sort(listaDeArtistas);
      System.out.println("Lista Ordenada de Artistas:"+listaDeArtistas);

      Collections.sort(lista);
      System.out.println("Lista de Titulos Ordenados:"+lista);

        //Utilice compararing con camparator para una lista ordenada a mi criterio (personalizado)
      lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
      System.out.println("Lista ordenada por Fecha"+lista);


    }

}
